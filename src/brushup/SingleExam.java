package brushup;

public class SingleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Single si1 = Single.getInstaneof();
		Single si2 = Single.getInstaneof();
		if (si1 == si2) {
			System.out.println("참조하는 객체가 같다.");
		}

	}

}
