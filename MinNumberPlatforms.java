package com.accolite.p6;

public class MinNumberPlatforms {

	public static void main(String[] args) {
		int arr[] = { 900, 940, 950, 1200, 1500, 1800 }; 
	    int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
	    int[] platforms = new int[2361];
	    
	    for(int i = 0; i< arr.length; i++ ) {
	    	++platforms[arr[i]];
	    	--platforms[dep[i]];
	    }
	    int maxPlatforms = 1;
	    for(int i = 1;i< 2361; i++) {
	    	platforms[i] = platforms[i-1] + platforms[i];
	    	if(maxPlatforms < platforms[i]) {
	    		 maxPlatforms = platforms[i];
	    	}
	    }
	    System.out.println(maxPlatforms);
	}
}
