package com.accolite.p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MinMaxSum {
	static int count =0;
	public static void main(String[] args) {
		System.out.println(timeConversion("12:45:54PM"));
		ExecutorService ex = Executors.newFixedThreadPool(7);
		Thread.yield();
		ThreadFactory thf = Executors.privilegedThreadFactory();
		Thread t = thf.newThread(() -> {
			System.out.println("1");
		});
		t.start();
		
	}

	public static synchronized void add(int value){
		count += value;
	}

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
		String hh = s.substring(0,2);
		boolean isPM = s.contains("PM");
		int h = 0 ;
		if(isPM && !hh.equals("12")) {
			if(hh.contains("0")) {
				h = Integer.parseInt(hh.replace("0",""))+12;
			}
			else {
				h = Integer.parseInt(hh)+12;
			}
		}
		if(isPM && h!=0) {
			s=s.replace(hh, String.valueOf(h));
		}
		if(!isPM && hh.equals("12")) {
			s= s.replace(hh, "00");
		}
		return isPM ? s.replace("PM", ""): s.replace("AM","");
	}
}
