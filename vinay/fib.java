package com.vinay;

import java.util.Scanner;
public class fib {
	static int n1=0,n2=1,n3;
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		fibSeries(n);
	}
	static void fibSeries(int n) {
			if(n1<=n) {
				if(n1!=0) {
					System.out.print(" , ");
				}
				System.out.print(n1);
				n3=n1+n2;
				n1=n2;
				n2=n3;
				fibSeries(n);
			}
		}
}
