package day18.exam01;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam {

	public static void main(String[] args) {
		// TreeSet 컬렉션 생성하기 - Set 인터페이스 구현
		TreeSet<Integer> treeset = new TreeSet<>();
		
		// 객체 저장
		treeset.add(10);
		treeset.add(30);
		treeset.add(90);
		treeset.add(20);
		treeset.add(40);
		treeset.add(50);
		
		System.out.println(treeset);
		
		Integer firstNum = treeset.first();
		Integer lastNum = treeset.last();
		System.out.println(firstNum);
		System.out.println(lastNum);
		
		Integer lowerNum = treeset.lower(40);
		System.out.println("40보다 작은 숫자 : " + lowerNum);
		Integer highNum = treeset.higher(50);
		System.out.println("50보다 큰 숫자 : " + highNum);
		
		Integer floorNum = treeset.floor(15);
		System.out.println(floorNum);
		Integer ceilNum = treeset.ceiling(15);
		System.out.println(ceilNum);
		
		// 내림차순 반복자 리턴 descendingIterator()
		Iterator<Integer> iterator = treeset.descendingIterator();
		while(iterator.hasNext()) {
			int a = iterator.next();
			System.out.println(a);
		}
		// 내림차순 set을 리턴 descendingSet()
		NavigableSet<Integer> treeset2 = treeset.descendingSet();
		System.out.println(treeset2);
		
		NavigableSet<Integer> treeset3 = treeset.headSet(50, false);
		System.out.println(treeset3);
		NavigableSet<Integer> treeset4 = treeset.tailSet(30, true);
		System.out.println(treeset4);
		
		NavigableSet<Integer> treeset5 = treeset.subSet(20, true, 90, false);
		System.out.println(treeset5);
	}

}
