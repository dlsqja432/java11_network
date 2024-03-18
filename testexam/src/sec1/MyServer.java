package sec1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {

	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		
		ServerSocket server = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			server = new ServerSocket(6123);
			System.out.println("[Server 실행] : Client 연결 대기 중입니다.");
			socket = server.accept();
			System.out.println("[Client 연결]");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String inMsg = in.readLine();
				if(inMsg.equalsIgnoreCase("quit")) break;
				System.out.println("[From Client : " + inMsg + "]");
				
				System.out.print("server에서 client로 전송 : ");
				String outMsg = sc.nextLine();
				out.println(outMsg);
				out.flush();
				if(outMsg.equalsIgnoreCase("quit")) break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				sc.close();
				socket.close();
				server.close();
				System.out.println("연결 종료");
			} catch (IOException e) {
				System.out.println("소켓 통신 종료 오류");
				e.printStackTrace();
			}
		}
	}
}
