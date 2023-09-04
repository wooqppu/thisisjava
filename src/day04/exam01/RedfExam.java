package day04.exam01;

public class RedfExam {

	public static void main(String[] args) {
		String str1 = "김그린";
		String str2 = str1;
		String str3 = new String("김그린");
		String str4 = new String("김그린"); //new를 붙이면 무조건 힙 영역에 새로운 객체 생성 --> 스택의 번지 달라짐
		String str5 = null;
		
		//System.out.println(str5.length());
		
		System.out.println(str1==str2);
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
	}

}
