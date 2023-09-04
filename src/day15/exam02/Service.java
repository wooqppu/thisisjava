package day15.exam02;

public class Service {
	@PrintAnnotation	// 적용
	public void method1() {
		System.out.println("실행1");
	}
	@PrintAnnotation("*")	// 적용  // 속성 이름이 없으면 value값만 변경 (생략O)
	public void method2() {
		System.out.println("실행2");
	}
	@PrintAnnotation(value = "#", number = 20) 	// 적용  // 속성 이름이 있으면 value, number값까지 변경 (생략X)
	public void method3() {
		System.out.println("실행3");
	}
}
