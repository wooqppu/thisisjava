package day09.exam04;

public class DriverExam {

	public static void main(String[] args) {
		// Driver 객체 생성
		Driver driver = new  Driver();
		Bus bus = new Bus();
	// driver.drive(new Bus());	
		driver.drive(bus);
		Taxi taxi = new Taxi();
		driver.drive(taxi);

	}

}
