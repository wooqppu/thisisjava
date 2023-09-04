package day09.exam03;

public class CarExam {

	public static void main(String[] args) {
		// Car 객체
		Car myCar = new Car();
		
		myCar.tire = new Tire();
		myCar.run();
		
		// HankookTire 장착
		myCar.tire = new HankookTire();
		myCar.run();
		
		// KumhoTire 장착
		myCar.tire = new KumhoTire();
		myCar.run();

	}

}
