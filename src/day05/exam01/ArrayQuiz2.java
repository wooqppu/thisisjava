package day05.exam01;

import java.util.Scanner;

public class ArrayQuiz2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하시오 : ");
		
		// 3) 5개의 정수를 입력받아서 내림차순(큰 수 -> 작은 수) 정렬 후 출력
		int[] nums = new int[5]; 
		for(int i=0; i<nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		
		// 내림차순 정렬
		int tmp = 0;
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1; j<nums.length; j++) {
				//nums[i]가 nums[j]보다 작으면 바꾸기
				if(nums[i]<nums[j]) {
					tmp = nums[i]; // nums[0]을 tmp에 담기
					nums[i] = nums[j]; // nums[1]을 nums[0]에 담기
					nums[j] = tmp; // tmp를 nums[1]에 담기  
				}
			}
		}
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
