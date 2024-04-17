package com.vinay;

import java.util.Scanner;

public class Automorphic_Number {
	int k=10;
	static void mai() {
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int c=0;
		while(temp>0) {
			c++;
			temp/=10;
		}
		int res=(int)Math.pow(n, 2);
		temp=res;
		int c1=0;
		while(temp>0) {
			temp/=10;
			c1++;
		}
		temp=res;
		int c2=1;
		while(c1>c) {
			c1--;
			c2*=10;
			temp/=10;
		}
		if(res%c2==n) {
			System.out.println("Automorphic Number.");
		}
	}
}
class f extends Automorphic_Number{
	static void mai() {
		System.out.println();
	}
}
