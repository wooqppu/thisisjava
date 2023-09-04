package day01.exam03;

import java.util.Scanner;

public class ScannerExam {
	public static void main(String[] args) {
		System.out.println("나이를 입력하세요"); // ""의 내용을 출력하는 코드 
		Scanner scan = new Scanner(System.in); // 입력값을 받으라는 코드 
		String str = scan.nextLine(); // 입력값을 숫자로만 받는 코드
		System.out.println(str); // 입력값을 출력하는 코드 

	}

}
