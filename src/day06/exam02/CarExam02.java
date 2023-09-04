package day06.exam02;

public class CarExam02 {

	public static void main(String[] args) {
		// 객체 생성
		Car02 myCar = new Car02();
		
		// gas필드값을 10으로 변경
		myCar.setGas(10);
		
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		System.out.println("gas를 주입해주세요.");
	}

}
