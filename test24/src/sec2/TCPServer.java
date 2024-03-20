package sec2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;	// 서버용
		Socket socket = null;	// 클라이언트용
		Scanner sc = new Scanner(System.in);	// 콘솔창에 메세지 입력
		
		BufferedReader in = null;	// 메시지 읽기
		PrintWriter out = null;		// 메시지 보내기
		
		try {
			serverSocket = new ServerSocket(6000);
			System.out.println("서버포트 : 6000");
			socket = serverSocket.accept();
			System.out.println("[연결 대기]");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			while(true) {
				String inMsg = in.readLine();	// 클라이언트로 부터 온 메세지
				System.out.println("[From Client] : " + inMsg);
				if("quit".equalsIgnoreCase(inMsg)) break;
				
				System.out.print("[Send message to Client] : ");	// 클라이언트로 보낼 메세지 작성
				String outMsg = sc.nextLine();
				out.println(outMsg);	// 송신 객체에 메시지 저장
				out.flush();			// 클라이언트에게 송신 메시지 전달
				if("quit".equalsIgnoreCase(outMsg)) break;
			}
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("[소켓 연결 시작 오류]");
		} finally {
			try {
				sc.close();
				socket.close();
				serverSocket.close();
				System.out.println("[서버 소켓 연결 종료]");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("[소켓 연결 종료 오류]");
			}
		}
	}
}
