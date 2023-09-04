package day16.exam05;

public class InterruptPrintThread extends Thread {

	@Override
	public void run() {
		
		while(true) {
			System.out.println("실행중");
			// interrupt메소드가 호출되는지 확인
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("리소스 닫기");
		System.out.println("종료");
	}
	
}
