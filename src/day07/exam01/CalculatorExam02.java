package day07.exam01;

public class CalculatorExam02 {

	public static void main(String[] args) {
		System.out.println(Calculator02.pi);
		Calculator02 calc = new Calculator02();
		int result = calc.divide(50,5);
		int result2 = calc.plus(10,20);
	//	int result3 = Calculator02.divide(20,2);
		System.out.println(result);
		System.out.println(result2);
		
		System.out.println(Calculator02.info);
	}

}
