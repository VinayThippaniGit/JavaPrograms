package com.vinay;

import java.util.Scanner;

public class Names_pattern {
	static Scanner sc=new Scanner(System.in);
	static int n=sc.nextInt();
	static void star() {
		System.out.print("*");
	}
	static void space() {
		System.out.print(" ");
	}
	
	static void letter_gap() {
		System.out.print("  ");
	}
	static void M(int i) {
		for(int j=1;j<=n;j++) {
			if(j==1 || (i<=(n/2)+1 && (j==i|| j==n-i+1)) || j==n) {
				star();
			}
			else {
				space();
			}
		}
	}
	static void A(int i) {
		for(int j=1;j<=n;j++) {
			if(((j==1 || j==n) && i>=(n/2)+1) || i==(n/2)+1 || (j==(n/2)+1 && i==1) || (i==(n/2) &&(j==(n/2) || j==n-1))) {
				star();
			}
			else {
				space();
			}
		}
	}
	static void T(int i) {
		for(int j=1;j<=n;j++) {
			if(i==1 || j==3) {
				star();
			}
			else {
				space();
			}
		}
	}
	static void H(int i) {
		for(int j=1;j<=n;j++) {
			if(j==1 || j==n || i==3) {
				star();
			}
			else {
				space();
			}
		}
	}
	static void L(int i) {
		for(int j=1;j<=n;j++) {
			if(j==1 || i==n) {
				star();
			}
			else {
				space();
			}
		}
	}
	static void O(int i) {
		for(int j=1;j<=n;j++) {
			if(j==1 || i==1 || j==n || i==n) {
				star();
			}
			else {
				space();
			}
		}
	}
	static void V(int i) {
		for(int j=1;j<=n;j++) {
			if(((j==1 || j==n) && i<=3) || (i==4 && (j==2 || j==4)) || (i==5 && j==3)) {
				star();
			}
			else {
				space();
			}
		}
	}
	static void E(int i) {
		for(int j=1;j<=n;j++) {
			if(j==1 || i==1 || i==n || i==(n/2)+1) {
				star();
			}
			else {
				space();
			}
		}
	}
	static void S(int i) {
		for(int j=1;j<=n;j++) {
			if(i==1 || i==n || (j==1 && i<=(n/2)) || i==(n/2)+1 || (j==n && i>(n/2))) {
				star();
			}
			else {
				space();
			}
		}
	}
	static void I(int i) {
		for(int j=1;j<=n;j++) {
			if(i==1 || i==n || j==(n/2)+1) {
				star();
			}
			else {
				space();
			}
		}
	}
	static void N(int i) {
		for(int j=1;j<=n;j++) {
			if(j==1 || j==n || j==i) {
				star();
			}
			else {
				space();
			}
		}
	}
	static void Y(int i) {
		for(int j=1;j<=n;j++) {
			if((j==1 && i<=(n/2)+1) || j==(n/2)+2 || (i==(n/2)+1 && j<=(n/2)+1) ) {
				star();
			}
			else {
				space();
			}
		}
	}

	public static void main(String[] args) {
		for(int i=1;i<=n;i++) {
			M(i);
			letter_gap();
			A(i);
			letter_gap();
			M(i);
			letter_gap();
			A(i);
			letter_gap();
			T(i);
			letter_gap();
			H(i);
			letter_gap();
			A(i);
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++) {
			letter_gap();
			letter_gap();
			letter_gap();
			letter_gap();
			letter_gap();
			letter_gap();
			L(i);
			letter_gap();
			O(i);
			letter_gap();
			V(i);
			letter_gap();
			E(i);
			letter_gap();
			S(i);
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=1;i<=n;i++) {
			letter_gap();
			letter_gap();
			letter_gap();
			V(i);
			letter_gap();
			I(i);
			letter_gap();
			N(i);
			letter_gap();
			A(i);
			letter_gap();
			Y(i);
			System.out.println();
		}
	}

}
