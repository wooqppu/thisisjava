package day13.exam01;

import java.util.HashSet;

public class HashSetExam {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1, "green");
		hashSet.add(s1);
		System.out.println("저장된 객체 수 : " + hashSet.size());
		
		Student s2 = new Student(1, "green");
		hashSet.add(s2); // s1과 값이 동일해서 똑같은 객체로 인식 -> 저장된 객체 수 증가하지 않음  
		System.out.println("저장된 객체 수 : " + hashSet.size());
		
		Student s3 = new Student(1, "blue");
		hashSet.add(s3);
		System.out.println("저장된 객체 수 : " + hashSet.size());
	}

}
