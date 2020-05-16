package com.accolite.p6;

public class KthSmallest {

	public static void main(String[] args) {
		int arr[] = {1},
	       k = 1;
		int e = getSmallest(arr, 0, arr.length-1, k);
		System.out.println(e);
	}

	private static int getSmallest(int[] arr, int i, int j, int k) {
		int ind = getPivotIndex(arr, i, j);
		if(ind == k-1) {
			return arr[k-1];
		}
		else if(k-1 > ind) {
			return getSmallest(arr, ind+1, j, k);
		}
		else {
			return getSmallest(arr, i, ind-1, k);
		}
	}

	private static int getPivotIndex(int[] arr, int i, int j) {
		int pivot = arr[i];
		int s = i;
		s++;
		while(s <= j) {
			while(s <= j && arr[s] <= pivot)
			{
				s++;
			}
			while(s <= j && arr[j] > pivot) {
				j--;
			}
			if(s <= j )
				swap(arr, s, j);
		}
		swap(arr, i, j);
		return j;
	}

	private static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
 	}
}
