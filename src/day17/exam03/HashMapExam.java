package day17.exam03;


import java.util.*;
import java.util.Map.Entry;


public class HashMapExam {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		// 객체 저장
		map.put("강백호", 17);
		map.put("서태웅", 18);
		map.put("송태섭", 19);
		map.put("정대만", 20);
		map.put("권준호", 21);
		map.put("채치수", 22);
		map.put("강백호", 20);
		
		// 키로 값 얻기
		int value = map.get("강백호");
		System.out.println(value);
		
		int size = map.size();
		System.out.println(size);
		
		// 키로 Entry 삭제
		map.remove("강백호");
		
		int size2 = map.size();
		System.out.println(size2);
		
		boolean re = map.containsKey("이명헌");
		System.out.println("이명헌 Key는 : " + re);
		
		boolean re2 = map.containsValue(22);
		System.out.println(re2);
		
		// 키 set 컬렉션 얻고 반복하기
		Set<String> keySet = map.keySet();
		// 반복자 얻기
		Iterator<String> keyIterator = keySet.iterator();
		// 가져올 값이 있는지 체크
		while(keyIterator.hasNext()) {
			// 값을 가져옴
			String k = keyIterator.next();
			// 키로 값을 반환 
			Integer v = map.get(k);
			System.out.println(k + " " + v);
			
		}
		System.out.println("----------------------");
		
		// Entry를 set 컬렉션으로 반환 (map ---> set)
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey(); // entry key값 리턴
			Integer v = entry.getValue(); // entry value값 리턴
			System.out.println(k + " : " + v);
		}
		
		map.clear(); // map에 있는 Entry 전부 제거
		System.out.println(map.isEmpty()); // map이 비어있는지 체크, 비었으면 true 아니면 false

	}

}
