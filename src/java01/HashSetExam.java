package java01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		// set은 순서x, 중복x
		Set<String> set = new HashSet<>();
		
		// 객체 저장
		set.add("java");
		set.add("oracle");
		set.add("jdbc");
		set.add("servlet");
		set.add("jsp");
		set.add("java");
		
		System.out.println(set);
		
		Set<Board> boardset = new HashSet<>();
		boardset.add(new Board("제목1", "내용1", "글쓴이1"));
		boardset.add(new Board("제목2", "내용2", "글쓴이2"));
		boardset.add(new Board("제목3", "내용3", "글쓴이3"));
		boardset.add(new Board("제목1", "내용1", "글쓴이1"));
		
		System.out.println("총 객체 수 : " + boardset.size());
		
		// 객체를 하나씩 가져와서 처리 
		Iterator<Board> iterator = boardset.iterator();
		while(iterator.hasNext()) {
			// 객체를 하나씩 꺼내오기
			Board b = iterator.next();
			System.out.println(b.getContent());
		}
		
	}

}
