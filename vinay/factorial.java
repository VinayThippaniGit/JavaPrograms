package com.vinay;

import java.util.Scanner;

public class factorial {
static int fact=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		fact(n);
	}

	static void fact(int n) {
		if (n > 0) {
			fact *= n--;
			fact(n);
		} else {
			System.out.print(fact);
		}
	}
}
