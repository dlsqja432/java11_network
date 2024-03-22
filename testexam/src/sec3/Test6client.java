package sec3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Test6client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;
		Socket socket = null;
		int port = 3000;
		
//		클라이언트의 socket을 생성할 때는 서버의 ip주소와 port번호를 넣어야하는데, port번호만 들어감
//		Client 클래스의 socket = new Socket("127.0.0.1", port); 문장에서 서버의 IP주소가
//		사용되지 않았으므로 통신할 수 없다.
		try {
			socket = new Socket("127.0.0.1", port);
			if(socket != null) {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
