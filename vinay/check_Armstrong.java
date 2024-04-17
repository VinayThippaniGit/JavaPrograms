package com.vinay;

import java.util.*;

public class check_Armstrong {
	static Scanner read=new Scanner(System.in);
	static int n=read.nextInt();
	static int arm=0,p=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=n;
		int temp2=n;
		while(temp2>0) {
			temp2/=10;
			p++;
		}
		arm(temp);
	}
	static void arm(int temp) {
		if(temp>0) {
			int r=temp%10;
			arm+=(int)Math.pow(r, p);
			arm(temp/10);
		}
		else {
			System.out.println((arm==n)? "Armstrong" : "Not a Armstrong");
		}
	}
}
