package day16.exam01;

import java.awt.Toolkit;

public class RunnableChild implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
