package day02.sec01;

public class OperatorExam03 {

	public static void main(String[] args) {
		
		// 비교연산자
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2); // 같나요? 네 -> true
		boolean result2 = (num1 != num2); // 다르나요? 아니오 -> false
		
		int num3 = 20;
		int num4 = 30;
		
		boolean result3 = (num3 < num4);
		boolean result4 = (num3 <= num4);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result5 = (char1 < char2);
		System.out.println(result5);
		
		float f = 0.1f;
		double d = 0.1;
		boolean result6 = (f == (float)d);
		System.out.println(result6);
		
		// 복합대입연산자
		int x = 10;
		x = x + 2; // x -> 12
		System.out.println(x);
		x += 2; // x -> 14 x = x+2
		System.out.println(x);
		x -= 2; // x -> 12 x = x-2
		System.out.println(x);
		x *= 2; // x -> 24 x = x*2
		System.out.println(x);
		
		
	}

}
