package day04.exam01;

public class StringMethod {

	public static void main(String[] args) {
		
		//length() 문자열길이 반환
		String str = "그린컴퓨터아카데미";
		int strNum = str.length();
		System.out.println(strNum);
		
		//charAt(index) 문자추출 index 0번부터 세기
		char ch = str.charAt(1);
		System.out.println(ch);
		
		//replace("특정문자", "변경될문자")
		String str2 = "파이썬은 재미있다.";
		String str3 = str2.replace("파이썬", "자바");
		System.out.println(str3);
		
		//substring(startIndex, endIndex) 문자열 추출
		String str4 = "javascript";
		String str5 = str4.substring(0,4); // 끝 번호는 포함X -> 바로 앞 번호까지의 문자열 추출
		System.out.println(str5);
		String str6 = str4.substring(5);
		System.out.println(str6);
		
		//indexOf("찾는문자열")
		//contains("찾는 문자열") ---> 찾는 문자열이 있으면 true, 없으면 false 리턴
		int charnum = str4.indexOf("c");
		System.out.println(charnum);
		
		String str7 = "자바 프로그래밍";
		boolean isjava = str7.contains("파이썬");
		System.out.println(isjava);
		
		//split("구분자") 문자열을 배열로 리턴
		String names = "그린, 블루, 오렌지";
		String[] names2 = names.split(",");
		System.out.println(names2[2]);
		
	}

}
