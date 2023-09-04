package day02.sec01;

import java.util.Scanner;

public class OperatorExam04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int charCode = 'c'; // char타입이 int보다 작아서 자동변환으로 값을 담을 수 잇음
		if((charCode >= 65) && (charCode <= 90)) {
			System.out.println("65 이상이고 90 이하이다. 대문자이다.");
		}
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("97 이상이고 122 이하이다. 소문자이다.");
		}
		
		System.out.println("숫자를 입력하세요 : ");
		int num = Integer.parseInt(scan.nextLine());
		if((num%2==0) && (num%30==0)) {
			System.out.println("2의 배수이면서 3의 배수이다.");
		}
		if((num%2==0) || (num%30==0)) {
			System.out.println("2의 배수 또는 3의 배수이다.");
		}
		boolean b = true; 
		System.out.println(!b);
		
		// 삼항연산자
		int score = 95; 
		char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : 'C';
		System.out.println(grade);
		
		
	}
}
