package day10.exam02;

public interface RemoteControl {
	// 인터페이스는 상수 필드만 가능 --> static final 생략
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 인터페이스 내의 메소드는 추상메소드 --> abstract 생략 
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드 
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해지합니다.");
		}
	}
	// 정적메소드 
	static void changeBattery() {
		System.out.println("리모컨 건전지를 교체합니다.");
	}
	
}
