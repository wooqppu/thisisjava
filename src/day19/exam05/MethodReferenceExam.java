package day19.exam05;

public class MethodReferenceExam {

	public static void main(String[] args) {
		Person person = new Person();
		
		// 익명 구현 객체
//		person.ordering(new Comparable() {
//			
//			@Override
//			public int compare(String a, String b) {
//				return a.compareToIgnoreCase(b);
//			}
//		});
		
		// 람다식
		person.ordering((a,b)->{
			return a.compareToIgnoreCase(b);
			});
		
		// 매개변수의 메소드 참조
		//person.ordering(String :: compareToIgnoreCase);
	}

}
