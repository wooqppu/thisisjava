package day12.exam02;

public class ExceptionHandlingExam3 {

	public static void main(String[] args) {
		// 배열의 길이는 2, 마지막 index 1 
		// ArrayIndexOutOfBoundsException 배열인덱스초과예외
		
		String[] array = {"100", "loo"};
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]); // ---> NumberFormatException 발생 (문자열 숫자로 변환X) 
				System.out.println("array["+i+"]" +value);
			} 
//			catch(NumberFormatException e) {
//				System.out.println("숫자로 변환할 수 없음 : " + e.getMessage());
//			}
//			catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("배열 인덱스가 초과됨" + e.getMessage());
//			}
			catch(Exception e) { // 예외처리 제일 상위 클래스가 다른 하위 예외처리를 다 포함 
				System.out.println("모든 예외를 처리함" + e.getMessage());
			}
		}
		System.out.println("프로그램");
	}

}
