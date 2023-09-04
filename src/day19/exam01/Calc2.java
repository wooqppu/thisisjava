package day19.exam01;

public class Calc2 implements Calculable {

	@Override
	public void calculate(int x, int y) {
		System.out.println("calc2 실행");
		System.out.println("덧셈 : " + (x + y));
		
	}

}
