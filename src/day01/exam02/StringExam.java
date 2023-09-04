package day01.exam02;

public class StringExam {

	public static void main(String[] args) {
		int value = 10 + 2 + 8;
		System.out.println("value : " + value);

		String str1 = 10 + 2 + "8"; //12 + "8"-> 결합연산자여서 문자열 "128"로 바뀜
		System.out.println(str1);
		
		String str3 = "10" + 2 + 8; //1028
		System.out.println(str3);
		
		String str2 = "10" + (2 + 8); //1010 -> 숫자끼린 덧셈연산, 문자열을 만나면 문자열 결합 
		System.out.println(str2);
	}

}
