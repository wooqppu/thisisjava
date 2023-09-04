package day07.exam01;

public class ComputerExam {

	public static void main(String[] args) { // static : 정적멤버로 지정
		// Computer객체 생성
		Computer myCom = new Computer();
		// sum() 메소드 호출 시 합산 결과를 리턴받아서 result1에 할당
		// 정해지지 않은 갯수의 여러개의 값을 전부 더할 때 사용
		int result1 = myCom.sum(1,2,3);
		int result2 = myCom.sum(5,6,7,8,9,10);
		int[] nums = {1,2,3,4,5};
		int result3 = myCom.sum(nums); 
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		int result4 = myCom.add(2,10);
		System.out.println(result4);
		
		double result5 = myCom.add(2.56, 3.45);
		System.out.println(result5);
		
		double result6 = myCom.areaRectangle(10.5);
		double result7 = myCom.areaRectangle(10.5, 12.5);
		System.out.println(result6);
		System.out.println(result7);

	}

}
