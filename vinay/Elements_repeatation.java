package com.vinay;

import java.util.Scanner;

public class Elements_repeatation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int c=0;
			for(int j=0;j<n;j++) {
				if(a[j]==a[i]) {
					c++;
				}
			}
			System.out.println(a[i] +" - "+c);
		}
	}

}
