package day07.exam03;

public class Account {
	// 19번 답안
	// 인스턴스 필드 : 잔고
	private int balance;
	// 상수 
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;

	public int getBalance() {
		return this.balance;
	}
	
	// 삼항연산자 : String str = 조건 ? "a" : "b";
	public void setBalance(int balance ) {
		this.balance = balance >= Account.MIN_BALANCE 
				&& balance <= Account.MAX_BALANCE ? balance : this.balance; 
	}
	
	
	
}
