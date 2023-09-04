package day03.Exam01;

public class Exam04 {

	public static void main(String[] args) {
		while(true) {
			int num1 =(int) (Math.random()*6)+1 ; //1~6 랜덤숫자
			int num2 =(int) (Math.random()*6)+1 ; //1~6 랜덤숫자
			System.out.println("("+num1+", "+num2+")"); 
			if(num1+num2==5) {break;} //랜덤숫자 둘의 합이 5가 되면 조건문 작동 중지 
			}
	}
}
