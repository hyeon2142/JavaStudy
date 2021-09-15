package echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	private static final int PORT = 6000;

	public static void main(String[] args) {

		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("0.0.0.0", 6000));
			log("starts... [port:" + PORT + "]");
			Socket socket = serverSocket.accept();
			// socket.getInputStream();

			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

				while (true) {
					String data = br.readLine();
					if (data == null) {
						log("closed by client");
						break;
					}
					
					log("received:" + data);
					pw.println(data);
				}
				
				

			} catch (IOException e) {
				log("error:" + e);

			} finally {
				try {
					if (socket != null && socket.isClosed() == false) {
						socket.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		} catch (IOException e) {
			log("error: " + e);
		} finally {

			if (serverSocket != null && serverSocket.isClosed() == false) {
				try {
					if (serverSocket != null && serverSocket.isClosed() == false) {
						serverSocket.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static void log(String log) {
		System.out.println("[EchoServer] " + log);
	}

}
