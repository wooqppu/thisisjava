package day03.Exam01;

public class Exam05 {

	public static void main(String[] args) {
		// 4x + 5y = 60(x,y)
		// x : 1~10, y : 1~10
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(4*x+5*y==60) {
					System.out.println("("+x+", "+y+")");
				}
			}
		}

	}

}
