package day05.exam01;

import java.util.Scanner;

public class Exam00 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		// 제일 작은 수 구하기 
		// 숫자 5개를 입력받고 배열에 넣은 뒤 그 중 작은 수 구하기 
		int[] nums = new int[5]; // {0,0,0,0,0}
		System.out.println("숫자 5개 : ");
		for(int i=0; i<nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		// 작은 수를 담을 변수에 0번째 값을 할당
		int minNum = nums[0];
		// nums[1]의 숫자가 minNum보다 작나요? 작다면 minNum에 nums[1] 할당
		// nums[2]의 숫자가 minNum보다 작나요? 작다면 minNum에 nums[2] 할당
		for(int i=1; i>nums.length; i++) {
			if(nums[i] < minNum) {
				minNum = nums[i];
			}
		}
		System.out.println("최소값 : " + minNum);
		scan.close();
		

	}

}
