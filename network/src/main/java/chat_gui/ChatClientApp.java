package chat_gui;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClientApp {

	public static void main(String[] args) {
		String name = null;
		Scanner scanner = new Scanner(System.in);
		Socket socket = null;
		BufferedReader reader;
		PrintWriter writer;

		while( true ) {
			
			System.out.println("대화명을 입력하세요.");
			System.out.print(">>> ");
			name = scanner.nextLine();
			
			if (name.isEmpty() == false ) {
				break;
			}
			
			System.out.println("대화명은 한글자 이상 입력해야 합니다.\n");
		}
		
		scanner.close();
		
		try {
			
			// 1. create socket
			// 2. connect to server
			
			socket = new Socket("59.20.237.22",1111);
					
			// 3. get iostream 버퍼리더 프린트라이터 
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			
			// 4. join
			writer.print("JOIN:OK");
			// 5. String line = br.readLine();
			String line = reader.readLine();

			if("JOIN:OK".equals(line)) {
				System.out.println("하위");
				new ChatWindow(name).show();
			}
			

			new ChatWindow(name).show();
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
