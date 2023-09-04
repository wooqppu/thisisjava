package day08.exam01;

public class SuperExam {

	public static void main(String[] args) {
		SuperAirplane sa = new SuperAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = 2;
		sa.fly();
		sa.flyMode = 1;
		sa.fly();
		sa.land();

	}

}
