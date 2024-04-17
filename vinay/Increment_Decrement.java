package com.vinay;

import java.util.Scanner;

public class Increment_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=n++;
		System.out.println("pre:"+n+" "+b);
		b=n--;
		System.out.println("post:"+n+" "+b);
	}

}
