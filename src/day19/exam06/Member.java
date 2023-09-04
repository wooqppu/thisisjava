package day19.exam06;

public class Member {
	private String id;
	private String name;
	
	public Member(String id) {
		this.id = id;
	}
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		String info = "{ id : " + id +", name : "+ name + "}";
		return info;
	}
	

}
