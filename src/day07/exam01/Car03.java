package day07.exam01;

public class Car03 {
	// 인스턴스 필드 선언
	int speed;
	// 인스턴스 메소드 선언
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	// 정적 메소드 선언
	static void simulate() {
		// 객체 생성
		Car03 car1 = new Car03();
		car1.speed = 200;
		car1.run();
		
	} 
//	public static void main(String[] args) {
//		simulate();
//		Math.random();
//		Math.PI;
//	}
	
}
