package com.vinay;

import java.util.Scanner;

public class Anti_clockWise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		for(int i=a.length()-1;i>=0;i--) {
			for(int j=i;j<a.length();j++) {
				System.out.print(a.charAt(j));
			}
			for(int j=0;j<i;j++) {
				System.out.print(a.charAt(j));
			}
			System.out.println();
		}
	}
}