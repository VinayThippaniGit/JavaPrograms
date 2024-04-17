package com.vinay;

import java.util.Scanner;

public class FibPatternColumnWise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int size=n*n;
		int k=0;
		int array[]=new int[size];
		int a=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				a=fib(a);
				array[k]=a;
				k++;
				a++;
			}
		}
		System.out.println();
		k=0;
		int l=0;
		for(int i=0;i<n;i++) {
			k=i;
			l=n-1;
			for(int j=0;j<=i;j++) {
				System.out.print(array[k]+" ");
				k=k+l;
				l--;
			}
			System.out.println();
		}
	}
	public static int fib(int a) {
		boolean temp=false;
		while(temp==false) {
			int x=0,y=1,z=x+y;
			while(z<a) {
				x=y;
				y=z;
				z=x+y;
			}
			if(z==a) {
				temp=false;
				a++;
			}
			else {
				temp=true;
			}
		}
		return a;
	}
}

		/*int a=0;
		for(int i=1;i<=n;i++) {
			a=i;
			int k=n-1;
			for(int j=1;j<=i;j++) {
				a=fib(a);
				System.out.print(a+" ");
				a=a+k;
				k--;
			}
			System.out.println();
		}
	}
	public static int fib(int n) {
		int a=0,b=1,c=a+b;
		while(c<n) {
			a=b;
			b=c;
			c=a+b;
		}
		if(c==n) {
			n=fib(n+1);
		}
		return n;
	}

}*/
