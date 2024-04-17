package com.vinay;

import java.util.Scanner;

public class Mode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int temp=1,mode=0;
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(a[j]==a[i]) {
					count++;
				}
				if(count>temp) {
					mode=a[i];
					temp=count;
				}
			}
		}
		if(temp==1) {
			System.out.println("No repeated values");
		}
		else {
		System.out.println(mode);
		}
	}

}
