package day02.sec01;

public class OperatorExam01 {

	public static void main(String[] args) {
		// 단항 연산자
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		// int보다 작은 타입의 변수는 부호연산시 int로 자동타입변환
		byte b = 100;
		int result3 = -b;
		System.out.println("result3 : " + result3);
		
		// 증감 연산자
		int num1 = 10;
		int num2 = 20;
		int num3;
		int num4;

		System.out.println("---------------------------------------");
		num1++; // 11
		++num1; // 11+1 12
		System.out.println("num1은 " + num1);
		
		
		num3 = num2++;	// num3 20 num2 21 -> 전이증감이어서 num3는 num2의 더해지기 이전의 원래값을 사용 
		num4 = ++num2;	// num4 22 -> 후이증감이어서 num4는 num2의 더해진 이후의 값을 사용 
		System.out.println("num3는 " + num3);
		System.out.println("num4는 " + num4);
		
	}

}
