package practice;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		System.out.print("문자열을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		for(int i = 0; i<=input.length(); i++) {
			System.out.println(input.substring(0, i));
		}
		
		sc.close();

	}

}
