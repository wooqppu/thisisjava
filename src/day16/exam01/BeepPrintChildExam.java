package day16.exam01;

public class BeepPrintChildExam {

	public static void main(String[] args) {
		// 작업스레드 생성
		Thread thread = new ThreadChild();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
