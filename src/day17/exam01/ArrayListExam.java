package day17.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("배고파");
		list.add("HUNGRY");
		list.add("need to eat");
		list.add(1, "Food");
		
		// 총갯수
		// get(index) 해당 순번을 반환 
		// contains(E) 주어진 객체의 존재 유무를 반환
		// remove(E) 해당 객체 제거
		// remove(index) 해당 순번 제거
		// clear() 객체 전부 제거 (비우기) 
		// isEmpty() 비어있는지를 조사, 비어져있으면 true 아니면 false
		
		
		int listSize = list.size();
		
		System.out.println(list.get(1));
		System.out.println("총 갯수 : " + listSize);
		
		boolean result = list.contains("배고파");
		boolean result2 = list.contains("food");
		
		System.out.println(result);
		System.out.println(result2);
		
		list.clear();
		System.out.println(list.isEmpty());
		
		List list2 = new ArrayList<>();
		System.out.println(list2.size());
		
		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("4");
		list2.add("5");
		
		System.out.println(list2);
		for(int i=list2.size()-1; i>=0; i--) {
			list2.remove(i);
			System.out.println(list2);
		}

	}

}
