package com.accolite.p5;

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int size = sc.nextInt();
			boolean flag =  true;
			for(int i = 0;i< size;i++) {
				int dist = 0;
				int el = sc.nextInt();
				while(el ==0) {
					dist++;
				}
				if(dist < 5) {
					flag =  false;
					break;
				}
			}
			if(flag)
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
	}
}

