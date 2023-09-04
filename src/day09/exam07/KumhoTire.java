package day09.exam07;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		
		++accumulatedRotation;
		// 누적회전수가 최대회전수보다 작으면 true리턴, 아니면 false리턴
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " 금호Tire수명 : "+ (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("*** " + location + " 금호Tire펑크 ***");
			return false;
		}
	}
}
