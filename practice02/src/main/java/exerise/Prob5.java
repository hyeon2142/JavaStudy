package exerise;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int k = r.nextInt(100)+1;
		int count = 1; // 입력횟수
		int range1 = 1; // 최소값
		int range2 = 100; // 최대값
		int input;
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요.");
		
		while(true) {
	
			System.out.println(range1 + "-" + range2);
			System.out.print(count + ">>");
			count++;
			input=sc.nextInt();
			
			if(input == k) {
				System.out.print("맞았습니다.\n다시 하시겠습니까?(y/n)>>");
				String answer = sc.next();
				if(answer.equals("y") || answer.equals("Y")) {
					k = r.nextInt(100)+1;
					count = 1; // 입력횟수
					range1 = 1; // 최소값
					range2 = 100; // 최대값
					input=0;
					continue;
				}else if(answer.equals("n") || answer.equals("N")){
					break;
				}else {
					System.out.println("잘못된 값을 입력하였습니다. 프로그램을 종료합니다.");
					break;
				}
			}else if(input > k) {
				System.out.println("더 낮게");
				range2 = input;
			}else {
				System.out.println("더 높게");
				range1 = input;
			}
			
			
			
			
			
		}
		sc.close();

	}

}
