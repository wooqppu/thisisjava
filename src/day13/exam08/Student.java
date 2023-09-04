package day13.exam08;

public class Student {
	private String studentNum; 
	
	public Student(String studentNum) {
		this.studentNum =  studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// Student 클래스의 인스턴스인지 확인
		// 강제타입변환 Student타입으로
		if(obj instanceof Student) {
			Student stu = (Student) obj;
			if(studentNum.equals(stu.studentNum)) {
				return true;
			}
		}
		return false;
	}
}
