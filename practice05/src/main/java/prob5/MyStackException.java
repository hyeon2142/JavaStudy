package prob5;

public class MyStackException extends Exception{
	
	public MyStackException() {
		
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return ":stack is empty";
	}

	public MyStackException(String error) {
		super(error);
	}

}
