package day06.exam02;

public class Calculator {
	// 필드 - 데이터 저장
	// 생성자 - 피드의 초기화
	// 메소드 - 객체의 동작에 해당하는 코드블럭
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	int plus(int x, int y) {
		powerOn();
		int result = x + y;
		return result;
	}
	double divide(int x, int y) {
		double result = (double) x / y;
		return result;
	}
	void powerOff( ) {
		System.out.println("전원을 끕니다.");
	}
}
