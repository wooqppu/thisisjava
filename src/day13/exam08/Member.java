package day13.exam08;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return id + " : " + name;
	}

}
