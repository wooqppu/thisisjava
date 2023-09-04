package day10.exam02;

public class SmartTelevisionExam {

	public static void main(String[] args) {
		// 인터페이스 변수
		RemoteControl rc = new SmartTelevision();
		Searchable sc = new SmartTelevision();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		// sc.turnOn();
		sc.search("naver.com");
		
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery();

	}

}
