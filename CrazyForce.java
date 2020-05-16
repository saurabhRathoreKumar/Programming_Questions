package com.accolite.p2;

public class CrazyForce {
	static long count = 0;
	static long size = 0;
	public static void main(String[] args) {
		int temp[] = {2,4,6};
		calculatePossibleCombinations(temp);

	}
	
	public static void calculatePossibleCombinations(int[] inputStr) {
        size = inputStr.length;
        for(int val : inputStr) {
        	 find(inputStr,val, 6-val);
        }
        System.out.println(count);
    }

    static private void find(int[] inputStr, int start,int length) {
    	if(length<0) {
    		return;
    	}
        if(length == 0) {
            count++;
        }
        find(inputStr, 1, length-2);
        find(inputStr, 1, length-4);
        find(inputStr, 1, length-6);
    }
}
