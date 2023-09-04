package day16.exam01;

import java.awt.Toolkit;

public class BeepPrintExam {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			
			// 동작을 잠시 일시정지 (밀리터 단위 -> 0.5초)
			// 예외 발생시 정지하지 않고 try-catch문에서 처리함
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
