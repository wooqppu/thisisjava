package day07.exam03;

public class ShopService {
	// 18번 답안
	static private ShopService shopService = new ShopService(); // 인스턴스 필드 ---> static으로 정적필드 변경
	// ShopService.shopService
	private ShopService() {
		
	}
	// 메소드
	// 리턴타입 ---> 얘가 왜 필요함? 왜 불러주는데?
	static ShopService getInstance() {
		return shopService;
	}
}
