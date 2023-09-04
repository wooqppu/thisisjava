package day15.exam03;

public class ProductGenericExam {

	public static void main(String[] args) {
		
		// K는 TV타입, M은 String타입
		Product<TV, String> product1 = new Product<>();
				
		// Setter
		product1.setKind(new TV());
		product1.setModel("스마트TV");
		
		// Getter
		TV tv = product1.getKind();
		String tvModel = product1.getModel();
		
		// K는 Car타입, M은 String타입
		Product<Car, String> product2 = new Product<>();
						
		// Setter
		product2.setKind(new Car());
		product2.setModel("SUV자동차");
				
		// Getter
		Car car = product2.getKind();
		String CarModel = product2.getModel();

	}

}
