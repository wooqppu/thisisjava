package day15.exam03;

public class BoxObjectExam {
	// 타입파라미터는 기본적으로 Object으로 간주됨
	// Object클래스가 가지고있는 equals()메소드를 호출함 
	public static void main(String[] args) {
		BoxObject box1 = new BoxObject();
		box1.content = "100";
		
		BoxObject box2 = new BoxObject();
		box2.content = "100";
		
		BoxObject box3 = new BoxObject();
		box3.content = 100;
		
		boolean result1 = box1.compare(box2);
		System.out.println("result1 : " + result1);
		
		boolean result2 = box1.compare(box3);
		System.out.println("result2 : " + result2);

	}

}
