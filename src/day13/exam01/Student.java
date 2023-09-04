package day13.exam01;

public class Student {
	private int num;
	private String name;
	
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}
	public int getNum() { return num; }
	public String getName() { return name; }
	
	@Override
	public int hashCode() {
		int hashCode = num + name.hashCode();
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		// Object타입이 Student클래스의 인스턴스이면  
		// Student타입으로 형변환 후 target에 대입 
		if(obj instanceof Student target) {
			if(num == target.getNum() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
	
}
