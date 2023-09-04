package day10.exam01;

public class Zealot implements Unit2 {
	String name;
	int hp;
	int attack;
	
	public Zealot(String name) {
		this(name, 100, 10);
	}
	public Zealot(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	
	@Override
	public int getAttack() {
		return attack;
	}
	@Override
	public int getHp() {
		return hp;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setHp(int hp) {
		this.hp = hp;
	}
	
}
