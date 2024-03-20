package sec3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Test7client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;
		Socket socket = null;
//		서버의 port번호가 8888이므로 port번호가 달라 오류 발생
		int port = 8000;
		
		try {
			socket = new Socket("localhost", port);
//			socket이 null일 때만 if문안의 코드가 동작하기 때문에 if문안의 코드가 실행되지 않고 끝남
			if(socket != null) {
				System.out.println("[Client]");
				System.out.println("서버와 연결 성공!");
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
