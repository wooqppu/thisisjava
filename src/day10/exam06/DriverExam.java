package day10.exam06;

public class DriverExam {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		
		// 매개값으로 구현 객체 대입 (다형성 : 실행 결과가 다름)
		// 자동타입변환-> 오버라이딩 메소드 호출 -> 다형성
	//	driver.driver(bus);
	//	driver.driver(taxi);
		ride(bus);
		ride(taxi);		
		
	}
	// 메소드 
	public static void ride(Vehicle vehicle) {
		// 만약에 버스 타입이면 버스로 강제타입변환(캐스팅)
		if(vehicle instanceof Bus) {
			Bus bus2 = (Bus) vehicle;
			bus2.checkFare();
		} 
		vehicle.run();
	} 

}
