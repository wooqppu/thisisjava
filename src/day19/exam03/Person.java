package day19.exam03;

public class Person {
	public void action(Calculator calculator) {
		double result = calculator.calc(10, 4);
		System.out.println("결과 : " + result);
	}
}
