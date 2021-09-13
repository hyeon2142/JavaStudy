package collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<>();
		
		
		
		while(!s.isEmpty()) {
			String str = s.pop();
			System.out.println(str);
		}
		
		s.push("둘리");
		s.push("마이콜");
		s.push("도우너");
		
		// 비어있는 경우에는 예외 발생
		System.out.println(s.pop());
		System.out.println(s.peek());
		

	}

}
