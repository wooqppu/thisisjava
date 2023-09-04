package day09.exam06;

public abstract class Animal {
	// 메소드 선언 
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상메소드 선언 ---> {} 사용X
	public abstract void sound();

}
