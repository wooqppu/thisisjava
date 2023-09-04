package day05.exam01;

public class MultiArrayExam {

	public static void main(String[] args) {
		//각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열
		int[][] mathScores = new int[2][3]; 
		mathScores[0][0] =80;
		mathScores[0][1] =83;
		mathScores[0][2] =85;
		mathScores[1][0] =87;
		mathScores[1][1] =90;
		mathScores[1][2] =92;
		
		int[][] engScore = {
				{80,83,85},
				{87,90,92}
		};
		// 80을 출력하려면
		// engScore[0][0];
		//int[] scores = { 1,2,3 }; //1이 들어간 자리에 배열이 있다
		
		int mathSum = 0;
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				mathSum = mathSum + mathScores[i][j];
			}
		}
		System.out.println("수학 점수의 합은 : " + mathSum);
		
		int[][] engScores = {
				{80,83,85},
				{87,90}
		};
		System.out.println("engScores의 배열길이는 : " + engScores.length);
		System.out.println("engScores[0]의 배열길이는 : " + engScores[0].length);
		System.out.println("engScores[1]의 배열길이는 : " + engScores[1].length);
	}

}
