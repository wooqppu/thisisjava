package day18.exam01;

import java.util.TreeSet;

public class FruitComparatorExam {

	public static void main(String[] args) {
		TreeSet<Fruit> treeset = new TreeSet<>(new FruitComparator());
		
		treeset.add(new Fruit("포도", 5000));
		treeset.add(new Fruit("수박", 9000));
		treeset.add(new Fruit("딸기", 10000));
		treeset.add(new Fruit("망고", 12000));

		for(Fruit f : treeset) {
			System.out.println(f.name + " " + f.price);
		}
	}

}
