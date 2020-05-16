package com.accolite.p4;

public class CountSort {

	public static void main(String[] args) {
		countSort("edsab".toCharArray());
	}

	public static void countSort(char seq[])
	{
		int[]  arr = new int[26];  
		for(char ch : seq) {
			arr[ch-97]++;
		}
		for(int i = 1;i< 26;i++) {
			arr[i]+=arr[i-1]; 
		}
		char [] out = new char[seq.length+1];
		for(char c: seq) {
			out[arr[c-97]] = c;
			arr[c-97]--;
		}
		System.out.println(new String(out));
	}
}
