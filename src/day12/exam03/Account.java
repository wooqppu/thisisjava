package day12.exam03;

public class Account {
	// 필드
	private long balance;
	
	// 생성자
	public Account() {}
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money; // balance = balance + money
	}
	public void withdraw(int money) throws InsufficientException {
		if(balance < money) {
			throw new InsufficientException("잔고 부족 : " + (money-balance)+"모자람");
		}
		balance -= money;
	}
	
}
