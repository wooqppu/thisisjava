package day10.exam03;

public class ServiceExam {

	public static void main(String[] args) {
		// 인터페이스 변수선언 구현 객체 대입
		Service service = new ServiceImpl();
		
		// 디폴트 메소드 호출 - 객체로 호출
		service.defaultMethod1();
		service.defaultMethod2();
		
		// 정적 메소드 호출 - 인터페이스 이름으로 호출 
		Service.staticMethod1();
		Service.staticMethod2();

	}

}
