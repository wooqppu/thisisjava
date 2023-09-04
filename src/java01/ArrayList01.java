package java01;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		System.out.println(list);
		
		list.add(0,"f");
		System.out.println(list);
		System.out.println(list.get(2));
		
		list.set(0, "g");
		System.out.println(list);
		System.out.println(list.size());
		
		list.remove(0);
		System.out.println(list);
		
		if(list.contains("e")) {
			System.out.println("e가 있습니다.");
		} else {
			System.out.println("e가 없습니다.");
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String str : list) {
			System.out.println(str);			
		}
		
		list.clear();
		if(list.isEmpty()) {
			System.out.println("비었습니다.");
		} else {
			System.out.println("비어있지 않습니다.");
		}

	}

}
