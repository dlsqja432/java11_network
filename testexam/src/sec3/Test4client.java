package sec3;

import java.net.InetAddress;
import java.net.Socket;

public class Test4client {

	public static void main(String[] args) {
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();
//			Socket 객체를 생성할 때, 서버소켓의 ip주소와 port번호가 지정되지 않아 소켓통신을 할 수 없다.
			Socket s = new Socket(ip, 3000);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}	
}
