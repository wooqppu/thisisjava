package day16.exam01;

import java.awt.Toolkit;

public class BeepPrintChildExam2 {

	public static void main(String[] args) {
		// 스레드 생성 
		Thread thread = new Thread() {

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
	
		};
		 thread.start();
	      
	      // 작업2 메인스레드 작업 
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
		
