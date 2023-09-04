package day01.exam03;

import java.io.IOException;

public class KeyCodeExam {

	public static void main(String[] args) throws Exception {
		// System.out 표준출력장치 
		// System.in 표준입력장치
		int keyCode;
		while (true) { 
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		}
		
	}

}
