package day13.exam04;

public class ErrExam {

	public static void main(String[] args) {
		
		try {
		int value = Integer.parseInt("loo");
		} catch(NumberFormatException e) {
			System.out.println("[에러 내용]");
			System.err.println(e.getMessage());
			
		}
	}

}
