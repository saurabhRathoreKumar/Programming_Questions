package com.accolite.p3;

//{ Driver Code Starts
import java.util.*;
class GFG7
{
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	/* The main function that implements QuickSort()
   arr[] --> Array to be sorted,
   low  --> Starting index,
   high  --> Ending index */
	static void quickSort(int arr[], int low, int high)
	{
		if (low < high)
		{

			/* pi is partitioning index, arr[pi] is
           now at right place */
			int pi = new QuickSort().partition(arr, low, high);
			// Recursively sort elements before
			// partition and after partition
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	// Driver program
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();


			quickSort(arr,0,n-1);
			printArray(arr);
			T--;
		}
	} }// } Driver Code Ends
/* The main function that implements QuickSort() (present in a class 
different from QuickSort)
arr[] --> Array to be sorted,   low  --> Starting index,  high  --> Ending index 
static void quickSort(int arr[], int low, int high)
{
 if (low < high)
 {

     int pi = new QuickSort().partition(arr, low, high);
     quickSort(arr, low, pi-1);
     quickSort(arr, pi+1, high);
 } }*/
class QuickSort
{
	/* This function takes last element as pivot, places  the pivot element 
    at its correct position in sorted  array, and places all smaller (smaller
    than pivot) to left of pivot and all greater elements to right  of pivot */
	static int partition(int arr[], int low, int high)
	{
		int p = arr[high], i = low,j=high-1;
		while(i<j) {
			while(i< high && arr[i] <= p) {
				i++;
			}
			while(j>0 && arr[j] > p) {
				j--;
			}
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
		}
		int t = arr[i];
		arr[i] = p;
		arr[high-1] =t;
		return j+1;
	} 
}
