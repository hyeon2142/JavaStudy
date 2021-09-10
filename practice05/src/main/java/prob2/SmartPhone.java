package prob2;

public class SmartPhone extends MusicPhone{

	@Override
	public void execute(String function) {
		
		if(function.equals("음악")) {
			System.out.println("다운로드해서 음악재생");
		}else if(function.equals("통화")) {
			super.execute("통화");
		}else if(function.equals("앱")) {
			System.out.println("앱실행");
		}else {
			System.out.println("잘못된 명령어 입니다.");
		}
	}
	
	

}
