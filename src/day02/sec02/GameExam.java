package day02.sec02;

import java.util.Scanner;

public class GameExam {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 컴퓨터에는 랜덤하게 가위, 바위, 보를 지정
		String computer = Math.random() < 0.3333 ? "가위" : Math.random() < 0.6666 ? "바위" : "보";
		// 삼항연산자 뿐만 아니라 if 조건문 쓰기도 가능
		System.out.println(computer);
		
		// 사용자는 입력 받기  
		System.out.println("가위, 바위, 보 중 하나를 입력하세요 ");
		String user = scan.nextLine();
		
		// 비교해서 결과를 출력하기
		// 사용자가 이기는 경우 
		//user : 가위, computer : 보 // user : 바위, computer : 가위 
		// user : 보, computer : 바위

		if(computer.equals(user)) 
		{ System.out.println("user는 " + user + "computer는 " 
		+ computer + " , 비겼습니다. "); }
		else if((user.equals("가위") && computer.equals("보"))
				|| (user.equals("바위") && computer.equals("가위"))
				|| (user.equals("보") && computer.equals("바위"))) 
		{ System.out.println("user는 " + user + " computer는 " 
				+ computer + " , 이겼습니다."); }
		else { System.out.println("user는 " + user + "computer는 " 
				+ computer + " , 졌습니다. "); }
		
	}

}
