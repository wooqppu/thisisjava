package day13.exam06;

public class BoxingExam {

	public static void main(String[] args) {
		// Boxing (포장타입에 기본타입 넣어도 자동 언박싱)
		Integer obj1 = 200;
		Integer obj2 = 300;
		Integer obj3 = new Integer(600);
		
		// Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		// 기본타입 변수에 포장타입 변수만 대입해도 자동 언박싱
		int value4 = obj1;
		int value5 = obj2;
		int value6 = obj3;
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		Integer num1 = 200;
		Integer num2 = 200;
		
		// -128~127
		Integer num3 = 100;
		Integer num4 = 100;
		
		System.out.println(num3.equals(num4)); // 효용성을 위해 해당범위(-128~127) 내에서는 값 비교가 가능함
		
		// System.out.println(num1==num2); // false; -> 포장객체의 번지를 비교하기 때문에 다르다고 나옴 
		System.out.println(num1.equals(num2)); // 문자열처럼 equals 이용해서 값을 비교해야 같다고 나옴 
		
		
		// 포장 클래스를 타입별로 사용 가능 ---> ? 모르겟다
		int a  = Integer.parseInt("1220");
		float f = Float.parseFloat("2.456f");
		boolean b = Boolean.parseBoolean("true");
		
		
	}

}
