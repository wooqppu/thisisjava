package day17.coffee;

// 주문, 메뉴 선택 
public class Customer {
	// 주문 
	public void order(String menuName, Menu menu, Barista barista) {
		// 메뉴 선택 
		MenuItem menuItem = menu.choose(menuName);
		if(menuItem == null) {
			System.out.println("없는 메뉴입니다.");
			return;
		}
		// 커피 만들기 
		Coffee coffee = barista.makeCoffee(menuItem);
		System.out.println("커피 나왔습니다.");
		System.out.println(coffee.getName());
		System.out.println(coffee.getPrice());
	}

}
