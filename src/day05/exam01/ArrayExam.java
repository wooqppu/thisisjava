package day05.exam01;

public class ArrayExam {

	public static void main(String[] args) {
		// 배열선언과 배열 생성 
		String[] fruits = {"🍑", "🥑", "🍒","🍍","🍓"};
		for(int i=0; i<5; i++) {
			System.out.println(fruits[i]);
		}
		// 배열항목의 값 변경 
		fruits[1] = "🍉";
		for(int i=0; i<5; i++) {
			System.out.println(fruits[i]);
		}
	}

}
