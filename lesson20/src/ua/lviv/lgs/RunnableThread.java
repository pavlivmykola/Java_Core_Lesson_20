package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RunnableThread implements Runnable {
	
	private ArrayList<Integer> arrayFibonachi;
	private int number;
	
	

	@Override
	public void run() {
		
		arrayFibonachi = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть ціле число кількість чисел Фібоначі (зворотній порядок)");
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
	}
	
	
	public void print() {
		for (int i=arrayFibonachi.size()-1;i>=0;i--) {
			System.out.println(arrayFibonachi.get(i));
		}
			
	}
	

}
