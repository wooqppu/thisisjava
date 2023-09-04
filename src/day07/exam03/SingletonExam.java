package day07.exam03;

public class SingletonExam {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		// 동일한 객체인지 참조확인
		if(obj1 == obj2) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}

	}

}
