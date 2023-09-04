package day07.exam03;

public class Account2 {
	// 20번 답안
	String accountNum; // 계좌번호
	String accountName; // 계좌주
	int balance; // 잔고
	
	
//	public Account2() {} // ---> 밑의 생성자랑 얘랑 기능에 뭔 차이가 있음? 디폴트 생성자?
	
//	public Account2(String accountNum, String accountName, int balance) {
//		this.accountNum = accountNum;
//		this.accountName = accountName;
//		this.balance = balance;
//	}
	
	// getter, setter 생성 -> shift + alt + s 눌러서 출력 
	// get 필드 값을 받아옴 set 필드 값을 변경 
	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
