package day11.exam02;

public class A {
	// 생성자 
	A() {
		// 로컬 클래스 선언 
		class B {}
		// 로컬 객체 생성
		B b = new B();
	}
	// 메소드 
	void method(int arg) {
		//로컬변수 
		int var = 100;
		// 로컬 클래스 선언 
		class B {
			// 인스턴스 필드 
			int field1 = 1;
			// 정적필드(java17부터 허용)
			static int field2 = 2;
			// 생성자
			B() {
				System.out.println("B-생성자 실행");
			}
			// 인스턴스 메소드
			void method1() {
				// 로컬변수 읽기는 가능 
				System.out.println("var : " + var);
				System.out.println("arg : " + arg);
				System.out.println("B-method1 실행");
				// 로컬변수 수정은 불가능 
				// arg = 50; (X)
				// var = 20; (X)
			}
			// 정적 메소드(java17부터 허용)
			static void method2() {
				System.out.println("B-method2 실행");
			}
		}
		// 로컬 객체 생성 
		B b = new B();
		// 로컬 객체의 인스턴스 필드와 메소드 사용 
		System.out.println(b.field1);
		b.method1();
		// 로컬 클래스의 정적 필드와 메소드 사용(java17부터 허용)
		System.out.println(B.field2);
		B.method2();
	}
}
