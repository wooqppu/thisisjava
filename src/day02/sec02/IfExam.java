package day02.sec02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		//nextLine() String //nextInt() Int
		int number = scan.nextInt();
		if(number%3 == 0) {
			System.out.println(number + "는 3의 배수입니다.");
		}
		if(number%5 == 0) {
			System.out.println(number + "는 5의 배수입니다.");
		}
		
		String str1 = "김그린";
		String str2 = "김그린";
		
		String str3 = new String("김그린");
		String str4 = new String("김그린");
		//참조변수를 비교시 == 연산자는 참조번지를 비교
		System.out.println(str1 == str2);
		//문자열 내용의 비교는 문자열.equals("문자열")
		System.out.println(str3.equals(str4));
		
		
			}

}
