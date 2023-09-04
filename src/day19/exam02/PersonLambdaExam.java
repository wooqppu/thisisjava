package day19.exam02;

public class PersonLambdaExam {
	public static void main(String[] args) {
		Person person = new Person();
		person.action1((name, job)->{
			System.out.print(name + "이 ");
			System.out.println(job + "를 합니다.");
		});
		// 홍길동이 프로그래밍을 합니다. 
		person.action2((content)->{
			System.out.println(content + " 라고 말합니다.");
		});
		// 안녕하세요 라고 말합니다. 
		
	}

}
