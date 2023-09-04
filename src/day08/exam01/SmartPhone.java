package day08.exam01;

public class SmartPhone extends Phone {
	// 필드 선언
	public boolean wifi;
	public String name;
	public String company;
	
	// 생성자 선언
	public SmartPhone(String model, String color) {
		// super();를 통해 부모 호출 / this();를 통해 나 자신을 호출
		// super(); ---> 기본 생성자라서 생략 가능(컴파일 시s 자동 호출) 
		// 부모 생성자 호출
//		this.model = model;	// Phone으로부터 상속
//		this.color = color; // Phone으로부터 상속 
		super(model, color);  // ---> 매개변수 있는 생성자는 부모 생성자 생략 불가능(반드시 작성)
		
	}
	public SmartPhone(String model, String color, String company) {
		super(model, color);
		this.company = company;
	}
	
	
	// 메소드 선언
	public void setwifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
