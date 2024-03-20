package sec2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		Socket socket = null;
		
		BufferedReader in = null;
		PrintWriter out = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 6000);
			System.out.println("[서버 접속]");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				System.out.print("[Send message to Server] : ");
				String outMsg = sc.nextLine();
				out.println(outMsg);
				out.flush();
				if("quit".equalsIgnoreCase(outMsg)) break;
				
				String inMsg = in.readLine();
				System.out.println("[From Server] : " + inMsg);
				if("quit".equalsIgnoreCase(inMsg)) break;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[클라이언트 소켓 통신 오류]");
		}  finally {
			try {
				sc.close();
				socket.close();
				System.out.println("[클라이언트 소켓 연결 종료]");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("[소켓 연결 종료 오류]");
			}
		}
	}
}

