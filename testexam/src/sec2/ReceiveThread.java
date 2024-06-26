package sec2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReceiveThread extends Thread {
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
	Socket socket = null;
	BufferedReader in = null;
	PrintWriter out = null;
	
	public ReceiveThread(Socket socket) {
		this.socket = socket;
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			list.add(out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		String name = "";
		try {
			name = in.readLine();
			System.out.println("[" + name + " 새 연결 생성]");
			sendAll("[" + name + "] 님이 들어오셨습니다.");
			
			while(in != null) {
				String inMsg = in.readLine();
				if(inMsg.equals("quit")) break;
				sendAll(name + " >> " + inMsg);
			}
		} catch (IOException e) {
			System.out.println("[" + name + "접속 끊김");
		} finally {
			sendAll("[" + name + "] 님이 나가셨습니다.");
			list.remove(out);
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("[" + name + " 연결 종료]");
	}

	private void sendAll(String s) {
		for(PrintWriter out : list) {
			out.println(s);
			out.flush();
		}
	}
}
