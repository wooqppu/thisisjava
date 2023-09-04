package day07.package01;

public class B {
	A a1 = new A(true);
	A a2 = new A(1);
	String aName = a1.name;
	int speed = a1.getSpeed(); // 캡슐화
	
//	a1.speed; ----> private필드 지정해놔서 외부에서 사용 불가능 
//	A a3 = new A("그린");
// private키워드 생성자는 외부에서 호출할 수 없음 
}
