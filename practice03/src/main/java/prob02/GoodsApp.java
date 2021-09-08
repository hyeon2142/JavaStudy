package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		System.out.println("상품 입력");
		for(int i = 0; i<COUNT_GOODS; i++) {
			goods[i] = new Goods();
			String[] space = scanner.nextLine().split(" ");
			goods[i].setName(space[0]);
			goods[i].setPrice(Integer.parseInt(space[1]));
			goods[i].setQuantity(Integer.parseInt(space[2]));
		}
		
		
		// 상품 출력
		for(Goods a : goods) {
			a.showStatus();
		}
		
		// 자원정리
		scanner.close();
	}
	
}
