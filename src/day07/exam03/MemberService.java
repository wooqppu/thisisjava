package day07.exam03;

public class MemberService {
	// 15번 답안
	public boolean login(String id, String password) {
		if(id.equals("Hong") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	public void logout(String id) {
		System.out.println(id + " 님이 로그아웃 되었습니다.");
	}
}
