package day02.sec01;

import java.util.Scanner;

public class YearExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + "년은 윤년입니다.");
				} else {
					System.out.println(year + "년은 평년입니다.");
				}
			} else {
				System.out.println(year + "년은 윤년입니다.");
			}
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
	}
}
