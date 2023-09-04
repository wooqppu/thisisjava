package day20.exam06;

import java.util.Arrays;

public class AggregateExam {

	public static void main(String[] args) {
		// 정수 배열
		int[] arr = {1,2,3,4,5};
		
		// 카운팅
		long count = Arrays.stream(arr)
				.filter(n->n%2==1)
				.count();
		System.out.println("요소의 개수는 : " + count);
		
		// 총합
		long sum = Arrays.stream(arr)
				.filter(n->n%2==1)
				.sum();
		System.out.println("홀수의 총합 : " + sum);
		
		// 평균 
		double avg = Arrays.stream(arr)
				.filter(n->n%2==1)
				.average()
				.getAsDouble();
		System.out.println("홀수의 평균 : " + avg);
		
		// 최대값
		int max = Arrays.stream(arr)
				.filter(n->n%2==1)
				.max()
				.getAsInt();
		System.out.println("홀수의 최대값 : " + max);

		// 최소값
		int min = Arrays.stream(arr)
				.filter(n->n%2==1)
				.min()
				.getAsInt();
		System.out.println("홀수의 최소값 : " + min);

		// 첫번째 요소 
		int first = Arrays.stream(arr)
				.filter(n->n%2==1)
				.findFirst()	// 클래스 값으로 돌려줌 
				.getAsInt();	// int로 넣어주기 위해서 필요함  
		System.out.println("첫번째 홀수의 값은 : " + first);

		
		
	}

}
