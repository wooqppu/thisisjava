package day09.exam01;

public class Child2 extends Parent2 {
	// 필드 선언 
	public String field2;
	// 메소드 선언
	public void method3() {
		System.out.println("자식메소드3");
	}
	@Override
	public void method1() {
		System.out.println("오버라이드 메소드1");
	}
	
}
