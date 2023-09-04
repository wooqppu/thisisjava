package day20.exam03;

import java.util.ArrayList;
import java.util.List;

public class StudentsScore {
	public static void main(String[] args) {
	
		List<Integer> numlist = new ArrayList<>();
		numlist.add(50);
		numlist.add(80);
		numlist.add(90);
		numlist.add(100);
		numlist.add(70);		
		numlist.add(60);
		numlist.add(90);
		
		double avg = numlist.stream()
		.distinct()
		.filter(num -> num>=70)
		.mapToInt(num -> (int)num)
		.average().getAsDouble();
		
		System.out.println(avg);
		
		numlist.stream()
		.distinct()
		.filter(num -> num>=70)
		.forEach(num -> System.out.println(num));
		
	
	}
}
