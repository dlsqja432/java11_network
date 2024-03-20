package sec3;

import java.net.InetAddress;
import java.net.Socket;

public class Test4client {

	public static void main(String[] args) {
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();
//			Socket 객체를 생성할 때, 서버의 ip주소와 port번호를 넣고 생성해야 연결가능한데, 넣지않음.
			Socket s = new Socket(ip, 3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
