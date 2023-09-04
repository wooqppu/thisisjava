package day15.exam06;

public class Util {
	
	// 정적메소드 메소드이름 getValue 리턴 타입 객체의 key값을 리턴하거나 null을 리턴
	public static <K, V> V getValue(Pair<K, V> p, K k) {
		if(p.getKey() == k) {
			return p.getValue();
		} else {
			return null;
		}
	}
	
}
