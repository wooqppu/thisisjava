package day05.exam01;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scan.nextLine();
			System.out.println(inputString);
		} while ( !inputString.equals("q")); //	q가 아니면 true로 do 조건문 실행, q일 때만 !로 false가 되서 종료 
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
