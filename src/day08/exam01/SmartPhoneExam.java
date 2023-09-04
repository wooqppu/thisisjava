package day08.exam01;

public class SmartPhoneExam {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("아이폰", "흰색");
		
		System.out.println(myPhone.color);
		System.out.println(myPhone.model);
		System.out.println(myPhone.wifi);
		
		
		myPhone.bell();
		myPhone.sendVoice("혹시 중앙역 가는 방법....");
		myPhone.receiveVoice("뉴진스의 하입보이요");
		myPhone.sendVoice("커즈 마아아아아 아");
		myPhone.setwifi(true);
		myPhone.internet();

	}

}
