package day06.exam01;
// 실행클래스
public class CarExam {
	// main 메소드
	public static void main(String[] args) {
	
//		// Car 객체 생성
//		Car car1 = new Car();   // 생성자
//		// car1 객체의 필드 출력하기 - model, speed, start 
//		System.out.println("모델명 " + car1.model );
//		System.out.println("회사 " + car1.company );
//		System.out.println("색깔 " + car1.color );
//		System.out.println("스피드 " + car1.speed );
//		System.out.println("최대스피드 " + car1.maxSpeed );
//		System.out.println("시동여부 " + car1.start );
//		// Car객체의 필드값 변경
//		car1.speed = 80;
//		System.out.println("스피드 " + car1.speed);
		
		// Car 객체 생성
		Car car1 = new Car();   // 1번생성자
		
		Car car2 = new Car("소나타");   // 2번생성자
		System.out.println("car2.company " + car2.company);
		System.out.println("car2.model " + car2.model);
		System.out.println();
		
		Car car3 = new Car("그랜저", "빨강");   // 3번생성자
		System.out.println("car3.company " + car3.company);
		System.out.println("car3.model " + car3.model);
		System.out.println("car3.color " + car3.color);
		System.out.println();
		
		Car car4 = new Car("아반떼", "흰색", 200);   // 4번생성자
		System.out.println("car4.company " + car4.company);
		System.out.println("car4.model " + car4.model);
		System.out.println("car4.color " + car4.color);
		System.out.println("car4.maxSpeed " + car4.maxSpeed);
	
	}

}
