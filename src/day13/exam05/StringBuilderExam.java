package day13.exam05;

public class StringBuilderExam {

	public static void main(String[] args) {
		StringBuilder data = new StringBuilder();
		data = data.append("보내줘보내줘");
		data = data.insert(3, "집에");
		String str = data.toString();
		System.out.println(str);
		
		data = data.delete(0, 3);
		String str2 = data.toString();
		System.out.println(str2);
		
		data.replace(0, 2, "ToHome");
		String str3 = data.toString();
		System.out.println(str3);

	}

}
