package day20.exam06;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExam {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("홍길동", "남", 92));
		stuList.add(new Student("최길동", "남", 65));
		stuList.add(new Student("김그린", "여", 79));
		stuList.add(new Student("이그린", "여", 90));
		stuList.add(new Student("박그린", "여", 83));
		
		// 남학생만 새로운 list로
		List<Student> mailList = stuList.stream()
				.filter(s->s.getGender().equals("남"))
				.collect(Collectors.toList()); 	// 방법1
		
		mailList.stream()
		.forEach(s->System.out.println(s.getName()));
		
		System.out.println("---------------");
		
		List<Student> femailList = stuList.stream()
				.filter(s->s.getGender().equals("여"))
				.toList(); 	// 방법2 (java16)
		
		femailList.stream()
		.forEach(s->System.out.println(s.getName()));
		
		System.out.println("---------------");
		
		Map<String, Integer> map = stuList.stream()
				.collect(Collectors.toMap(
						s->s.getName(),	// Student객체에서 키(key)가 될 부분 리턴
						s->s.getScore()) // Student객체에서 값(value)이 될 부분 리턴
						);
		
		System.out.println(map);
	}

}
