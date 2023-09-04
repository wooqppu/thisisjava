package day18.exam01;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		// TreeMap 컬렉션 생성
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		// 엔트리 저장 set-add map-put
		// 엔트리 저장은 'key값 기준'으로 오름차순 정렬
		treeMap.put("a", 10);
		treeMap.put("b", 80);
		treeMap.put("c", 60);
		treeMap.put("d", 30);
		treeMap.put("e", 40);
		
		// Map은 향상된 for문 사용 불가능 (set, list는 가능)
		// 항샹된 for문 사용하려면 Map을 Set으로 바꿔서 리턴해야함
		//Set<Entry<String, Integer>>entrySet = treeMap.entrySet(); // 방법1
		for(Entry<String, Integer> entry : treeMap.entrySet()) { // 방법2
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("-------------------");
		
		// 특정 key에 대한 값 가져오기
		Entry<String, Integer> reEntry = null;
		reEntry = treeMap.firstEntry();
		System.out.println(reEntry.getKey() + " , " + reEntry.getValue());
		reEntry = treeMap.lastEntry();
		System.out.println(reEntry.getKey() + " , " + reEntry.getValue());
		
		// 기준보다 앞 단어 
		reEntry = treeMap.lowerEntry("e");
		System.out.println(reEntry.getKey() + " , " + reEntry.getValue());
		// 기준보다 뒤 단어 
		reEntry = treeMap.higherEntry("a");
		System.out.println(reEntry.getKey() + " , " + reEntry.getValue());
		
		// 내림차순 정렬하기
		NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
		// Map ---> Set 으로 변환리턴
		Set<Entry<String, Integer>> descendingSet = descendingMap.entrySet();
		for(Entry<String, Integer> e : descendingSet) { 
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		// 범위 검색
		System.out.println("[c~e 사이의 단어 검색]");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "e", true);
		for(Entry<String, Integer> e : rangeMap.entrySet()) {
			System.out.println(e.getKey() + " * " + e.getValue());
		}
		
	}

}
