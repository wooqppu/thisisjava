package day13.exam07;

import java.util.Random;

public class MathExam {

	public static void main(String[] args) {
		double v1 = Math.ceil(5.3); // 올림
		double v2 = Math.floor(5.3); // 내림
		double v3 = Math.round(5.3); // 반올림
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		int i1 = Math.abs(-123);
		System.out.println(i1);
		
		int v4 = Math.max(10,20);
		System.out.println(v4);
		
		int v5 = Math.min(2, 1);
		System.out.println(v5);
		
		// 소수 이하 두자리 얻기 
		double value = 12.3456;
		double temp1 = value*100; // 1234.56
		long temp2 = Math.round(temp1); // 1235
		double v6 = temp2/ 100.0; // 12.35
		System.out.println(v6);
		
		System.out.println(Math.random());
		int[] selectNum = new int[6];
		int[] selectNum2 = new int[6];
		
		Random random = new Random(3);
		
		System.out.println(random.nextInt(45)) ; // 0~44까지 중에서 랜덤한 숫자 만들어줌 (방법1)
		
		int num = random.nextInt(45);
		System.out.println(num);
		
		for(int i=0; i<6; i++) { // (방법2)
			selectNum[i] = random.nextInt(45)+1;
		}
		
//		for(int a:selectNum) {
//			System.out.println(a);
//		}
//		
		Random random2 = new Random(3);
		for(int i=0; i<6; i++) { 
			selectNum2[i] = random2.nextInt(45)+1;
		}
		for(int a:selectNum2) {
			System.out.println(a);
		}
	}

}
