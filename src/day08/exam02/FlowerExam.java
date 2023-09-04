package day08.exam02;

public class FlowerExam {

	public static void main(String[] args) {
		Rose rose = new Rose("장미", 1500, "핑크");
		Tulip tulip = new Tulip("튤립", 1300);
		Flower flower = new Flower("수선화", 1000);
		Flower flower2 = rose;
		rose.flowerInformation();
		tulip.flowerInformation();
		flower.overMethod();
		flower2.overMethod();
		rose.method1();

	}

}
