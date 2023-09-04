package day18.exam01;

import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {
		// Stack클래스는 LIFO자료구조를 구현한 클래스
		
		Stack<Coin> coinBox = new Stack<Coin>();
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(40));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(80));
		coinBox.push(new Coin(20));

		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼낸 동전 : " + coin.getValue());
		}
	}

}
