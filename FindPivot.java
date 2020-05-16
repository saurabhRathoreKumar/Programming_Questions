package com.accolite.p1;

public class FindPivot {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3};
		int size =  arr.length,
				h = size-1,
				m = h/2;
		int index = getPivotIndex(0, m, h, arr);
		System.out.println(index);
		int elem = 7;
		//if()
		searchElement();
	}

	private static void searchElement() {
		
	}

	private static int getPivotIndex(int l, int m, int h, int[] arr) {
		int pivot = -1;
		if(m-1 >=0 && arr[m-1] > arr[m]) {
			return m;
		}
		else if(arr[m] > arr[m+1]) {
			return m+1;
		}
		
		if(arr[l] > arr[m]) {
			pivot = getPivotIndex(l, (l+ m-1)/2, m-1,arr);
		}
		else {
			pivot = getPivotIndex(m-1, (h + m-1)/2, h,arr);
		}
		return pivot;
	}
}
