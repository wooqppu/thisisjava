package day19.exam01;

public class LambdaPersonExam {

	public static void main(String[] args) {
		Person p = new Person();
		// 익명 구현 객체 
		p.action(new Workable() {

			@Override
			public void work() {
				System.out.println("익명구현객체 오버라이딩 메소드 실행");
			}
			
		});
		// 람다식
		p.action(()->System.out.println("람다 오버라이딩 메소드 실행"));
		p.action(()->{ // 실행문 여러개라서 생략 불가능 
			System.out.println("람다 오버라이딩 메소드 실행");
			System.out.println("람다 오버라이딩 메소드 실행");
		});

	}

}
