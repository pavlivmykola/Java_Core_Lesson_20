package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationExecutor {

	public static synchronized void input(boolean direction) {
		ArrayList<Integer> arrayFibonachi = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		if (direction) 
		System.out.println("Введіть ціле число кількість чисел Фібоначі");
		 else System.out.println("Введіть ціле число кількість чисел Фібоначі зворотній порядок");
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			switch (i) {
			case 0:
				arrayFibonachi.add(1);
				break;
			case 1:
				arrayFibonachi.add(1);
				break;
			default:
				arrayFibonachi.add(arrayFibonachi.get(i - 2) + arrayFibonachi.get(i - 1));
			}
		}
		
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {

		}
		Iterator<Integer> iterator = arrayFibonachi.iterator();
		if (direction) {
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		} else {
			for (int i = arrayFibonachi.size() - 1; i >= 0; i--) {
				System.out.println(arrayFibonachi.get(i));
			}
		}

	}

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(2);

		executor.execute(new Runnable() {

			@Override
			public void run() {
				input(true);
			}
		});
		executor.execute(new Runnable() {

			@Override
			public void run() {
				input(false);
			}

		});

		executor.shutdown();
	}

}
