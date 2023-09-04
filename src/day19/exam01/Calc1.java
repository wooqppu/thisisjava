package day19.exam01;

public class Calc1 implements Calculable {

	@Override
	public void calculate(int x, int y) {
		System.out.println("calc1 실행");
		System.out.println("뺄셈 : " + (x - y));
		
	}
	
}
