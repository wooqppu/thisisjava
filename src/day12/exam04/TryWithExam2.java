package day12.exam04;

public class TryWithExam2 {

	public static void main(String[] args) {
		
		try(MyResource res1 = new MyResource("res2");
				MyResource res2 = new MyResource("res2"); 
				) {
			// 리소스 읽기
			System.out.println(res1.read2());
			System.out.println(res2.read2());
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
