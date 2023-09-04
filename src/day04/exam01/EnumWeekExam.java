package day04.exam01;

import java.util.Calendar;

public class EnumWeekExam {

	public static void main(String[] args) {
		Week today = null;
		Calendar cal = Calendar.getInstance();
		//오늘 날짜의 요일을 숫자로 반환 1~7
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
			
			
		}
		System.out.println("오늘 요일 :" + today);
		if(today==Week.TUESDAY || today==Week.THURSDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("노동을 합니다.");
			
		}
	}
}
