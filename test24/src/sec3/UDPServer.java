package sec3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String[] args) {
		DatagramSocket socket = null;
		DatagramPacket packet = null;
		int port = 7021;
		try {
			socket = new DatagramSocket(port);
			while(true) {
				byte[] buffer = new byte[512];
				
				// 수신
				packet = new DatagramPacket(buffer, buffer.length);
				System.out.println("ready");
				socket.receive(packet);	// 수신 데이터 패킷 싣기
				String receiveData = new String(packet.getData());	// 패킷(byte) 데이터 => String으로 형변환
				System.out.println("수신 데이터 : " + receiveData);
				
				InetAddress ip = packet.getAddress();
				port = packet.getPort();
				System.out.println("[Client IP Address] : " + ip);
				System.out.println("[Client Port Number] : " + port);
				
				// 송신(발신)
				packet = new DatagramPacket(packet.getData(), packet.getData().length, ip, port);
				socket.send(packet);	// 송신 데이터 패킷 실어 보내기
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
