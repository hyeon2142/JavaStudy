package prob01;

public class Printer {

	public void println(int a) {
		System.out.println(a);
	}

	public void println(Boolean b) {
		System.out.println(b);
	}

	public void println(double c) {
		System.out.println(c);
	}

	public void println(String d) {
		System.out.println(d);
	}
	
	public <T> void println(T... args) {
		for(T t : args) {
			System.out.println(t);
		}
	}
	
	public int sum(Integer... args) {
		int sum = 0;
		for(Integer i : args) {
			sum += i;
		}
		
		return sum;
	}

}
