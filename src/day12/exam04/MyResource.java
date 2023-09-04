package day12.exam04;

// 자동으로 닫기는 리소스 클래스 - 조건 AutoCloseable인터페이스 구현
public class MyResource implements AutoCloseable {
	private String name;
	
	public MyResource(String name) {
		this.name = name;
	} 
	
	public String read1() {
		System.out.println("[MyResource("+name+")읽기]");
		return "100";
	} 
	
	public String read2() {
		System.out.println("[MyResource("+name+")읽기]");
		return "green";
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("[MyResource()닫기]");
	}
	
}
