package day16.exam01;

import java.awt.Toolkit;

public class ThreadChild extends Thread {

	@Override
	public void run() {
	    Toolkit toolkit = Toolkit.getDefaultToolkit();
	    
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
