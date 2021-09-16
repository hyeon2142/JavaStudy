package chat;

import java.io.IOException;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {

	public static List<Writer> listWriters = new ArrayList<Writer>();

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		int PORT = 1111;

		try {
			// 1. 서버 소켓 생성
			serverSocket = new ServerSocket();

			// 2. 바인딩

			String hostAddress = InetAddress.getLocalHost().getHostAddress(); // 로컬주소
			serverSocket.bind(new InetSocketAddress(hostAddress, PORT)); // 서버소켓에 서버주소, 포트 바인딩시킴
			log("연결 기다림 " + hostAddress + ":" + PORT);

			while (true) {
				Socket socket = serverSocket.accept(); // 클라이언트의 접속을 기다리도록
				new ChatServerThread(socket, listWriters).start(); // 클라이어트가 접속하면 ChatServerThread를 만들어 실행시킴
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (serverSocket != null && serverSocket.isClosed() == false) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void log(String log) {
		System.out.println("[EchoServer] " + log);
	}

}
