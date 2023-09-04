package day07.exam02;

public class Car {
	// 필드선언
	private int speed;
	private boolean stop;  // 외부에서 접근 못하도록 private으로 범위 지정
	
	public int getSpeed() { // public + get, set메소드 이용해서 값을 변환(캡슐화) -> 외부, 다른 곳으로 이동, 사용 가능 
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
		this.speed = 0;
		}else {
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
}
