package day16.exam02;

public class WorkThread extends Thread {
	// 필드
	public boolean work = true;
	
	// 생성자
	public WorkThread(String name) {
		setName(name);
	}

	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + " : 작업처리");
			} 
			else {
				// 실행대기상태가 되고 실행을 넘김 
				Thread.yield();
			}
		}
	}
	

}
