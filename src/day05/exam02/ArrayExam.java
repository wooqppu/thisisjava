package day05.exam02;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = {10,30,20,50,60};
		System.out.println(array);
		for(int i : array) {
			System.out.println(i);
		}
		System.out.println("인덱스 번호 2개를 입력하세요 : ");
		int index1 = scan.nextInt();
		int index2 = scan.nextInt();
		int tmp;
		tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;
		
		for(int i : array) {
			System.out.println(i);
		}
		
	}

}
