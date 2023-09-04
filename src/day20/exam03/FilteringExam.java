package day20.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilteringExam {

	public static void main(String[] args) {
		// List 컬렉션
		List<String> list = new ArrayList<>();
		list.add("강백호");
		list.add("서태웅");
		list.add("송태섭");
		list.add("정대만");
		list.add("정대만");
		list.add("권준호");
		list.add("채치수");
		
		// 스트림 생성 
		Stream<String> stream = list.stream();
		stream.forEach(str->System.out.println(str));
		
		System.out.println("-------------------------------");
		
		// 중복요소 제거 
		list.stream().distinct()
		.forEach(str->System.out.println(str));
		
		System.out.println("-------------------------------");
		
		list.stream().distinct()
		.filter(f->f.startsWith("정"))
		.forEach(str->System.out.println(str)); 

	}

}
