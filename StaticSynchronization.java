package com.accolite.p6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Table {
	static Lock l = new ReentrantLock();
	static void printTable(int n) {
		if(l.tryLock()) {
			for(int i=1;i<=5;i++){  
				System.out.println(n*i);  
				try{  
					Thread.sleep(400);  
				}catch(Exception e){}  
			}  
		}
	}  

	synchronized void printTable2(int n) {
		for(int i=1;i<=5;i++){  
			System.out.println(n*i);  
			try{  
				Thread.sleep(400);  
			}catch(Exception e){}  
		}  
	}
}  

class MyThread1 extends Thread{  
	public void run(){  
		Table.printTable(1);  
	}  
}  

class MyThread2 extends Thread{  
	public void run(){  
		Table.printTable(10);  
	}  
}  

class MyThread3 extends Thread{  
	public void run(){  
		Table.printTable(100);  
	}  
}  




class MyThread4 extends Thread{  
	public void run(){  
		Table.printTable(1000);  
	}  
}  

public class StaticSynchronization{  
	public static void main(String t[]) throws InterruptedException{  
		MyThread1 t1=new MyThread1();  
		MyThread2 t2=new MyThread2();  
		MyThread3 t3=new MyThread3();  
		MyThread4 t4=new MyThread4();  
		t1.start();  
		t2.start();  
		t3.start();  
		t4.start();  
		/*Table tab = new Table();
		Thread t11 = new Thread(() -> {
			tab.printTable2(1); 
		});
		Thread t12 = new Thread(() -> {
			tab.printTable2(10); 
		});
		Thread t14 = new Thread(() -> {
			tab.printTable2(1000); 
		});
		Thread t13 = new Thread(() -> {
			tab.printTable2(100); 
		});
		t1.join();
		t2.join();
		t3.join();
		t4.join();

		t11.start();t12.start();t13.start();t14.start();*/
	}  
}  
