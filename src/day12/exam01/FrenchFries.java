package day12.exam01;

public class FrenchFries {
	private int price;
	private String desc;
	public FrenchFries() {
		this(1000, "감자튀김");
	}
	
	public FrenchFries (int price, String desc) {
		this.price = price;
		this.desc = desc;
		System.out.println(desc + "이 만들어졌습니다.");
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
