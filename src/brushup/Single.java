package brushup;

public class Single {
	// 싱글톤 패턴 
	// 정적 필드
	private static Single single1 = new Single();
	// 생성자
	private Single() {}
	// 정적 메소드
	static Single getInstaneof() {
		return single1;
	}
}
