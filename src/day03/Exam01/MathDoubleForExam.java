package day03.Exam01;

public class MathDoubleForExam {

	public static void main(String[] args) {
		
		// 구구단 2단에서 9단까지
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println( i + "*" +  j + "=" + i*j );
			}
		}
	}

}
