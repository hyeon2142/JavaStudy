package prob05;

public class Account {
	
	private String accountNo;
	private int balance;
	
	public Account(String no) {
		this.accountNo = no;
		System.out.println(this.accountNo + " 계좌가 개설되었습니다.");
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNO) {
		this.accountNo = accountNO;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void save(int value) {
		this.balance += value;
		System.out.println(this.accountNo + " 계좌에 " + value + "만원이 입금되었습니다.");
	}
	
	public void deposit(int value) {
		this.balance -= value;
		System.out.println(this.accountNo + " 계좌에 " + value + "만원이 출금되었습니다.");
	}
	
}
