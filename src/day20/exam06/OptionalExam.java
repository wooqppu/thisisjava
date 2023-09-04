package day20.exam06;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExam {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		// 예외 발생 (java.util.NoSuchElementException) ---> 리스트 안에 값을 넣어주지 않아서 평균 낼 수 없음 (예외 발생) 
//		double avg = list.stream()
//				.mapToInt(num->num)
//				.average()
//				.getAsDouble();
		
		// 예외 방지 방법 1
		OptionalDouble optional = list.stream()
				.mapToInt(num->num)
				.average();
		if(optional.isPresent()) {
			System.out.println("방법1 평균 : " + optional.getAsDouble());
		}
		else {
			System.out.println("방법1 평균 : 0.0");
		}	
		
		// 방법 2
		double avg = list.stream()
				.mapToInt(num->num)
				.average()
				.orElse(0.0);
		System.out.println("방법2 평균 : " + avg);
		
		// 방법 3
		list.stream()
		.mapToInt(num->num)
		.average()
		.ifPresent(a -> System.out.println("하하하"));
		
		
	}

}
