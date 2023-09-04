package brushup;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		// 숫자 5개를 입력받아서 큰 숫자 출력
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[5];
		System.out.println("숫자 5개 : ");
		for(int i=0; i<nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		int max = nums[0];
		for(int i=1; i<nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("최대값 : " + max);

	}

}
