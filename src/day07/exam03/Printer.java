package day07.exam03;

public class Printer {
	// 16번 답안 - 메소드 오버로딩
	// 17번 답안 : 앞에 static 추가로 정적멤버, static 없으면 객체로 호출 --- ? 인스턴스랑 객체 차이? 정적멤버? 가 뭔데? 
	static public void println(int p) {
		System.out.println(p);
	} 
	static public void println(boolean p) {
		System.out.println(p);
	}
	static public void println(double p) {
		System.out.println(p);
	}
	static public void println(String p) {
		System.out.println(p);
	}
}
