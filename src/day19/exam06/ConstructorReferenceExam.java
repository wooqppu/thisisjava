package day19.exam06;

public class ConstructorReferenceExam {

	public static void main(String[] args) {
		Person person = new Person();
		Member m1 = person.getMember1(new Creatable1() {
			public Member create(String id) {
				return new Member(id);
			} 
		});
		
		Member m2 = person.getMember1(id->new Member(id));
		Member m3 = person.getMember1(Member :: new);
		
		Member m4 = person.getMember2(new Creatable2() {
			@Override
			public Member create(String id, String name) {
				return new Member(id, name);
			} 
		});
		
		Member m5 = person.getMember2((id, name)->new Member(id, name));
		Member m6 = person.getMember2(Member :: new);
		System.out.println(m6);
		
	}

}
