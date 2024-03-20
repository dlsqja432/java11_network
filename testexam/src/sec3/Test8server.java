package sec3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test8server {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;
		ServerSocket server = null;
		try {
//			ServerSocket의 포트번호가 잘못됨
			server = new ServerSocket(8888);
			System.out.println("[Server]");
			System.out.println("클라이언트의 요청을 기다리고 있습니다...");
//			socket 객체로 클라이언트 소켓과 연결해야 하는데, 코드가 빠져있음
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결요청");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
