package day13.exam01;

public class ToStringExam {

	public static void main(String[] args) {
		
		Object obj = new Object();
		
		// Object객체의 toString()메소드는 객체의 문자정보를 리턴
		// 클래스명@16진수 해시코드
		
		// println메소드는 매개값으로 기본타입이 오거나
		// 문자열일 경우에는 해당 값을 그대로 출력
		// 매개값이 객체가 되면 객체의 toString()메소드를 
		// 호출해서 리턴값을 출력 
		
		System.out.println(obj.toString());

		String str = "green";
		System.out.println(str.toString());
		
	}

}
