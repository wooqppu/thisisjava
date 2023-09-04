package day20.exam03;

import java.util.ArrayList;
import java.util.List;

public class MapExam {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("김그린", 85));
		studentList.add(new Student("강그린", 90));
		studentList.add(new Student("최그린", 82));
		studentList.add(new Student("이그린", 75));
		studentList.add(new Student("박그린", 60));
		
		studentList.stream()
		.mapToInt(s -> s.getScore())
		.forEach(score -> System.out.println(score));

	}

}
