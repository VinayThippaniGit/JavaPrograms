package com.vinay;

import java.util.Scanner;

public class reverse {
	static int rev=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		System.out.println(rev(n));
	}
	static int rev(int n) {
		if(n>0) {
			int r=n%10;
			rev=rev*10+r;	
			rev(n/10);
		}
		return rev;
	}
}
