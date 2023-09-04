package day05.exam01;

import java.util.Scanner;

public class ArrayExam03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		// 제일 큰 수 구하기
		// 숫자 5개를 입력받고 배열에 넣은 뒤 그 중 큰 수 구하기 
		int[] nums = new int[5]; // {0,0,0,0,0}
		System.out.println("숫자 5개 : ");
		for(int i=0; i<nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		// 큰 수를 담을 변수에 0번째 값을 할당
		int maxNum = nums[0];
		// nums[1]의 숫자가 maxNum보다 크나요? 크다면 maxNum에 nums[1] 할당
		// nums[2]의 숫자가 maxNum보다 크나요? 크다면 maxNum에 nums[2] 할당
		for(int i=1; i<nums.length; i++) {
			if(nums[i] > maxNum) {
				maxNum = nums[i];
			}
		}
		System.out.println("최대값 : " + maxNum);
		scan.close();
		
		
	}

}
