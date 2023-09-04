package day05.exam01;

import java.util.Scanner;

public class ArrayQuiz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		//문제1) 4자리 이하의 10개의 정수를 입력받아 짝수 중 
		//가장 큰 값과 홀수 중 가작 작은 값을 출력하는 프로그램 
		
		int[] nums = new int[10]; // {0,0,0,0,0,...}
		// 최소값, 최대값 설정
		int max = 0; // 가장 작은 수보다 더 작은 수 
		int min = 10000; // 가장 큰 수보다 더 큰 수로 설정해야 이후에 작은 값들로 변경, 비교 가능
		
		for(int i=0; i<10; i++) {
			nums[i] = scan.nextInt();
			// 짝수일 때
			if(nums[i]%2==0) {
				// 짝수의 값이 max보다 크면 max에 그 값을 할당
				if(nums[i]>max) {
					max = nums[i];
				}
			}
			// 홀수일 때
			else {
				// 홀수의 값이 min보다 작으면 min에 그 값을 할당
				if(nums[i]<min) {
					min = nums[i];
					}
				}
		}
		System.out.println("홀수 중에 최소값은 : " + min);
		System.out.println("짝수 중에 최대값은 : " + max);
		
		// 문제2) 5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고 
		// 오름차순으로 정렬하는 프로그램
		
		int[] nums2 = {95,75,85,100,50}; //nums2[0] 와 nums2[1] 바꾸기  tmp = nums2[0] // nums2[0] = nums2[1]  // nums2[1] = tmp;
		// {75,95,85,100,50}
		// {50,95,85,100,75}
		// {50,75,95,100,85}
		// {50,75,85,100,95}
		// {50,75,85,95,100}
		int tmp = 0; // 바꿔치기 해주기위한 빈 그릇
		for(int i=0; i<nums2.length-1; i++) {
			for(int j=i+1; j<nums2.length; j++) {
				//nums2[i]보다 nums2[j]가 작으면 바꾸기
				if(nums2[i]>nums2[j]) {
					tmp = nums2[i]; // nums2[0]을 tmp에 담기
					nums2[i] = nums2[j]; // nums2[1]을 nums2[0]에 담기
					nums2[j] = tmp; // tmp를 nums2[1]에 담기  
				}
			}
		}
		for(int i=0; i<nums2.length-1; i++) {
			System.out.println(nums2[i]);
		}
		
		
		}
	}
