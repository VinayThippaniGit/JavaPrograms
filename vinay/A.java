//user a-within the method
//is a-extends
//has a-global object
package com.vinay;

import java.util.Scanner;

class A {
	static B obj;
	public static void main(String[] args) {
		
		//System.out.println(obj.a);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 2;
		int c = 1;
		int pc = 0;
		int a = 0, b = 1, d;
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i;) {
					if (c % 2 == 1) {
						pc = 0;
						for (int k = 1; k <= m; k++) {
							if (m % k == 0) {
								pc++;
							}
							// m++;
						}
						if (pc == 2) {
							System.out.print(m + " ");
							m++;
							j++;
							c++;
						} else {
							m++; // 5
						}
					} else {
						j++;
						c++;
						System.out.print(a + " ");
						d = a + b;
						a = b;
						b = d;
					}
				}
				System.out.println();
			}
		} else {
			System.out.print("Invalid Input");
		}
	}
}
class B{
	int a=10;
}
/*
 * //Firstly static memebers will be invoked //whenever object is created non
 * static members will be called then the constructor will be called {
 * System.out.println("Non static"); } static { System.out.println("Static"); }
 * A(){ System.out.println("Constructor"); } public static void main(String[]
 * args) { A obj=new A(); } } /* static A obj=new A(); static int a=10; int
 * b=20; A(){ //obj(10); //this(10); System.out.println("Constructor"); } A(int
 * a){ this(); System.out.println(a); } { int b=99;
 * System.out.println("Non static"+a); } static void m1() { int b=20;
 * System.out.println("Static block"+obj.a); } public static void main(String[]
 * args) { //new A(); m1(); } } /*static B obj=new B(); {
 * System.out.println("vvvvvvvvv"); } public static void main(String args[])
 * throws NullPointerException{ String str;char ch[]; Console
 * obj=System.console(); new A(); System.out.println("Password");
 * //readPassword();
 * 
 * } } class B{ private static String a="vinay"; public String m1() {
 * this.a="kkk"; return a; } } /*int n = sc.nextInt(),mul=1,max=1,c=0; int a[] =
 * new int[n]; for (int i = 0; i < n; i++) { a[i] = sc.nextInt(); if(a[i]%2!=0)
 * { if(a[i]>max) { max=a[i]; } mul*=a[i]; } } int k=0; for(int
 * i=max;i<mul;max+=max) { c=0; for(int j=0;j<n;j++) { if(a[j]%2!=0) { k++;
 * if(max%a[j]!=0) { c++; } } } if(c==0) { System.out.println(max); break; } }
 * 
 * if(k==0) { System.out.println("No odd"); } } }
 */