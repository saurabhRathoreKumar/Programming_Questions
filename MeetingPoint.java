package com.accolite.p2;

public class MeetingPoint {
	static long count = 0;
	static long size = 0;
	public static void main(String[] args) {
		calculatePossibleCombinations("2239");
	}
	
	public static void calculatePossibleCombinations(String inputStr) {
        size = inputStr.length();
        find(inputStr,0, 0);
        System.out.println(count);
    }

    static private void find(String inputStr, int start,int length) {
        if(length == size) {
            count++;
        }
        String substr =  inputStr.substring(start);
        if(substr.length() >=2) {
            if(!substr.startsWith("0")) {
                find(inputStr, start+1, length+1);
                int s = Integer.parseInt(inputStr.substring(start, start+2));
                if(s<=26) {
                    find(inputStr, start+2, length+2);
                }
            }
        } 
        else if(substr.length() ==1) {
            find(inputStr, start+1, length+1);
        }
    }

}
