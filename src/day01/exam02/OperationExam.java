package day01.exam02;

public class OperationExam {

	public static void main(String[] args) {
		//int 이하의 데이터타입의 산술연산결과는 int타입으로 자동변환
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int result = byteValue1 + byteValue2;
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int intResult = charValue1 + charValue2;
		
		byte byteResult = 10 + 20;
		long value1 = 1000L;
		int value2 = 200;
		long result2 = value1 + value2;
		
		double doubleValue = 31.12345;
		int intValue4 = 30;
		double doubleResult = doubleValue + intValue4;
		
		double d = 5 / 3.0;
		// 5 / 3 = 1 ---> 1.0
		System.out.println(d);
		
		
		// 10단위 절삭 
		int money = 1238;
		money = money / 10 * 10;
		System.out.println(money);
		
		int x = 1;
		int y = 2;
		double result3 = x / (double) y ;
		System.out.println(result3);
		
	}

}
