package step02.object;

import model.Cafe;
import model.Menu;

public class Ex05Practice {

	public static void main(String[] args) {
		// 클래스 설계 -> 객체 생성 -> 기능 확인
		String[] coffe = {"아메리카노", "라떼", "스무디"};
		int[] coffe_price = {3500, 4000, 4500};

//		Cafe menus = new Cafe("americano",3500);
//		System.out.println("메뉴는: " + menus.getMenu() + ", 가격은:" + menus.getPrice());

//		Cafe menus = new Cafe(coffe, coffe_price);
//		
//		String[] getMenus = menus.getMenu();
//		int[] getPrices = menus.getPrice();
//		
//		for (int i = 0; i < coffe.length; i++) {
//			System.out.println("메뉴는: " + getMenus[i] + ", 가격은:" +getPrices[i]);
//		}
		
		Menu americano = new Menu("아메리카노", 3500);
		Menu latte = new Menu("라떼", 4000);
		Menu smoothie = new Menu("스무디", 4500);
		
		
		Menu[] menuArray = {americano, latte, smoothie};
		
		Cafe devCafe = new Cafe("dev", menuArray);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
