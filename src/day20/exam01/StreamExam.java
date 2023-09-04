package day20.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExam {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("김그린");
		set.add("박그린");
		set.add("이그린");
		
		for(String str : set) {
			System.out.println(str);
		}
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
		}
		
		// Stream을 이용한 반복처리
		Stream<String> setStream = set.stream();
		setStream.forEach(name -> System.out.println(name));

	}

}
