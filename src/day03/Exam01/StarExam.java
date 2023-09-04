package day03.Exam01;

public class StarExam {

	public static void main(String[] args) {
				//star exam
				for(int i=0; i<5; i++) { //i= 1
					for(int j=0; j<=i; j++) {  //j<=1
						System.out.print("*");
					}
					System.out.println();
				}
				
				//star exam reverse 
				//i = 0 // j>0 5,4,3,2,1 
				//i = 1 // j>1 5,4,3,2
				//i = 2 // j>2 5,4,3
				//i = 3 // j>3 5,4
				//i = 4 // j>4 5
				for(int i=0; i<5; i++) { //i=0
					for(int j=5; j>i; j--) { //5>0 5,4,3,2,1
						System.out.print("*");
					}
					System.out.println();
				}
				
				// star exam2 공백 포함 역순 나열
				for(int i=0; i<5; i++) { //i=0
					for(int j=4; j>=0; j--) {  
						if(i < j) {   // 0 < j   4,3,2,1
							System.out.print(" ");
						}else { // j = 0 --> i < j 조건 성립X --> 별 1개 출력
							System.out.print("*");
						}
				
					} 
					System.out.println();
				}
				
	}

}
