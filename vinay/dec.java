package com.vinay;

import java.util.Scanner;

public class dec {
	static int i = 1,c=1;

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n=read.nextInt();
		checkPrime(n);
		if(checkPrime(n)==1 && n>1) {
			System.out.print("prime");
		}
		else {
			System.out.println("Not a prime");
		}
	}

	static int checkPrime(int n) {
		if (++i < n) {
			if (n % i == 0) {
				c++;
			}
			else {
				checkPrime(n);
			}
		}
		return c;
	}
/*	static void mul(int table) {
		if (factor < 10) {
			System.out.println(table + " * " + ++factor + " = " + (table * factor));

			mul(table);
		}
	}
	/*static void rec(char n) {
		if(n<='Z'){
			System.out.println(n);
			rec(++n);
		}
	}
	
	/*static void rec(char n) {
		if(n<='z') {
			System.out.println(n);
			rec(++n);
		}
	}*/
}