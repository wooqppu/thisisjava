package day07.exam01;
// 라이브러리 클래스
public class Calculator02 {
	// 정적 멤버 선언 static
	static double pi = 3.14159;
	static String company = "My Company";
	static String model = "LCD";
	static String info;
	// 인스턴스 필드
	String color = "흰색";
	// 복잡한 값으로 정적 필드를 초기화할 때
	// 정적블럭을 사용
	static {
		info = company + "-" + model;
	}
	
	static int plus(int x, int y) {
		return x + y;
		}
	static int minus(int x, int y) {
		return x - y;
	}
	int divide(int x, int y) {
		return x / y;
	}
}
