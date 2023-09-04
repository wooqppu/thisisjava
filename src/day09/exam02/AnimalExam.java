package day09.exam02;

public class AnimalExam {

	public static void main(String[] args) {
		Animal anicat = new Cat();
		Animal anidog = new Dog();
		
		//anicat color 필드? ---> Animal타입의 필드와 메소드만 사용 가능 
		anicat.sound(); 	// 냐옹냐옹 ---> 오버라이딩? 어케 된거?
		anidog.sound(); 	// 멍멍
		typeChange(anidog);
		typeChange(anicat);
		
	}
	public static void typeChange(Animal ani) {
		if(ani instanceof Dog) {
		Dog dog = (Dog) ani; 
		}
	}

}
