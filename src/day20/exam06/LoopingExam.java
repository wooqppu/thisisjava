package day20.exam06;

import java.util.Arrays;

public class LoopingExam {

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		// 잘못 작성 - 최종처리가 없어서 동작하지 않음
		Arrays.stream(intArr)
		.filter(a -> {
			return a%2 == 0; })
		.peek(n -> System.out.println("peek" + n));
		
		
		// 중간처리 메소드 peek()를 이용해서 반복 
		int total = Arrays.stream(intArr)
		.filter(a -> {
			return a%2 == 0; })
		.peek(n -> System.out.println("중간처리" + n))
		.sum();
		
		// 최종처리 메소드 forEach()
		Arrays.stream(intArr)
		.filter(a -> {
			return a%2 == 0; })
		.forEach(n -> System.out.println("forEach" + n));
		
	}

}
