package day12.exam02;

public class ExceptionHandlingExam1 {

	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수 : " + result);
		}
		catch(NullPointerException e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("마무리 실행"); 
		}
	}
		
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		printLength("java");
		printLength(null); // NullPointerException 발생 (실행 예외) 
		System.out.println("프로그램 종료");
		
	}

}
