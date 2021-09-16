package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;

public class ChatServerThread extends Thread {

	private String nickname;
	private Socket socket;
	private BufferedReader bufferedReader;
	private PrintWriter printWriter;
	private List<Writer> listWriters;

	@Override
	public void run() {

		try {
			// 2. 스트림 얻기
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8")); // 소켓에서 스트림 얻기
			printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true); // 소켓에서 스트림
																											// 얻기

			// 3. 요청 처리
			while (true) {
				String request = bufferedReader.readLine();
				if (request == null) {
					System.out.println(this.nickname + "님이 퇴장 하였습니다.");
					ChatServer.log("클라이언트로 부터 연결 끊김");
					doQuit(printWriter);
					break;
				} else {

					// 4. 프로토콜 분석
					String[] tokens = request.split(":"); // 0번째가 요청명령, 1번째가 파라미터

					if ("join".equals(tokens[0])) {
						doJoin(tokens[1], printWriter);
					} else if ("message".equals(tokens[0])) {
						doMessage(tokens[1]);
					} else if ("quit".equals(tokens[0])) {
						doQuit(printWriter);
					} else {
						ChatServer.log("에러:알수 없는 요청(" + tokens[0] + ")");
					}
				}

			}

		} catch (SocketException e) {

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void doMessage(String string) {
		printWriter.println(this.nickname + ":" + string);
		broadcast(this.nickname + ":" + string);
		System.out.println(this.nickname + ":" + string);
	}

	private void doQuit(Writer writer) {

		String data = nickname + "님이 퇴장 하였습니다.";
		broadcast(data);
		removeWriter(writer);
		System.out.println(data);

	}

	private void removeWriter(Writer writer) {
		synchronized (listWriters) { // 여러 스레드가 하나의 공유 객체에 접근할 때, 동기화를 보장해줌
			listWriters.remove(writer);
		}

	}

	private void doJoin(String nickName, Writer writer) { // 클라이언트가 접속할때 닉네임설정 + LIST에 writer를 등록시켜줌
		this.nickname = nickName;

		String data = nickName + "님이 참여하였습니다.";
		broadcast(data);

		/* writer pool에 저장 */
		addWriter(writer);

		// ack 방 참여에 성공했다는 것을 클라이언트에게 알림
		printWriter.println("join:ok");
		printWriter.flush();
		System.out.println(data);

	}

	private void addWriter(Writer writer) {
		synchronized (listWriters) { // 여러 스레드가 하나의 공유 객체에 접근할 때, 동기화를 보장해줌
			listWriters.add(writer);
		}

	}

	private void broadcast(String data) {

		synchronized (listWriters) { // 공유 객체에 접근하기 때문에 동기화 처리
			for (Writer writer : listWriters) {
				PrintWriter printWriter = (PrintWriter) writer;
				printWriter.println(data);
				printWriter.flush();
			}

		}

	}

	private void log(String log) {
		System.out.println("[EchoServer] " + log);

	}

	public ChatServerThread(Socket socket, List<Writer> listWriters) {
		this.socket = socket;
		this.listWriters = listWriters;
	}

	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
	}

}
