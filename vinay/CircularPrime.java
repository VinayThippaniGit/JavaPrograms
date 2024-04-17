package com.vinay;

import java.util.Scanner;

public class CircularPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=Integer.toString(n);
		for(int i=0;i<s.length();i++) {
			String temp="";//197
			for(int j=i;j<s.length();j++) {
				temp+=s.charAt(j);
			}
			for(int k=0;k<i;k++) {
				temp+=s.charAt(k);
			}
			int p=Integer.parseInt(temp);
			if(!prime(p)) {
				System.out.println("Not a circular prime.");
				System.exit(0);
			}
		}
		System.out.println("Circular prime");
	}
	public static boolean prime(int p) {
		int c=0;
		boolean x=false;
		for(int i=2;i<p;i++) {
			if(p%i==0) {
				c++;
				break;
			}
		}
		if(c==0) {
			x=true;
		}
		return x;
	}
}
