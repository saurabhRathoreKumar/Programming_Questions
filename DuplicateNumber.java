package com.accolite.p2;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DuplicateNumber {

	 void printRepeating(int arr[], int size) 
	    { 
	        int i;   
	        System.out.println("The repeating elements are : "); 
	     
	        for(i = 0; i < size; i++) 
	        { 
	            if(arr[Math.abs(arr[i])] > 0) 
	                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])]; 
	            else
	                System.out.print(Math.abs(arr[i]) + " "); 
	        }          
	    }  
	  
	    /* Driver program to test the above function */
	    public static void main(String[] args)  
	    { 
	    	DuplicateNumber repeat = new DuplicateNumber(); 
	        int arr[] = {4, 2, 4, 5, 2, 3, 19, 19};
	       int max = IntStream.of(arr).max().getAsInt();
	        int[] temp = new int[max];
	        int arr_size = arr.length; 
	        repeat.printRepeating(arr, arr_size); 
	    }
}
