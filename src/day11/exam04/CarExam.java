package day11.exam04;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		car.run2(new Tire() {
			@Override
			public void roll() {
				System.out.println("새로운 익명 자식 객체가 굴러갑니다.");
			}
		});
		car.run3();
	}

}
