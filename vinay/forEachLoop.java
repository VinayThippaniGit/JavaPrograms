package com.vinay;

import java.util.Scanner;

public class forEachLoop {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int For[]=new int[5];
		for(int x:For) {
			x=sc.nextInt();
			System.out.println(x);
		}
	}

}
