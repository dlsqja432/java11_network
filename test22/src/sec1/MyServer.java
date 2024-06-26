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
			server = new ServerSocket(6012);
			System.out.println("[Server 실행] : Client 연결 대기 중입니다.");
			socket = server.accept();
			System.out.println("[Client 연결]");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String inMsg = in.readLine();
				if("quit".equalsIgnoreCase(inMsg)) break;
				
				System.out.println("[From Client : " + inMsg + "]");
				System.out.print("전송 >> ");
				
				String outMsg = sc.nextLine();
				out.println(outMsg);
				out.flush();
				if("quit".equalsIgnoreCase(outMsg)) break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				sc.close();
				if(socket != null) {
					socket.close();
				}
				if(server != null) {
					server.close();
				}
			} catch(IOException e) {
				e.printStackTrace();;
			}
		}
	}
}
