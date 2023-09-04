package day11.exam02;

public class Outer {
	// 인스턴스 필드 
	String field = "Outer 필드";
	// 인스턴스 메소드 
	void method() {
		System.out.println("바깥 메소드");
	}
	// 인스턴스 멤버 클래스 
	class Inclass {
		String field = "In 필드";
		// in 인스턴스 필드 
		void method() {
			System.out.println("In 메소드");
		}
		void print() {
			// 바깥 객체의 필드와 메소드 사용 
			// 바깥 클래스.this -> 바깥의 객체
			System.out.println(Outer.this.field);
			Outer.this.method();
			//In객체의 필드와 메소드 사용 
			System.out.println(this.field);
			this.method();
		}
	}
	// 인스턴스 메소드 
	void useIn() {
		Inclass inc = new Inclass();
		inc.print();
		
	}
}
