package com.accolite.p6;

class File
{
    public int GetResult(int a, int b) { return 0; } 
} 
class B extends File
{ 
    public int GetResult(int a, int b) {return 1; } 
} 
public class P1_1 
{
    public static void main(String args[]) 
    { 
        File b = new B(); 
        System.out.println("x = " + b.GetResult(0, 1));  
    } 
}
