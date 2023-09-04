package day09.exam05;

public class SmartPhone extends Phone {
	// 생성자 선언
	SmartPhone(String owner) {
		//Phone생성자 호출
		super(owner);
	}
	// 메소드 선언 
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	// 추상메소드(부모 클래스에서 작성)를 자식 클래스에서 오버라이딩으로 객체 선언 
	// ---> 강제성 부여로 하위 요소에 공통 규격 설정
	@Override
	void send(String message) {
		System.out.println("스마트폰 메세지" + message);
		
	}
	
}
