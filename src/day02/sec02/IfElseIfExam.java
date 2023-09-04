package day02.sec02;

public class IfElseIfExam {

	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90){
			System.out.println("A");
		}	
		else if(score>=80) {
			System.out.println("B");
		}
		else if(score>=70) {
			System.out.println("C");
		}		
		else { 
			System.out.println("D");
		}
		
		
//		double iRandom3 = (int) (Math.random()*6) + 1;
//		if (iRandom3 == 1) {
//			System.out.println("1입니다.");
//		}
//		else if (iRandom3 == 2) {
//			System.out.println("2입니다. ");
//		}
//		else if (iRandom3 == 3) {
//			System.out.println("3입니다. ");
//		}
//		else if (iRandom3 == 4) {
//			System.out.println("4입니다.") ;
//		}
//		else if (iRandom3 == 5) {
//			System.out.println("5입니다. ");
//		}
//		else { 
//			System.out.println("6입입니다. ");
//		}
		
		
		
		int iRandom = (int) (Math.random()*6) + 1;
		switch(iRandom) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		case 5:
			System.out.println("5입니다.");
			break;
		default:
			System.out.println("6입니다.");
			break;
		}
	}
}
