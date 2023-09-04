package day15.exam01;

public class Car {
	// 필드 
	private String model;
	private String name;
	private int age;
	
	// 생성자 
	public Car() {
		
	}
	public Car(String model, int age) {
		this.model = model;
		this.age = age;
	}
	
	// 메소드
	public String getModel() {
		return model;
	}
	public String getName() {
		return name;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setName(String name) {
		this.name = name;
	}
}
