package day16.exam06;

public class DemonExam {

	public static void main(String[] args) {
		AutoSaveThread autosave = new AutoSaveThread();
		// 데몬스레드 지정 (start하기 전에 지정해야함)
		// 데몬스레드 지정하지 않으면 메인스레드 종료 이후에도 계속 작동함 
		autosave.setDaemon(true);
		autosave.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 스레드 종료");
	}

}
