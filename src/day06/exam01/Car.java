package day06.exam01;
// 라이브러리 클래스(객체의 설계도)
public class Car {
// main 없이	
	
	// 필드선언 ---> 초기값 설정 
	public String company = "현대자동차";
	public String model = "그랜저";
	public String color = "흰색";
	public int maxSpeed = 360;
	public int speed;
	public boolean start;
	
	// 생성자 선언 기본 생성자
	// 생성자 오버로딩 : 매개변수의 타입, 갯수, 순서가 다른 생성자를 여러개 작성
	// 목적 : 객체의 필드를 다양하게 초기화 가능
	public Car() {			// 1번 생성자
		
	}
	public Car(String model) {	// 2번 생성자
		this.model = model;
		// this(model, "흰색"); ---> 색상 추가하고 싶으면 클래스 안의 해당 생성자(3번 생성자)를 다시 호출 
	}
	public Car(String model, String color) {	// 3번 생성자
		this.model = model; 
		this.color = color;
		// this(model, color, 200); ---> 4번 생성자 호출 -> 나 자신의 생성자를 다시 호출하는 것
	}
	// 생성자 선언
	public Car(String model, String color, int maxSpeed) {	// 4번 생성자
		this.model = model; // this.필드 = 매개변수;
		this.color = color;
		this.speed = maxSpeed;
		
	}
}

