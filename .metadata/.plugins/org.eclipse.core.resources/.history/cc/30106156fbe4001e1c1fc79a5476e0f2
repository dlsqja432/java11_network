package sec1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class LoginGUI extends JFrame implements ActionListener {
	JPanel port_log = new JPanel();
	JLabel port_user = new JLabel("유저 입력");
	JLabel port_warn = new JLabel("포트 번호");
	JLabel port_addr = new JLabel("주소 입력");
	JTextField port_num1 = new JTextField(20);
	JTextField port_num2 = new JTextField("####",20);
	JTextField port_num3 = new JTextField("###.###.###.###",20);
	JButton port_btn = new JButton("접속");
	
	public LoginGUI() {
		setTitle("로그인 화면");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		setResizable(true);
		
		port_btn.addActionListener(this);
		port_log.add(port_user);
		port_log.add(port_num1);
		port_log.add(port_warn);
		port_log.add(port_num2);
		port_log.add(port_addr);
		port_log.add(port_num3);
		port_btn.setPreferredSize(new Dimension(250,50));
		port_log.add(port_btn);
		
		add(port_log);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}

public class GUIClient {

	public static void main(String[] args) {
		new LoginGUI();
	}
}
