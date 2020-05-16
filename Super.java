package com.accolite.p4;

class Animal {  
	final String color="whitvve";  
}  
class Dog extends Animal {  
	String color="black";  
	void printColor(){  
		System.out.println(color);//prints color of Dog class  
	}  
}  
class Super {  
	public static void main(String args[]) {  
		Dog d=new Dog();  
		//d.printColor(); 
		Animal  a=new Dog();
		//System.out.println(a.color); // C exception
		System.out.println(a.color);
		Integer n = new Integer(8)	;

	}
}  

