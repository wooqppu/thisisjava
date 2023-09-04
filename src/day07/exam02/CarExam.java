package day07.exam02;

public class CarExam {

	public static void main(String[] args) {
		// 객체생성
		Car myCar = new Car();
		System.out.println(myCar.getSpeed());
		myCar.setSpeed(60);
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
		// 멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println(myCar.isStop());
	}

}
