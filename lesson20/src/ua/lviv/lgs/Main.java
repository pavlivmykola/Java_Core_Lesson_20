package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread myThread = new MyThread();	
		myThread.start();
		myThread.join();
		myThread.sleep(1000);
		myThread.print();
		

		
		RunnableThread runnableThread = new RunnableThread();
		Thread thread1 = new Thread(runnableThread);
		thread1.start();
		thread1.join();
		thread1.sleep(1000);
		
		runnableThread.print();
		
	}

	

	
}
