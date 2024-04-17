package com.vinay;

import java.util.Scanner;

public class Fib_prime {
	static Scanner sc=new Scanner(System.in);
	static int fib,prime;
	static boolean condition;
	static void A() {
		System.out.print("Enter the A's number(Fibnacci) : ");
		fib=sc.nextInt();
		if(check_fib(fib)==true) {
			B();
		}
		else {
			System.out.println("Not a fibnacci number.B is the winner.");
		}
	}
	static void B(){
		System.out.print("Enter the B's number(Prime) : ");
		prime=sc.nextInt();
		if(check_prime(prime)==true) {
			A();
		}
		else {
			System.out.println("Not a prime number.A is the winner");
		}
	}
	static boolean check_fib(int fib) {
		int a=0,b=1;
		while(fib>a) {
			int c=a+b;
			a=b;	 
			b=c;	 
		}
		if(a==fib) {
			condition=true;
		}
		else {
			condition=false;
		}
		return condition;
	}
	static boolean check_prime(int prime) {
		int c=0;
		for(int i=2;i<prime;i++) {
			if(prime%i==0) {
				c++;
			}
		}
		if(c==0) {
			condition=true;
		}
		else {
			condition=false;
		}
		return condition;
	}
	public static void main(String[] args) {
		A();
	}

}
