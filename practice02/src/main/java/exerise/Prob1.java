package exerise;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		
		System.out.print("금액을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i : MONEYS) {
			System.out.println(i + "원 : " + input/i + "개");
			input = input - i*(input/i);
		}
		
	
		sc.close();
		
		
		

	}

}
