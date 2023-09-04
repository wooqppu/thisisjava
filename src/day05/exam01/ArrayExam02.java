package day05.exam01;

public class ArrayExam02 {

	public static void main(String[] args) {
		// 배열변수 선언과 배열생성
		int[] intArr = new int[5];
		for(int i=0; i<5; i++) {
			System.out.println(intArr[i]);
		}
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		intArr[3] = 40;
		intArr[4] = 50;
		
		for(int i=0; i<5; i++) {
			System.out.println(intArr[i]);
		}
		String[] strArr = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println(strArr[i]);
		}
		strArr[0] = "그린";
		strArr[1] = "블루";
		strArr[2] = "레드";
		for(int i=0; i<3; i++) {
			System.out.println(strArr[i]);
		}
		int[] numberArr = new int[10]; // 길이 10개의 배열을 만듦 [0,0,0,0,0,...]
		for (int i=0; i<10; i++) { // 각각의 인덱스에 1~10까지의 값을 다시 넣음
			numberArr[i] = i+1;
		}
		for (int i=0; i<10; i++) {
			System.out.println(numberArr[i]); // for문을 이용해서 값을 차례대로 출력
		}
		// 배열 변수 선언 
		int[] scores; // 선언만 했기 때문에 초기 값이 null
		// 배열 변수에 배열을 대입
		// scores = {83,90,98}; ---> 에러 발생
		scores = new int[] {83,90,98}; // scores에 값을 넣어줌 
		
		// for문 돌려서 합계 구하기 
		int sum = 0;
		for(int i=1; i<scores.length; i++) {
				sum = sum + scores[i];
		}
		System.out.println("총합 : " + sum);	
		
		//배열길이 : 배열변수.length
		// 항상 마지막 변수의 순서는 length-1 ---> 변수<length
	}

}
