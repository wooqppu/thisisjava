package day07.exam03;

public class PrinterExam {
	// 16번 답안
	public static void main(String[] args) {
		Printer aaa = new Printer(); { // 첫번째 : 클래스명 두번째 : 객체 명 --- 객체 명? 인스턴스 명? 
		String str = new String("dddd");
		String aaaaa = String.valueOf(10);
			aaa.println(10);
			aaa.println(true);
			aaa.println(5.7);
			aaa.println("Hong");
			// 17번 답안 클래스로 부르려면 클래스명으로 출력 -> 정적 메소드 
			Printer.println(10);
			Printer.println(true);
			Printer.println(5.7);
			Printer.println("Hong");
			
		}

	}

}
