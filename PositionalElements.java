package com.accolite.p5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PositionalElements {

	public static void main(String[] args) {
		int[][] a = {{1, 3, 4}, {5, 2, 9}, {8, 7, 6}};
		Set<String> result = new HashSet<>();
		int row = 3, col = 3;
		for(int i =0;i< row;i++) {
			int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, minIndex  = -1, maxIndex = -1;
			for(int j =0;j< col;j++) {
				if(a[i][j] < min) {
					min = a[i][j];
					minIndex = j;
				}
				if(a[i][j] > max) {
					max = a[i][j];
					maxIndex = j;
				}
			}
			result.add(i+"#"+minIndex);
			result.add(i+"#"+maxIndex);
		}
		// column wise iterating
		for(int i =0;i< row;i++) {
			int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, minIndex  = -1, maxIndex = -1;
			for(int j =0;j< col;j++) {
				if(a[j][i] < min) {
					min = a[j][i];
					minIndex = j;
				}
				if(a[j][i] > max) {
					max = a[j][i];
					maxIndex = j;
				}
			}
			result.add(i+"#"+minIndex);
			result.add(i+"#"+maxIndex);
		}
		System.out.println(result.size());
		List<String[]> list = result.stream().map(item -> item.split("#")).collect(Collectors.toList());
		list.forEach(item -> {
			System.out.print(a[Integer.parseInt(item[0])][Integer.parseInt(item[1])] +" ");
		});
	}

}
