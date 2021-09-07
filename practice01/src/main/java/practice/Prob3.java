package practice;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum = 0;
		
		if(input % 2 == 0) { // 짝수
			for(int i = 0; i<= input; i+=2) {
				sum+=i;
			}
		}else { // 홀수
			for(int i = 1; i<= input; i+=2) {
				sum+=i;
			}
		}
		
		System.out.println(sum);
		sc.close();

	}

}
