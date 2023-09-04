package day20.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		for(int i = 1; i <= 1000; i++) {
			list.add("green" + i);
		}
		// 병렬처리 스트림 생성
		Stream<String> stream = list.parallelStream();
		stream.forEach(name->{
			// 현재 사용되는 스레드 반환 
			Thread thread = Thread.currentThread();
			System.out.println(name + " : " + thread.getName());
		});

	}

}
