package day13.exam01;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	// object의 toString()메소드 재정의 
	// 제조사의 운영체제가 결합된 문자열을 리턴
	@Override
	public String toString() {
		
		return company + ", " + os;
	}
	
	
}
