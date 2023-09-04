package day13.exam05;

import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String data1 = "강백호&서태웅,채소연";
		String[] arr = data1.split("&|,");
		
		for(String a : arr) {
			System.out.println(a);
		}
		System.out.println();
		
		String data2 = "강백호/서태웅/채소연";
		StringTokenizer st = new StringTokenizer(data2, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token); 
		}

	}

}
