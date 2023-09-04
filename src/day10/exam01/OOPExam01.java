package day10.exam01;

public class OOPExam01 {
	
	
	// attack 오버로딩 // 질럿, 드라군, 히드라 각자 공격 3개 만들기
	// 질럿이 드라군을 공격 // 메소드 오버로딩
	static void attack(Unit2 u1, Unit2 u2) {
		u1.setHp(u1.getHp()-u2.getAttack());
		System.out.println(u1.getName() + "이 " + u2.getName() + 
				"에게 공격 당해서 체력이 " + u1.getHp() + "가 되었습니다.");
	}

	public static void main(String[] args) {
		Zealot z1 = new Zealot("질럿1");
		Dragoon d1 = new Dragoon("드라군1");
		Hydra h1 = new Hydra("히드라1");	
		
		attack(z1,d1);
		attack(h1,d1);
		attack(d1,d1);
		attack(z1,h1);
		attack(z1,z1);
		attack(h1,h1);
		
	}

}
