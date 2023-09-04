package day12.exam01;

public class BigBurgerSet {
	private BigBurger bigBurger;
	private Coke coke;
	private FrenchFries frenchFries;
	
	public BigBurgerSet(BigBurger bigBurger, Coke coke, FrenchFries frenchFries) {
		this.bigBurger = bigBurger;
		this.coke = coke;
		this.frenchFries = frenchFries;
	}

	public BigBurger getBigBurger() {
		return bigBurger;
	}

	public void setBigBurger(BigBurger bigBurger) {
		this.bigBurger = bigBurger;
	}

	public Coke getCoke() {
		return coke;
	}

	public void setCoke(Coke coke) {
		this.coke = coke;
	}

	public FrenchFries getFrenchFries() {
		return frenchFries;
	}

	public void setFrenchFries(FrenchFries frenchFries) {
		this.frenchFries = frenchFries;
	}
	
}
