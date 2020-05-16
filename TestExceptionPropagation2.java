package com.accolite.p2;

class TestExceptionPropagation2{  
	void m(){  
		int data=50/0;
	}  
	void n(){  
		m();  
	}  
	void p(){  
		try{  
			n();  
		}catch(Exception e){System.out.println("exception handeled");}  
	}  
	public static void main(String args[]){  
		TestExceptionPropagation2 obj=new TestExceptionPropagation2();  
		obj.p();  
		System.out.println("normal flow");  
	}  
} 
