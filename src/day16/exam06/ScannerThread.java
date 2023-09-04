package day16.exam06;

import java.util.Scanner;

public class ScannerThread {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		MyThread mt = new MyThread();
//		mt.start();
		
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1; i<=5; i++) {
					System.out.println(i);
				}
			}
					
		});
		thread.start();
		System.out.println("아무값이나 입력하세요");
		String input = sc.nextLine();
	}

}
