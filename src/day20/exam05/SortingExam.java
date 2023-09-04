package day20.exam05;

import java.util.ArrayList;
import java.util.List;

public class SortingExam {

	public static void main(String[] args) {
		// List 컬렉션 생성 
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("김그린", 30));
		studentList.add(new Student("이그린", 40));
		studentList.add(new Student("최그린", 20));
		
		// 점수를 기준으로 오름차순 정렬한 새 스트림 얻기
		studentList.stream()
		
//		.sorted((s1, s2) -> {
//			if(s1.getScore() < s2.getScore()) {
//				return -1;
//			} else if(s1.getScore() == s2.getScore()) {
//				return 0; 
//			} else { return 1; }
//		})  // 방법1 
		
//		.sorted((s1, s2) -> {
//			return Integer.compare(s1.getScore(), s2.getScore());
//		})  // 방법2
		
		.sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore())) // 방법3 // 오름차순 
		//.sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore())) // 내림차순 
		
		.forEach(s-> System.out.println(s.getName() + " : " + s.getScore()));
		
	}

}
