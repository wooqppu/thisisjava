package day10.exam04;

public class CastingExam {

	public static void main(String[] args) {
		Bus bus1 = new Bus();
		bus1.checkFare();
		bus1.run();
		
		// 자동타입변환
		Vehicle bus2 = new Bus();
		bus2.run();
		//bus2.checkFare(); 사용 불가능
		
		// 강제타입변환
		Bus bus3 = (Bus) bus2;
		bus3.checkFare();
		bus3.run();
		
	}

}
