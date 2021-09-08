package prob02;

public class Goods {
	
	private String name;
	private int price;
	private int quantity; // 갯수
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void showStatus() {
		System.out.println(this.name + "(가격:" + this.price + "원)이 " + this.quantity + "개 입고 되었습니다.");
	}

}
