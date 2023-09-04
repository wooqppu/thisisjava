package day09.exam05;

public class PhoneExam {

	public static void main(String[] args) {
	//	Phone phone = new Phone(); 추상클래스는 객체 생성 불가능 
		SmartPhone smartPhone = new SmartPhone("김그린");
		
		smartPhone.internetSearch();
		smartPhone.turnOff();
		smartPhone.turnOn();
	}

}
