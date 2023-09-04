package day16.exam05;

public class InterruptExam {

	public static void main(String[] args) {
		InterruptPrintThread thread = new InterruptPrintThread();
		thread.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt();
	}

}
