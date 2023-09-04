package day16.exam01;

public class BeepRunnableExam {

	public static void main(String[] args) {
		// 메인스레드
		// 스레드 생성
		Thread thread = new Thread(new RunnableChild());
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
