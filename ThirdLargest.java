package com.accolite.p6;

public class ThirdLargest {

	public static void main(String[] args) {
		Long[]  a = {2l, 4l, 1l, 3l, 5l, 4l};
		int n = a.length;
		System.out.println(getThirdLargest(a, n, 0, n-1));

	} 
	static Long getThirdLargest(Long a[], int n, int i, int j){ 
		int pivot = getPivot(a, n, i, j);
		if(pivot == n-4) {
			return a[pivot];
		}
		else if(pivot < n-3) {
			return getThirdLargest(a, n, pivot+1, j);
		}
		else {
			return getThirdLargest(a, n, i, pivot-1);
		}

	}

	static int getPivot(Long[] a, int n, int i, int j) {
		int t = i++;
		Long pivot  = a[t];
		while(i <= j) {
			while(i <= j && a[i] <= pivot) {
				i++;
			}
			while(i <= j && a[j] > pivot) {
				j--;
			}
			if(i<=j)
				swap(a, i, j);
		}
		swap(a, t, j);
		return j;
	}

	static void swap(Long[] a, int i, int j) {
		Long temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
