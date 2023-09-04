package day02.sec01;

import java.util.Scanner; // 스캐너 불러오기

public class IFExam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 입력값 받기 
		while(true) // 반복문 
			{
			System.out.println("숫자를 입력하세요"); 
			String str = scan.nextLine(); 
			System.out.println(str); 
			
			int result = Integer.parseInt(str); // 입력값(str)을 숫자로 받기 위해 int로 변환
			
			// 홀수 짝수 조건문 
			if(result%2==1) {
				System.out.println("홀수입니다."); 
						}
			else {
				System.out.println("짝수입니다.");
						}
			
			if(result==100 ) // 100 이상의 입력값을 넣으면 반복문 끝내는(break) 조건 추가   
			{
				break;
			}

		}
	}
}