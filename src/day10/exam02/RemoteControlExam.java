package day10.exam02;

public class RemoteControlExam {

	public static void main(String[] args) {
		// 인터페이스 변수 선언 
		RemoteControl rc;
		
		// rc에 Television객체 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(6);
		rc.turnOff();
		
		// rc에 Audio객체 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(4);
		rc.turnOff();
	}

}
