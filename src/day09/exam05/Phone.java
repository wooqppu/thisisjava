package day09.exam05;

// 추상 클래스
public abstract class Phone {
	// 추상메소드는 추상 클래스에서만 사용 가능 (추상메소드가 있든 없든 추상 클래스는 상관 없음 )
	// 필드 선언 (추상 클래스는 직접 객체 생성 불가능 -> new X)
	String owner;
	
	// 생성자 선언 
	Phone(String owner) {
		this.owner = owner;
	}
	// 메소드 선언
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	// 추상메소드 ---> 중괄호 블럭 X : 실행블럭이 없음 
	abstract void send(String message);
}
