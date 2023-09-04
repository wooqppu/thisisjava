package day08.exam02;

public class Flower {
	String name;
	int cost;
	
	public Flower(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	
	public void flowerInformation() {
		System.out.printf("%s 1송이의 가격은 %,d원입니다.%n", this.name, this.cost);
	}
	public void overMethod() {
		System.out.println("부모의 메소드 입니다.");
	}
}
