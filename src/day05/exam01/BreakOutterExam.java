package day05.exam01;

public class BreakOutterExam {

	public static void main(String[] args) {
		Outter: for(int i=1; i<5; i++) {
			for(int j=1; j<5; j++) {
				System.out.println("i는 : " + i +", j는 : " + j);
				if(i==2) {
					break Outter;
				}
			}
		}

	}

}
