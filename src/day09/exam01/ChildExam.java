package day09.exam01;

public class ChildExam {

	public static void main(String[] args) {
		// 자식 객체 생성
		Child child = new Child();

		// 자동 타입 변환 
		Parent2 parent = child;
		Parent2 parent2 = new Parent2(); //---> 얘는 왜 나온거임?
		parent.method1(); // 자식메소드1
		parent2.method1(); // 부모메소드
		child.method3();

	//	parent.method3(); 쓸 수 없음 ---> 얘는 왜 못씀? 
	//	자식타입 객체를 부모타입으로 자동변환했을 때
	//	부모타입의 메소드와 필드만 사용 가능
	// 	이 때 자식 클래스에서 오버라이딩한 메소드는 자식메소드가 적용됨
	
	}

}
