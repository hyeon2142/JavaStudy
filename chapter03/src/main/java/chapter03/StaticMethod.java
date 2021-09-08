package chapter03;

public class StaticMethod {

	int n;
	static int m;
	
	void f1() {
		System.out.println(n);
	}
	
	void f2() {
		System.out.println(m);
		// 클래스 이름 생략 가능 (같은 클래스에서)
	}
	
	void f3() {
		f2();
	}
	
	static void s1() {
		//System.out.println(n);
		// static method에서는 인스턴스 변수에 접근할 수 없다.
	}
	
	static void s2() {
		System.out.println(m);
	}
	
	static void s3() {
		//f1();
	}
	
	static void s4() {
		StaticMethod.s1();
		s1();
	}
	
}
