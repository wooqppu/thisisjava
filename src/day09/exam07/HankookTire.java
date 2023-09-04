package day09.exam07;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		
		++accumulatedRotation;
		// 누적회전수가 최대회전수보다 작으면 true리턴, 아니면 false리턴
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " 한국Tire수명 : "+ (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("*** " + location + " 한국Tire펑크 ***");
			return false;
		}
	}
}
