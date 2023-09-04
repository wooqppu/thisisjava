package day15.exam03;

public class InterfaceGenericExam {

	public static void main(String[] args) {
		
		HomeAgency homea = new HomeAgency();
		Home home = homea.rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();

	}

}
