package day02.sec02;

import java.util.Scanner;

public class RockExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보를 시작합니다");
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요");
		int userChoice = scan.nextInt(); 	
		int computerChoice = (int) (Math.random()*3) + 1;
		
		int getResult = (int) (userChoice + computerChoice);
	
		// 조건문	
		if (getResult==0) {
			System.out.println("비겼습니다");
		} else if (getResult == 1) {
			System.out.println("이겼습니다");
		} else {
			System.out.println("졌습니다");
		}
	}	
}
