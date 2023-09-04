package day06.exam02;

public class CalculatorExam {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		// 리턴값이 있는 메소드 호출 결과는 re변수에 저장
		int re = myCalc.plus(10, 20);
		System.out.println(re);
		String str = "김그린";
		int leng = str.length();
		System.out.println(leng);
	}

}
