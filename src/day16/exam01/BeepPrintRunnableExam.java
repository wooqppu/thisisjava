package day16.exam01;

import java.awt.Toolkit;

public class BeepPrintRunnableExam {
   public static void main(String[] args) {
      //스레드 생성하기   - 익명구현객체
      Thread thread = new Thread(new Runnable() {

         @Override
         public void run() {
            // TODO Auto-generated method stub
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for(int i=0; i<5; i++) {
               toolkit.beep();
               //sleep은 일시정지, 동작을 잠깐 멈추는 것.  ()안에는 밀리터단위.  1000이 1초 500이 0.5초
               try {
                  Thread.sleep(500);
               } catch (InterruptedException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               }
         
            }
         }
      });
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