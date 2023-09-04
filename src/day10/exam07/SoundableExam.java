package day10.exam07;

public class SoundableExam {
	
	// 389p 6번 답안 
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	} 
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}

}
