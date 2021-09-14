package prob03;

public class Money {
	private int amount;
	
	/* 코드 작성 */
	
	public Money(int amount) {
		this.amount = amount;
	}
	
	public Money add(Money money) {
		return new Money(this.amount+money.amount);
	}
	
	public Money minus(Money money) {
		return new Money(this.amount-money.amount);
	}
	
	public Money multiply(Money money) {
		return new Money(this.amount*money.amount);
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if(obj instanceof Money) {
			return this.amount == ((Money) obj).amount ? true : false;
		}
		
		return super.equals(obj);
	}

	public Money devide(Money money) {
		return new Money(this.amount/money.amount);
	}
	
	
}
