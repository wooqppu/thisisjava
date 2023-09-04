package day19.exam01;

public class CalculableExam {

	public static void main(String[] args) {
		// 익명 구현 객체
		Calculable calculable1 = new Calc1();
		action(calculable1);

		Calculable calculable2 = new Calc2();
		action(calculable2);
		
		action(new Calculable() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println("익명 구현 객체 사용 : " + x);
			}
		});
		
		action((x,y)->{
			System.out.println("람다식 출력 곱셈 : " + (x*y));
		});

	}
	
	public static void action(Calculable calc) {
		int x = 10;
		int y = 20;
		calc.calculate(x, y);
	}

}
