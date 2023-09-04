package day15.exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClassExam {

	public static void main(String[] args) throws Exception {
		Class clazz = Car.class;
		
		// 클래스 객체 얻기
		Class clazz2 = Class.forName("day15.exam01.Car");
		Car carClass = new Car();
		Class clazz3 = carClass.getClass();
		
		System.out.println("패키지 : " + clazz.getPackage().getName());
		System.out.println("클래스 간단 이름 : " + clazz.getSimpleName());
		System.out.println("클래스 전체 이름 : " + clazz.getName());
		
		
		System.out.println("생성자 정보");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor con : constructors) {
			System.out.print(con.getName() +"(");
			Class[] parameters = con.getParameterTypes();
			for(int i = 0; i < parameters.length; i++) {
				System.out.print(" " + parameters[i].getName());
				if(i<parameters.length-1) {
					System.out.print(",");
				}
			}
			System.out.println(")");
		}
		System.out.println("필드 정보");
		Field[] fields = clazz.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f.getType().getName() + " " + f.getName());
		} 
		System.out.println("메소드 정보");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method m : methods) {
			System.out.print(m.getName() + "(");
			
			Class[] parameters = m.getParameterTypes();
			for(int i = 0; i < parameters.length; i++) {
				System.out.print(parameters[i].getName());
				if(i<parameters.length-1) {
					System.out.print(",");
				}
			}
			System.out.println(")");
		}
	}

}
