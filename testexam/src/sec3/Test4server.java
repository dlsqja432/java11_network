package sec3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Test4server {

	public static void main(String[] args) {
		try {
//			ServerSocket 객체를 생성할 때 포트번호를 넣지 않고 생성해서 연결 불가
			ServerSocket server = new ServerSocket(3000);
			Socket s = server.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
