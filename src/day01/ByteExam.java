package day01;

public class ByteExam {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = 127;
		//byte var3 = 128;
		//byte 허용범위 : -127 ~ 127
		char var3 = 'a';
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
				
		String str1 = "김그린";
		//str은 여러개의 문자열, char은 문자열 1개만 저장 가능
		// String은 문자열을 저장 참조 타입, ""로 묶어줌 
		System.out.println(str1 + "입니다.");
	}

}
