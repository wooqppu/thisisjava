package day16.exam06;

public class MyThread extends Thread {

	@Override
	public void run() {
		for(int i=10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 

	}
	

}
