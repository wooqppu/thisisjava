package day16.exam02;

public class JoinExam {

	public static void main(String[] args) {
		SumThread thread = new SumThread();
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~100까지의 합 : " + thread.getSum());

	}

}
