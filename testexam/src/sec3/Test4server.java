package sec3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Test4server {

	public static void main(String[] args) {
		try {
//			Server 클래스의 객체생성에서 서버의 포트번호를 지정하지 않았으므로 ServerSocket이 생성되지 못하므로
//			통신 할 수 없다.
			ServerSocket server = new ServerSocket(3000);
			Socket s = server.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
