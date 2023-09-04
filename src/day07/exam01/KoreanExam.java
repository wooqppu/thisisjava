package day07.exam01;

public class KoreanExam {

	public static void main(String[] args) {
		// 객체 만들기
		Korean k1 = new Korean("123456 - 1234567", "김그린");
		k1.name = "이그린";
		// Final필드는 값을 변경할 수 없음
//		k1.nation = "미국"; 
//		k1.ssn = "1234567";
		System.out.println(k1.nation);
		System.out.println(k1.ssn); // 값은 변경할 수 없지만, 출력은 가능

	}

}
