package com.accolite.p6;

public class MinCoinChangeProblem {

	public static void main(String[] args) {
		int coins[] = {1, 2, 5, 10, 11};
		int k = 23;
		int[] table = new int[k+1];
		table[0] = 0;
		for(int i = 1; i<= k; i++) {
			table[i] = k+1;
		}
		for(int i = 1; i<= k;i++) {
			for(int j = 0;j < coins.length;j++) {
				if(coins[j] <= i) {
					int val = 1 + table[i - coins[j]];
					table[i] = Math.min(table[i], val);
				}
			}
		}
		System.out.println(table[k]);
	}

}
