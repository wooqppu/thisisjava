package day13.exam08;

public class MemberExam {

	public static void main(String[] args) {
		Member member = new Member("blue", "이파란");
		//println의 매개변수로 object타입이 오면 toString()메소드 호출됨
		// 오버라이딩 toString 해주면 재정의해서 원하는 문자 출력 가능
		System.out.println(member);
		
	}

}
