package sec2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {

	public static void main(String[] args) {
		MultiServer multiServer = new MultiServer();
		multiServer.start();
	}
	
	public void start() {
		ServerSocket server = null;
		Socket socket = null;
		
		try {
			server = new ServerSocket(8124);
			while(true) {
				System.out.println("[클라이언트 연결 대기중]");
				socket = server.accept();
				ReceiveThread receiveThread = new ReceiveThread(socket);
				receiveThread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(server != null) {
				try {
					server.close();
					System.out.println("[서버종료]");
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("[서버소켓통신에러]");
				}
			}
		}
	}
}
