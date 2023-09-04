package day10.exam03;

public interface Service {
	// 디폴트 메소드 
	default void defaultMethod1() {
		System.out.println("defaultMethod코드1");
		defMethod3();
	}
	default void defaultMethod2() {
		System.out.println("defaultMethod코드2");
		defMethod3();
	}
	private void defMethod3() { // 디폴트 메소드에서 중복되는 메세지는 프라이빗 메소드로 묶어서 따로 빼줌
		System.out.println("중복1");
		System.out.println("중복2");
	}
	
	// 정적 메소드 (정적 메소드 안에서는 프라이빗 메소드 호출 불가능)
	static void staticMethod1() {
		System.out.println("staticMethod코드1");
		staticCommon(); // 프라이빗 정적 메소드 호출은 가능 ---> 프라이빗 정적 메소드는 전부(디폴트, 정적) 다 사용 가능함 
	}
	static void staticMethod2() {
		System.out.println("staticMethod코드2");
		staticCommon();
	}
	private static void staticCommon() {
		System.out.println("중복1");
		System.out.println("중복2");
	}
	
}
