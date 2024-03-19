package sec1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class LoginGUI extends JFrame implements ActionListener {
	JPanel login_GUIPanel = new JPanel();
	JLabel nicName_Label = new JLabel("유저 입력");
	JLabel port_Label = new JLabel("포트 번호");
	JLabel ipAddress_Label = new JLabel("주소 입력");
	JTextField nickName_Text = new JTextField(20);
	JTextField port_Text = new JTextField("####",20);
	JTextField ipAddress_Text = new JTextField("###.###.###.###",20);
	JButton login_GUI_Button = new JButton("접속");
	
	public LoginGUI() {
		// GUI 화면 구현
		setTitle("로그인 화면");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		setResizable(true);
		
		login_GUIPanel.setBackground(Color.getHSBColor(56, 100, 94));
		login_GUI_Button.setPreferredSize(new Dimension(250,50));
		login_GUI_Button.addActionListener(this);
		login_GUIPanel.add(nicName_Label);
		login_GUIPanel.add(nickName_Text);
		login_GUIPanel.add(port_Label);
		login_GUIPanel.add(port_Text);
		login_GUIPanel.add(ipAddress_Label);
		login_GUIPanel.add(ipAddress_Text);
		login_GUIPanel.add(login_GUI_Button);
		add(login_GUIPanel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			// 접속버튼을 늘렀을 때 닉네임, 아이피, 포트번호 값을 받아서 ChatClientGUI 생성
			if(e.getSource() == login_GUI_Button) {
				String nick = nickName_Text.getText().trim();
				String ip = ipAddress_Text.getText().trim();
				int port = Integer.parseInt(port_Text.getText().trim());
				new ChatClientGUI(nick, ip, port);
				setVisible(false);
			}
		} catch (Exception ex) {
			// 만약 올바르지 않는 값이 입력되면 팝업 창을 띄워줍니다.
			JOptionPane.showMessageDialog(null, "올바르지 않은 입력입니다");
		}
	}
}

class ChatClientGUI extends JFrame implements ActionListener, KeyListener {
	String nickName;
	JPanel clientGUIPanel = new JPanel();
	JLabel userLabel = new JLabel("유저 목록");
	JLabel user = new JLabel(nickName);
	JTextField chat = new JTextField(45);
	JButton enter = new JButton("전송");
	TextArea chatList = new TextArea(30, 50);
	TextArea userList = new TextArea(30, 15);
	ClientBack cb = new ClientBack();
	
	// 클라이언트 채팅창 화면 구현
	public ChatClientGUI(String nickName, String ipAddress ,int port) {
		this.nickName = nickName;
		
		setTitle("클라이언트 창");
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(720,620);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		chatList.setFont(new Font("Arial", Font.PLAIN, 15));
		chatList.setBackground(new Color(204,255,255));
		userList.setFont(new Font("Arial", Font.PLAIN, 15));
		userList.setBackground(new Color(204,255,255));
		
		chatList.setEditable(false);
		userList.setEditable(false);
		chat.addKeyListener(this);
		enter.addActionListener(this);
		
		clientGUIPanel.setBackground(Color.getHSBColor(56, 100, 94));
		clientGUIPanel.add(user);
		clientGUIPanel.add(chatList);
		clientGUIPanel.add(userLabel);
		clientGUIPanel.add(userList);
		clientGUIPanel.add(chat);
		clientGUIPanel.add(enter);
		add(clientGUIPanel);
		cb.setGui(this);
		cb.getUserInfo(nickName, ipAddress, port);
		cb.start(); // 채팅창이 켜짐과 동시에 접속을 실행해준다.
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		String message = chat.getText().trim();
		if(e.getKeyCode() == KeyEvent.VK_ENTER && message.length() > 0) {
			cb.transmit(nickName + " : " + message + "\n");
			chat.setText(null);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String message = chat.getText().trim();
		if(e.getSource() == enter && message.length()>0) {
			cb.transmit(nickName + " : " + message + "\n");
			chat.setText(null);
		}
	}
	
	public void appendMessage(String Message) {
		chatList.append(Message);
	}
	
	public void appendUserList(ArrayList<String> nickName) {
		// 유저 목록을 유저리스트에 띄워 줍니다.
		String name;
		userList.setText(null);
		for(int i=0; i<nickName.size(); i++) {
			name = (String) nickName.get(i);
			userList.append(name + "\n");
		}
	}
}

public class GUIClient {

	public static void main(String[] args) {
		new LoginGUI();
	}
}
