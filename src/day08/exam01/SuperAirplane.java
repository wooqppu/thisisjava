package day08.exam01;

public class SuperAirplane extends Airplane {
	public int flyMode = 1;

	@Override
	public void fly() {
		if(flyMode==2) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly();
		}
	}
	
	
}
