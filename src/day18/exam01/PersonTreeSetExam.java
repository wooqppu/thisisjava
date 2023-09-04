package day18.exam01;

import java.util.TreeSet;

public class PersonTreeSetExam {

	public static void main(String[] args) {
		// Person은 TreeSet, TreeMap처럼 자동 정렬 불가능 
		// 정렬이 되려면 Comparable인터페이스 구현 필요
		// => Person implements Comparable<Person>, Override compareTo 
		TreeSet<Person> treeset = new TreeSet<>();
		treeset.add(new Person("김그린", 30));
		treeset.add(new Person("이그린", 20));
		treeset.add(new Person("박그린", 10));
		for(Person p : treeset) {
			System.out.println(p.name + " , " + p.age);
		}

	}

}
