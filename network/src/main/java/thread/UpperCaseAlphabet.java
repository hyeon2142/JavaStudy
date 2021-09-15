package thread;

public class UpperCaseAlphabet {
	
	public void print() {
		for(int i = 0; i<10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
