package com.accolite.p5;

public class StrIntern {
	public static void main() {
		int a[][] =  {
				{1,3,5},
				{7,8,9},
				{2,4,6},
				{2,3,8},
				{5, 7,11}
		};
		findSmallestRange(a, 3,5);
	}

	static void findSmallestRange(int[][] arr,int n,int k)
	{
		int minEl = Integer.MAX_VALUE, maxEl = Integer.MIN_VALUE, minRange = Integer.MAX_VALUE;
		int p[] = new int[k];
		for(int i =0;i< k;i++) {
			p[i] = 0;  
		}
		while(true) {
			int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, minInd = -1;
			boolean f = false;
			for(int  i =0;i< k;i++) {
				if(p[i] == n) {
					f = true;
					break;
				}
				if(p[i] < n && arr[i][p[i]] < min) {
					minInd = i;
					min = arr[i][p[i]];
				}
				if(p[i] < n && arr[i][p[i]] > max) {
					max = arr[i][p[i]];
				}
			}
			if(minInd > 0 && minInd < k) {
				p[minInd]++;   
			}

			if(f) {
				System.out.println(minEl +" "+maxEl);
				break;
			}
			if(max - min < minRange) {
				minEl = min;
				maxEl = max;
				minRange = max - min; 
			}
		}
	}
}
