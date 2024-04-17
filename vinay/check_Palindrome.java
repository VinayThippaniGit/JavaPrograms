package com.vinay;

import java.util.Scanner;

public class check_Palindrome {
	static Scanner read=new Scanner(System.in);
	static int n=read.nextInt();
	static int rev=0,temp=n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPalindrome(n);
	}
	static void checkPalindrome(int n) {
		if(n>0) {
			int r=n%10;
			rev=rev*10+r;
			checkPalindrome(n/10);
		}
		else {
			if(rev==temp) {
				System.out.print("Palindrome.");
			}
			else {
				System.out.println("Not  Palindrome.");
			}
		}
	}
}
