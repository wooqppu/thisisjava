package day09.exam01;

public class ChildExam2 {

	public static void main(String[] args) {
		// 클래스 타입의 자동타입변환과 강제타입변환 
		Parent2 parent1 = new Parent2(); 
		Parent2 parent2 = new Child2(); 
		Parent2 parent3 = new Child2(); 
		Child2 child1 = new Child2();
		
		// parent2는 Parent2타입으로 필드와 메소드 사용
		parent2.field1 = "안녕";
	// parent2.field2 = "안녕"; (불가능) ---> 왜 불가능? 이해X
		
		// 강제타입변환
		Child2 child2 = (Child2) parent2;
	//	Child2 child3 = (Child2) parent1; (불가능) ---> 자동타입변환이 안되서 강제타입변환 못함
		child2.method3();
		child2.field2 = "하이";
		
		typeChange(parent1); // Parent타입이라서 출력 불가능
		typeChange(parent2); // Child타입이라서 출력 가능
		typeChange(parent3); // Child타입이라서 출력 가능
		
		
		// instanceof 연산자 
		// 객체 instanceof 클래스 타입
		 System.out.println(parent1 instanceof Child2);
		 System.out.println(parent2 instanceof Child2);
		 System.out.println(parent2 instanceof Parent2);
		
	}
	// Parent2타입 객체를 전달받아 Child2타입으로 강제타입전환 
	public static void typeChange(Parent2 parent) {
		// 모든 Parent2타입을 강제타입변환할 수 없음 
		// Child2타입의 객체가 자동타입변환된 경우에만 강제타입변환 가능 
		// Child2타입인지 확인을 instanceof로 할 수 있음
		if(parent instanceof Child2) {
			Child2 child = (Child2) parent;
			System.out.println("강제타입변환됨");
		}
	}

}
