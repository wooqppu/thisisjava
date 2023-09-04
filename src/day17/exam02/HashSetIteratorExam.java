package day17.exam02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIteratorExam {

	public static void main(String[] args) {
		// HashSet 컬렉션 생성 
		Set<String> set = new HashSet<>();
		// 객체 추가 
		set.add("home");
		set.add("집");
		set.add("house");
		set.add("HOME");
		set.add("ㅈㅣㅂ");
		
		// 객체를 하나씩 가져와서 처리 
		
		// 반복자 생성 
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			// 객체를 하나씩 가져오기
			String element = iterator.next();
			System.out.println(element);
			if(element.equals("home")) {
				iterator.remove();
			}
		}
		System.out.println();
		for(String element : set) {
			System.out.println(element);
		}
	}

}
