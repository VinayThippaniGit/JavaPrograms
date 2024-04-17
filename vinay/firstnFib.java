package com.vinay;

import java.util.Scanner;

public class firstnFib {
	static int n1=0,n2=1,n3,i=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		fib(n);
	}
	static void fib(int n) {
		if(++i<=n) {
			if(n1!=0) {
				System.out.print(" , ");
			}
			System.out.print(i+") "+n1);
			n3=n2+n1;
			n1=n2;
			n2=n3;
			fib(n);
		}
	}
}
