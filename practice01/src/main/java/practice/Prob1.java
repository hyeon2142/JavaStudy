package practice;

import java.util.Scanner;

public class Prob1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input % 3 == 0 && input != 0) {
			System.out.println("3의 배수 입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		sc.close();

	}

}
