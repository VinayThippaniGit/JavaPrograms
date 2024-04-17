package com.vinay;

import java.util.Scanner;

public class PrimePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int a=2;
			for(int j=1;j<=i;) {
				int c=0;
				for(int k=2;k<a;k++) {
					if(a%k==0) {
						c++;
					}
				}
				if(c==0) {
					System.out.print(a+" ");
					j++;
				}
				a++;
			}
			System.out.println();
		}
	}

}
