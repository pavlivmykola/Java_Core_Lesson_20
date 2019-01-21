package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MyThread extends Thread {
	private ArrayList<Integer> arrayFibonachi;
	
	@Override
	public void run() {
		arrayFibonachi = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть ціле число кількість чисел Фібоначі");
		int number=sc.nextInt();
		for (int i=0;i<number;i++) {
			switch (i) {
			case 0: 
				arrayFibonachi.add(1);
				break;
			case 1:
				arrayFibonachi.add(1);
				break;
			default:
				arrayFibonachi.add(arrayFibonachi.get(i-2)+arrayFibonachi.get(i-1));
			}			
		}	
		try {
			this.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void print() {
		Iterator<Integer> iterator = arrayFibonachi.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());				
		}
		
	}

}
