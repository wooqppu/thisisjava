package day09.exam06;

public class AnimalExam {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		animalSound(cat);
		animalSound(dog);
	}
	public static void animalSound(Animal animal) {  // 상속받은 cat, dog클래스 animal클래스로 자동타입변환 가능 
		animal.sound();
	} 
}
