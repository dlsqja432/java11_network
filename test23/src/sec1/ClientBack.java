package sec1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class ClientBack extends Thread {
	private String NickName, IPAddress;
	private int Port;
	private Socket socket;
	private String Message;
	private DataInputStream in;
	private DataOutputStream out;
	private ChatClientGUI chatGui;
	ArrayList<String> NickNameList = new ArrayList<String>();	// 유저 목록을 저장합니다.
	
	public void getUserInfo(String NickName, String IPAddress, int Port) {
		this.NickName = NickName;
		this.IPAddress = IPAddress;
		this.Port = Port;
	}
	
	public void setGui(ChatClientGUI chatGui) {
		this.chatGui = chatGui;
	}

	@Override
	public void run() {
		try {
			socket = new Socket(IPAddress, Port);
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
			out.writeUTF(NickName);
			while(in != null) {
				Message = in.readUTF();
				if(Message.contains("+++닉네임의시작+++")) {
					chatGui.userList.setText(null);
					NickNameList.add(Message.substring(12));
					chatGui.appendUserList(NickNameList);
				} else if (Message.contains("님이 입장하셨습니다.\n")) {
					NickNameList.clear();
					chatGui.userList.setText(null);
					chatGui.appendMessage(Message);
				} else if (Message.contains("님이 퇴장하셨습니다.\n")) {
					NickNameList.clear();
					chatGui.userList.setText(null);
					chatGui.appendMessage(Message);
				} else {
					chatGui.appendMessage(Message);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void transmit(String Message) {
		try {
			out.writeUTF(Message);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
