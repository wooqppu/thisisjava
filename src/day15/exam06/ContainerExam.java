package day15.exam06;

public class ContainerExam {

	public static void main(String[] args) {
		Container<String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		System.out.println(container1);
		
		Container<Integer> container2 = new Container<>();
		container2.set(6);
		int value = container2.get();
		System.out.println(container2);

	}

}
