package day12.exam02;

public class ExceptionHandlingExam2 {

	public static void main(String[] args) {
		// Class.forName ("패키지...클래스 이름")은 classPath위치에서 주어진 클래스를 찾는 코드
		// 클래스를 찾지 못하면 ClassNotFoundException예외 발생
		
		try {
		Class.forName("java.lang.String"); // 자바 자체 라이브러리에 존재
		System.out.println("java.lang.String클래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}	
		try {
			Class.forName("java.lang.String2"); // 자바 자체에 존재하지 않는 애라서 오류 발생 
			System.out.println("java.lang.String2클래스가 존재합니다.");
			} catch(ClassNotFoundException e) {
				e.printStackTrace();
			}	
	}
}
