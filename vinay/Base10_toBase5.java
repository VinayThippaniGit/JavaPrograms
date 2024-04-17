package com.vinay;

import java.util.Scanner;

public class Base10_toBase5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String x="";
		while(n>0) {
			int r=n%5;
			x=r+x;
			n/=5;
		}
		System.out.println(x);
		int sum=0;
		int c=0;
		for(int i=x.length()-1;i>=0;i--) {
			int temp=(int)x.charAt(i)-48;
			int p=temp*(int)Math.pow(5, c);
			sum+=p;
			c++;
		}
		System.out.println(sum);
	}

}
