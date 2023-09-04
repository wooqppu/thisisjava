package day13.exam04;

public class ExitExam {

	public static void main(String[] args) {
		// exit()메소드는 프로세스를 종료시킴
		// 종료 상태값을 전달하는 데 정상종료일 때는 0, 비정상종료일 때는 1,-1
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i == 5) {
				System.out.println("프로세스 강제종료");
				System.exit(0);
			}
		}

	}

}
