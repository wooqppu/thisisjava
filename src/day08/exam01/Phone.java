package day08.exam01;

public class Phone {
	// 필드 선언
	public String model;
	public String color;
	public String company;
	
	// 기본 생성자 선언
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone() 생성자 실행");
	}
	
	// 메소드 선언
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice(String message) {
		System.out.println(message);
	}
	public void receiveVoice(String message) {
		System.out.println(message);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
