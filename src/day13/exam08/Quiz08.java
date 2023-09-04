package day13.exam08;

public class Quiz08 {
	public static void main(String[] args) {
		// 1970.01.01부터 현재까지의 시간을 나노초로 long타입으로 반환
		long startTime = System.nanoTime();
		
		int[] scores = new int[1000];
		for(int i=0; i<scores.length; i++ ) {
			scores[i] = i;
		}
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		double avg = sum / scores.length;
		System.out.println(avg);
		
		long endTime = System.nanoTime();
		System.out.println("작업 시간은 : " + (endTime - startTime) + " 나노초");
	}
}
