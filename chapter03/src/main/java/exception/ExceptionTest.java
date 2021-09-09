package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10 - a;
		
		System.out.println("some code1....");
		try {
		int result = ( 1 + 2 + 3 ) / b;
		}catch(ArithmeticException e) { 
			//1. 사과
			System.out.println("미안합니다.");
			//2. 로깅
			System.out.println("error : " + e);
			//3. 정상종료
			return;
			
		}finally {
			System.out.println("자원 정리");
		}
		
		
		System.out.println("some code2....");
		
	}

}
