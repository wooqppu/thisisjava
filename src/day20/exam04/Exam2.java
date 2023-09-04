package day20.exam04;

import java.util.Arrays;
import java.util.List;

public class Exam2 {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 10),
				new Member("김그린", 20),
				new Member("김길동", 30)
				);
		double avg = list.stream()
				.mapToInt(m->m.getAge())
				.average().getAsDouble();
		System.out.println("평균나이 : " + avg);

	}

}
