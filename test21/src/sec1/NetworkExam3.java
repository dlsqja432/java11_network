package sec1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkExam3 {

	public static void main(String[] args) {
		// 본인 컴퓨터의 IP 주소와 컴퓨터 이름 출력
		try {
			InetAddress addr = InetAddress.getLocalHost();
			System.out.println(addr.getHostAddress());
			System.out.println(addr.getHostName());
			InetAddress[] iArr = InetAddress.getAllByName("www.google.com");
			for(InetAddress i : iArr) {
				System.out.println(i.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
