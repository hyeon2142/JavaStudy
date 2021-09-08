package chapter03;

public class Goods {
	
	public static int countOfGoods = 0;
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public Goods() {
		countOfGoods = countOfGoods + 1;
	}
	
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
		
		if(price < 0) {
			return;
		}
		
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	public void showInfo() {
		System.out.println("name : " + this.getName() + " , price : " + this.getPrice() + " , countStock : " + this.getCountStock() + " , countSold : " + this.getCountSold());
		
	}
	
	public int calcDiscountPrice(int percentage) {
		return (price * percentage) / 100;
	}
	
}
