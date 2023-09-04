package day07.exam03;

import day07.exam01.Korean;

public class MemberExam {
	// 14번 답안 
	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "Hong");
		System.out.println(user1.name);
		System.out.println(user1.id);
		
	// 15번 답안
		MemberService memberService = new MemberService();
		boolean result = memberService.login("Hong", "12345");
		if(result) {
			System.out.println("로그인되었습니다.");
			memberService.logout("Hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다." );
		}
	}

}
