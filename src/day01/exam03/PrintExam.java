package day01.exam03;

public class PrintExam {

	public static void main(String[] args) {
		//System.out 표준출력장치
		System.out.print("안녕");
		System.out.print("안녕");
		System.out.print("안녕");
		
		System.out.println("안녕");
		System.out.println("안녕");
		System.out.println("안녕");
		
		System.out.printf("내 이름은 %s이고 나이는 %d이다.", "김그린", 25);
		
		System.out.printf("이름 : %1$s , 나이 : %2$d", "abc", 20);
		
		System.out.printf("이름 : %10s , 나이 : %2$d", "abc", 20);
		// 이름값에 왼쪽 여백 10칸 지정, 나이는 2번째 값을 받음
		
		System.out.printf("이름 : %-10s , 나이 : %2$d", "abc", 20);
		// 이름값에 오른쪽 여백 10칸 지정, 나이는 2번째 값을 받음
		
		
		System.out.println();
		System.out.printf("%010.4f", 12.123456);
		// 왼쪽 여백 10칸을 주고, 소수점 4번째 자리까지의 값을 산출 후 남은 여백 자리는 0으로 채움 
		
	}

}
