package day13.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// Object타입이 Member타입인지 검사하고 
		// 타입 변환 후 target에 대입 
		if(obj instanceof Member target) {
			// Member m = (Member) obj; (target으로 대체 후 생략 가능)		
			// id문자열이 일치하는지 비교 	
		if(id.equals(target.id)) {
			return true;
		}
	}
		return false;
	}
}
