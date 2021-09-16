package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

public class ChatClient {

	public static void main(String[] args) {

		Scanner sc = null;
		Socket socket = null;
		BufferedReader reader;
		PrintWriter writer;
		

		try {
			// 1. 키보드 연결
			sc = new Scanner(System.in);
			// 2. socket 생성
			// 3. 연결
			socket = new Socket("59.20.237.22", 1111);

			// 4. reader / writer 생성
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

			// 5. join 프로토콜
			System.out.print("닉네임>>");
			String nickname = sc.nextLine();
			writer.println("join:" + nickname);
			writer.flush();

			// 6. ChatClientReceiveThread 시작
			new ChatClientThread(socket).start();

			// 7. 키보드 입력 처리
			while (true) {
				System.out.print(">>");
				String input = sc.nextLine();

				if ("quit".equals(input) == true) {
					// quit 프로토콜 처리
					writer.println("quit:"+"quit");
					break;
				} else {
					// 메시지 처리
					writer.println("message:"+input);
				}
			}

		} catch (IOException ex) {
			log("error:" + ex);
		} finally {
			try {
				if (sc != null) {
					sc.close();
				}
				if (socket != null && socket.isClosed() == false) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private static void log(String log) {
		System.out.println("[Client] " + log);

	}

}
