package sec3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Test6server {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;
		Socket socket = null;
//		서버의 port번호는 3000이어야 하는데, 3333으로 되어있음
		int port = 3333;
		String serverIP = "127.0.0.1";
		ServerSocket server = null;
		try {
//			ServerSocket을 생성할 때는 생성자의 매개변수로 port번호만 들어가는데, ip와 port번호 두개를 넣음
			server = new ServerSocket(port);
			System.out.println("[Server]");
			System.out.println("클라이언트의 요청을 기다리고 있습니다...");
//			서버 소켓에서 클라이언트의 연결을 기다리는 코드가 빠져있어, 클라이언트와 통신을 할 수 없음.
			socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결요청");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
