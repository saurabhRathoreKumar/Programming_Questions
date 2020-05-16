package com.accolite.p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [][] temp = {
				{0,1,1,0,1},
				{0,1,0,1,0},
				{0,0,0,0,1},
				{0,1,0,0,0}
		};

		List<List<Integer>> t = new ArrayList<>();
		for (Integer[] array : temp) {
			List<Integer> list = Arrays.asList(array);
			t.add(list);
		}
		System.out.println(temp(4, 5, t));
	}

	private static int temp(int rows, int columns, List<List<Integer> > grid) {

		boolean isUpdated = false;
		int count =0;
		while(rows>0) {
			List<List<Integer>> temp= new ArrayList<>();
			for(int i =0;i< rows;i++) {
				List<Integer> t = grid.get(i);
				List<Integer> o = new ArrayList<>();
				for(int k =0;k< columns;k++) {
					o.add(t.get(k));  
				}
				temp.add(i, o);
			}
			isUpdated = false;
			count++;
			for(int i =0;i< rows;i++) {
				for(int k =0;k< columns;k++) {
					if(grid.get(i).get(k) ==1) {
						if(i-1 >=0) {
							List<Integer> t2 = temp.get(i-1);
							if(t2.get(k)==0) {
								isUpdated = true;
								t2.set(k ,1);
							}
						}
						if(k-1 >=0) {
							List<Integer> t2 = temp.get(i);
							if(t2.get(k-1)==0) {
								isUpdated = true;
								t2.set(k-1 ,1); 
							}
						}
						if(k+1 < columns) {
							List<Integer> t2 = temp.get(i);
							if(t2.get(k+1)==0) {
								isUpdated = true;
								t2.set(k+1 ,1); 
							}
						}
						if(i+1 < rows) {
							List<Integer> t2 = temp.get(i+1);
							if(t2.get(k)==0) {
								isUpdated = true;
								t2.set(k ,1);
							}
						}
					}

				}
			}
			if(!isUpdated) {
				break;
			}
			grid = temp;
			rows--;
		}
		return --count;

	}



}
