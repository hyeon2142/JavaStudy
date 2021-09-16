package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.SocketException;

import echo.EchoServer;

public class ChatClientThread extends Thread {

	private BufferedReader br;
	private Socket socket;

	public ChatClientThread(Socket socket) {
		this.socket = socket;

	}

	@Override
	public void run() {

		try {

			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

			while (true) {
				
					String data = br.readLine();
					if (data == null) {
						EchoServer.log("closed by server");
						break;
					}

					System.out.println(data);

				
			}
		} catch(SocketException e) {
			System.out.println("안녕히가세요");

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
