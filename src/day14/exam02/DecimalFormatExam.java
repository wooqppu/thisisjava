package day14.exam02;

import java.text.DecimalFormat;

public class DecimalFormatExam {
	
	public static void main(String[] args) {
		double num = 123456.789;
		// \u00A4 통화기호, % , .소수자리, 단위구분 
		// 형식 객체를 생성 
		// 형식객체.format(숫자) ---> 형식화된 문자열을 리턴 
		DecimalFormat df = new DecimalFormat("#,###.####");
		System.out.println(df.format(num));
	}
}
