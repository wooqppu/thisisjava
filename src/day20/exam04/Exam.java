package day20.exam04;

import java.util.Arrays;
import java.util.List;

public class Exam {
	
	// 대소문자 구분없이 java
	// str.contains("java")
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"this is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
				);
		list.stream()
		.filter(str->str.toLowerCase().contains("java"))
		.forEach(str->System.out.println(str));
	}

}
