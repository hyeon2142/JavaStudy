package prob01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class Gugudan {

	static int resultNumber = 0; // 정답

	public static void main(String[] args) {
		int l = randomize(1, 9); // 1~9
		int r = randomize(1, 9); // 1~9 

		resultNumber = l * r;    

		int[] answerNumbers = randomizeAnswers(); // 크기가 9인 배열 -> 인덱스는 0~8까지 
		int loc = randomize(0, 9);     // 0이상 7이하
		answerNumbers[loc] = resultNumber;


		System.out.println(l + " x " + r + " = ?");

		int length = answerNumbers.length;

		for (int i = 0; i < length; i++) { // 0부터 8까지
			if (i % 3 == 0) {
				System.out.print("\n");
			} else {
				System.out.print("\t");
			}

			System.out.print(answerNumbers[i]);
		}

		System.out.print("\n\n");
		System.out.print("answer:");

		Scanner s = new Scanner(System.in);
		int answer = s.nextInt();
		s.close();

		System.out.println((answer == resultNumber) ? "정답" : "오답");
	}

	private static int randomize(int lNum, int rNum) {
		int random = (int) (Math.random() * rNum) + lNum;
		return random;
	}

	private static int[] randomizeAnswers() {
		/* 코드 작성(수정 가능) */
		final int COUNT_ANSWER_NUMBER = 9;
		Set<Integer> s = new HashSet<>(COUNT_ANSWER_NUMBER);
		int count = 0;
		
		while(s.size() < 9) {
			int random = ((int)(Math.random()*9+1)) * ((int)(Math.random()*9+1));
			
			s.add(random);

		}
		
		
		int[] boardNumbers = new int[COUNT_ANSWER_NUMBER];

		for(int a : s) {
			boardNumbers[count] = a;
			count++;
		}
		
		
		return boardNumbers;
	}
}
