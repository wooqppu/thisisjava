package day13.exam04;

public class TimeExam {

	public static void main(String[] args) {
		
		// currentTimeMiles() 1/1000 초 단위 
		// --> 1970년 1월 1일 0시부터 현재까지 시간을 밀리초로 리턴 
		// nanoTime() 1/10^9 초 단위 
		// --> 1970년 1월 1일 0시부터 현재까지 시간을 나노초로 리턴
		
		long time1 = System.nanoTime();
		int sum = 0;
		for(int i=0; i<=1000000; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();
		System.out.println("계산에 " + (time2 - time1) + "나노초가 소요됐습니다." );
	}

}
