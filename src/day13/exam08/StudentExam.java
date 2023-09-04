package day13.exam08;

import java.util.HashSet;

public class StudentExam {
	// 동등객체 비교? obj1, ob2 hashCode()
	public static void main(String[] args) {
		// Student객체를 저장할 HashSet 생성
		HashSet<Student> hashSet = new HashSet<Student>();
		// Student 저장
		hashSet.add(new Student("1"));
		hashSet.add(new Student("1"));
		hashSet.add(new Student("2"));
		System.out.println("저장된 Student 수 : " + hashSet.size());

	}

}
