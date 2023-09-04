package day18.exam02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableExam {

	public static void main(String[] args) {
		// List 불변 컬렉션 생성 
		List<String> list1 = List.of("a", "b", "c");
		// list1.add("d"); 입력은 가능하나 사용 시 에러 발생 
		// list1.remove("c"); 사용 시 에러 발생
		System.out.println(list1);

		// Set 불변 컬렉션 생성
		Set<String> set1 = Set.of("set a", "set b", "set c");
		// set1.remove("set c"); 사용 시 에러 발생
		
		// Map 불변 컬렉션 생성
		Map<String, Integer> map1 = Map.of("a",1,  "b",2,  "c",3);
		
		// List 컬렉션을 불변 컬렉션으로 복사 
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(10);
		list2.add(2);
		
		// 
		List<Integer> copylist = List.copyOf(list2);
		// copylist.add(13); 사용 시 에러 발생
		
		Set<String> set2 = new HashSet<>();
		set2.add("A");
		set2.add("B");
		set2.add("C");
		
		Set<String> copyset = Set.copyOf(set2);
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "A");
		map2.put(2, "B");
		map2.put(3, "C");
		
		Map<Integer, String> copymap = Map.copyOf(map2);
		
		// 배열로부터 List불변 컬렉션 생성 
		String[] strArr = {"A", "B", "C"};
		List<String> list3 = Arrays.asList(strArr);

	}

}
