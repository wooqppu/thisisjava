package day05.exam02;

public class Exam03 {

	public static void main(String[] args) {
		// 문제8번 답안
		// 전체합과 평균을 구해라
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum = 0; // 전체 합을 담을 변수
		double avg = 0.0; // 평균을 담을 변수
		int leng = 0;
		
		for(int[] arr : array) {
			for(int a : arr) {
				sum += a;
			}
			leng += arr.length;
		}
		avg = sum / (double) leng;
		System.out.println("총합은 : " + sum);
		System.out.println("평균은                                                                 : " + avg);
	}

}
