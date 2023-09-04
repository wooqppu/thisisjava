package day19.exam04;

public class Person {
	public void action(Calculable calculable) {
		double result = calculable.clac(10, 4);
		System.out.println(" 결과 : " + result);
	}

}
