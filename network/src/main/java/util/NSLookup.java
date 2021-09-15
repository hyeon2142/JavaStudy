package util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NSLookup {

	public static void main(String[] args) {

		// > 프롬프트가 나와서 도메인주소를 입력하면 해당 도메인의 ip출력, 반복

		String line = "www.douzone.com";
		Scanner sc = new Scanner(System.in);
		String input = "";
		InetAddress[] result;

		try {
			System.out.println("JAVA NsLookup");

			while (!input.equals("quit")) {
				System.out.print("> ");
				input = sc.nextLine();
				result = InetAddress.getAllByName(input);

				
				for (InetAddress a : result) {
					System.out.println(a.getHostAddress());
				}
				

			}

		} catch (UnknownHostException e) {
			System.out.println("그런 주소 없어요!");
		}

	}

}
