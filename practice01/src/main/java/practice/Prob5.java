package practice;

public class Prob5 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=99; i++) {
			
			int a = i/10; // 십의자리
			int b = i%10; // 일의자리
			String result;
			
			if(a%3 == 0 && b%3 == 0 && a != 0 && b != 0) {
				System.out.println(i + "짝짝");
			}else if(a%3 == 0 && a!=0) {
				System.out.println(i + "짝");
			}else if(b%3 == 0 && b!=0) {
				System.out.println(i + "짝");
			}else {
				
			}
			
			
			
			
		}

	}

}
