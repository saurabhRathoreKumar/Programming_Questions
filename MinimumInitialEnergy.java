package com.accolite.p1;

public class MinimumInitialEnergy {

	public static void main(String[] args) {
		int arr[] = {3, 5, 2, 6, 1}; 
		//int arr[] = {-1, -5, -9}; >> 16
		//int  arr[] = {4, -10, 4, 4, 4}; >> 7
		int energyRequired = 0, totalSum = 0;
		for(int i =0;i< arr.length;i++) {
			totalSum+=arr[i];
			if(totalSum <=0) {
				energyRequired+= (1 - totalSum);
				totalSum+=(1 - totalSum);
			}
		}
		System.out.println(energyRequired ==0?1: energyRequired);
	}
}
