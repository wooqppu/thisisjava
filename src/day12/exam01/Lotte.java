package day12.exam01;

public class Lotte {

	public static void main(String[] args) {
		System.out.println("햄버거 세트를 만들어봅시다.");
		System.out.println("======================");
		
		BigBurger b1 = new BigBurger(5000, "맛있는 빅버거");
		Coke c1 = new Coke(1500,"콜라");
		FrenchFries f1 = new FrenchFries(1000,"감자튀김");
		
		BigBurgerSet set1 = new BigBurgerSet(b1, c1, f1);
		BigBurgerSet set2 = new BigBurgerSet(
				new BigBurger(5500, "불고기빅버거"), 
				new Coke(2000,"제로콜라"), 
				new FrenchFries(1500,"양념감자"));
		
		int setPrice1 = set1.getBigBurger().getPrice() + set1.getCoke().getPrice() 
						+ set1.getFrenchFries().getPrice() ;
		int setPrice2 = set2.getBigBurger().getPrice() + set2.getCoke().getPrice() 
				+ set2.getFrenchFries().getPrice() ;
		
		System.out.println("set1의 합계는 " + setPrice1 + "입니다.");
		System.out.println("set2의 합계는 " + setPrice2 + "입니다.");

	}

}
