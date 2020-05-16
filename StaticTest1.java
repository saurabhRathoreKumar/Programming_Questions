package com.accolite.p1;

class Hi {
	@Override
	protected void finalize() 
	{ 
		System.out.println("finalize method HII "); 
	}   
}
public class StaticTest1 {
	public static void main(String[] args) throws InterruptedException {  
		new Hi(); 
		System.gc(); 
	} 

	@Override
	protected void finalize() 
	{ 
		System.out.println("finalize method overriden"); 
	}  
}
