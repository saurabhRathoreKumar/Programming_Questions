package com.accolite.p6;

public class ExcelTitle {

	public static void main(String[] args) {
		System.out.println(titleToNumber("ABA"));
	}

	public static int titleToNumber(String s) {
        int tmp = 1;
        int sum = 0;
        int size = s.length();
        sum += (s.charAt(size-1) - 'A' +1);
        for(int i = size-2;i >= 0;i--) {
            tmp = tmp * 26 * (s.charAt(i) - 'A' +1);
            sum+= tmp;
        }
        return sum;
    }
}
