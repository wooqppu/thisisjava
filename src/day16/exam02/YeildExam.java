package day16.exam02;

public class YeildExam {

	public static void main(String[] args) {
		WorkThread workthreadA = new WorkThread("workThreadA");
		WorkThread workthreadB = new WorkThread("workThreadB");
		
		workthreadA.start();
		workthreadB.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		workthreadA.work = false;
		workthreadB.work = false;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		workthreadA.work = true;

	}

}
