package day05.exam02;

public class Exam02 {

	public static void main(String[] args) {
		// 문제7번 답안 
		// 최대값 출력하기 
		int[] array = {1,5,3,8,2};
		int max = array[0];
		for(int i=1; i<array.length; i++) {
			//max값보다 해당 배열 요소 값이 더 크면 그 값을 max에 할당
			//아니면 max값을 max에 할당
			max = max < array[i] ? array[i] : max;
			// if (max < array[i]) { max = array[i]; }
		}
		System.out.println("최대값은 : " + max);
	}

}
