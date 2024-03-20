package sec3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	private static String receiveData;
	private static BufferedReader file;
	private static int SERVER_PORT = 7020;
	
	public static void main(String[] args) {
		DatagramSocket socket = null;
		DatagramPacket packet = null;
		
		String receiveIP = "localhost";
		try {
			// 송신
			InetAddress ip = InetAddress.getByName(receiveIP);
			socket = new DatagramSocket(SERVER_PORT);
			System.out.println("[Message] : ");
			file = new BufferedReader(new InputStreamReader(System.in));
			receiveData = file.readLine();
			byte[] buffer = receiveData.getBytes();
			packet = new DatagramPacket(buffer, buffer.length, ip, SERVER_PORT);
			socket.send(packet);

			// 수신
			buffer = new byte[512];
			packet = new DatagramPacket(buffer, buffer.length);
			socket.receive(packet);
			System.out.println("[Server IP Address] : " + packet.getAddress());
			System.out.println("[Server Port Number] : " + packet.getPort());
			String transmitData = new String(packet.getData());
			System.out.println("수신된 데이터 : " + transmitData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
