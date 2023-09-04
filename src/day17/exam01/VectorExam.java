package day17.exam01;

import java.util.List;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		// Vector 컬렉션 생성 
		List<Board> list = new Vector<>();
		
		// 작업스레드 객체 생성1
		Thread threadA = new Thread() {

			@Override
			public void run() {
				// 객체 10개 추가 
				for(int i=1; i<=1000; i++) {
					list.add(new Board("제목" +i, "내용" +i, "글쓴이" +i));
				}
			}
			
		};
		// 작업스레드 객체 생성2
		Thread threadB = new Thread() {

			@Override
			public void run() {
				// 객체 10개 추가 
				for(int i=1001; i<=2000; i++) {
					list.add(new Board("제목" +i, "내용" +i, "글쓴이" +i));
				}
			}
			
		};
		// 작업스레드 실행
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int size = list.size();
		System.out.println("총 객체 수 : " + size);

	}

}
