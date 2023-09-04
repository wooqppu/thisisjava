package day07.exam03;

public class ShopServiceExam {

	public static void main(String[] args) {
		// 18번 답안
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		}else {
			System.out.println("다른 ShopService 객체입니다.");
		}
		
		
		
	}

}
