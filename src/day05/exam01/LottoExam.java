package day05.exam01;

public class LottoExam {

	public static void main(String[] args) {
		// 1~45번 그 중에 6개의 숫자를 맞추는 게임
		// 6개의 숫자 랜덤으로 중복없이 출력하기
		int[] lotto = new int[6];
		// 번호 생성하기
		for(int i=0; i<lotto.length; i++) {
			lotto[i] =(int) (Math.random() * 45) + 1; // 1~45 중 랜덤숫자 추출
			// 번호 중복 제거
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break; // 예시 : lotto[0] = 42; i=1,j=0 lotto[1] = 42 ---> 값이 일치하기 때문에 i는 다시 0으로 감소 --> 상위 조건(i가 증감)을 다시 반복 
				}
			}
		}
		System.out.println("로또번호 : ");
		for(int i=0; i<6; i++) {
			System.out.println(lotto[i] + " ");
		}
	}

}
