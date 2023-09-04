package java01;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExam {

	public static void main(String[] args) {
		// hashtable 컬렉션 생성
		Map<String, Integer> map = new Hashtable<>();
		
		// 작업 스레드 객체 생성
		Thread threadA = new Thread() {

			@Override
			public void run() {
				// entry 1000개 추가 
				for (int i=1; i<=1000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		Thread threadB = new Thread() {

			@Override
			public void run() {
				// entry 1000개 추가 
				for (int i=1001; i<=2000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		// 작업 스레드 실행 
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 저장된 엔트리 수 얻기 
		int size = map.size();
		System.out.println("총 엔트리 수 : " + size);
	}
}
