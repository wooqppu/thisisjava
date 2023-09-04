package day13.exam08;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Quiz15 {

	public static void main(String[] args) {
		LocalDateTime endDay = LocalDateTime.of(2023, 12, 31, 0, 0, 0);
		LocalDateTime now = LocalDateTime.now();
		
		long remainDays = now.until(endDay, ChronoUnit.DAYS);
		System.out.println("남은 일 수 : " + remainDays);
		
		
		// 16번
		Date now2 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		System.out.println(sdf.format(now2));
		
	}

}
