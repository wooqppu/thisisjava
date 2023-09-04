package day11.exam01;

public class AExam {
	public static void main(String[] args) {
		// A객체 생성 
		A a = new A();
		
		// 인스턴스멤버클래스 a객체가 있어야 B객체 생성 가능  
		A.B b = a.new B();
		b.method1();
		a.method();
		
		// 정적멤버클래스 객체 생성 ---> a객체 없이 생성 가능
		A.C c = new A.C();
		System.out.println(c.field1);
		c.method1();
		System.out.println(A.C.field2);
		A.B.method2();
		
	}
	


}
