package day20.exam06;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectGroupExam {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("홍길동", "남", 92));
		stuList.add(new Student("최길동", "남", 65));
		stuList.add(new Student("김그린", "여", 79));
		stuList.add(new Student("이그린", "여", 90));
		stuList.add(new Student("박그린", "여", 83));
		
		Map<String, Double> map = stuList.stream()
				.collect(
						Collectors.groupingBy(s->s.getGender(),
									Collectors.averagingDouble(s->s.getScore())
								)
						);
		
		System.out.println(map);
//		
//		List<Student> maleList = map.get("남");
//		maleList.stream().forEach(s->System.out.println(s.getName()));
//		
//		System.out.println("---------------------");
//		
//		List<Student> femaleList = map.get("여");
//		femaleList.stream().forEach(s->System.out.println(s.getName()));
		
	}

}
