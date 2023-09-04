package day06.exam02;

public class TVExam05 {

	public static void main(String[] args) {
		TV myTV = new TV("삼성"); 
		System.out.println(myTV.brand);
		myTV.powerOn();
		myTV.powerOff();
		myTV.channel1Up();
		myTV.channel1Down();
		myTV.volumeUp();
		myTV.volumeDown();

	}

}
