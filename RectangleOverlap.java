package com.accolite.p3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleOverlap {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buff = 
				new BufferedReader(new InputStreamReader(System.in));
		int test =  Integer.parseInt(buff.readLine());
		while(test>0) {
			String[] output1 = buff.readLine().split("\\s+");
			String[] output2 = buff.readLine().split("\\s+");
			int x1 = Integer.parseInt(output1[0]);
			int y1 = Integer.parseInt(output1[3]);
			int x2 = Integer.parseInt(output1[2]);
			int y2 = Integer.parseInt(output1[1]);
			
			int x1_ = Integer.parseInt(output2[0]);
			int y1_ = Integer.parseInt(output2[3]);
			int x2_ = Integer.parseInt(output2[2]);
			int y2_ = Integer.parseInt(output2[1]);
			if(y1> y2_ || y2 < y1_ || x2< x1_ || x2_ < x1) {
			   System.out.println("0"); 
			}
			else {
			   System.out.println("1");  
			}
			test--;
		}

	}

}
