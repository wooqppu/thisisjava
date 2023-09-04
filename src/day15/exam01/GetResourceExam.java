package day15.exam01;

public class GetResourceExam {

	public static void main(String[] args) {
		Class clazz = Car.class;
		// getPath() url객체의 메소드로 절대 경로를 리턴
		String img1Path =  clazz.getResource("img1.jpg").getPath();
		String img2Path =  clazz.getResource("images/img2.jpg").getPath();
		System.out.println(img1Path);
		System.out.println(img2Path);
	}

}
