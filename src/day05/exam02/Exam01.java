package day05.exam02;

public class Exam01 {

	public static void main(String[] args) {
		// 문제6번
//		int[][] array = {
//				{95, 86},
//				{83, 92, 96},
//				{78, 83, 93, 87, 88}
//		};
//		System.out.println(array.length);
//		System.out.println(array[2].length);
//		
		// 문제7번 : 주어진 항목에서 최대값을 출력하는 코드를 작성(for문 이용)
		int[] array2 = {1,5,3,8,2};
		int max = 0;
		
		for(int i : array2) {
				if( i > max) {
					max = i;
				}
			}
			System.out.println("최대값 : " + max);
			
		// 문제8번 : 주어진 배열 항목의 전체 합과 평균을 구해서 출력하는 코드를 작성(중첩for문 이용) 
		int[][] array3 = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		for(int i=0; i<array3.length; i++) {
			for(int j=0; j<array3.length+1; j++) {
				sum = sum + array3[i][j];
			}
		System.out.println("총합 : " + sum);	
		}	
	}
}
