package day12.exam02;

public class ExceptionHandlingExam4 {

	public static void main(String[] args) {
		String[] array = {"100", "loo", null, "200"};
		
		for(int i=0; i<=array.length; i++) {
			try {
			int value = Integer.parseInt(array[i]);
			System.out.println("array["+i+"]" + value);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스가 초과됨 : " + e.getMessage());
		}
		// 두개 이상의 예외를 하나의 catch블럭에서 처리하고 싶을 때
		catch( NullPointerException | NumberFormatException e) {
			System.out.println("데이터에 문제 있음 : " + e.getMessage());
		}
		finally {
			System.out.println("ㅇㅇㅇㅇㅇㅇㅇ");
		}	
		}
	}
}
