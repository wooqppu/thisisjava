package day15.exam03;

public class BoxGenericExam {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요";
		String str = box1.getContent();
		box1.setContent("ggggg");
		System.out.println(box1.getContent());
		
		Box<Integer> box2 = new Box<>();
		box2.content = 300;
		int num = box2.content;
		System.out.println(num);

	}

}
