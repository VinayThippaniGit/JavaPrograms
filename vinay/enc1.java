//using getter and setter methods
package com.vinay;

import java.util.Scanner;

public class enc1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		X obj=new X();
		System.out.println(obj.getter());
		obj.setter(sc.nextInt());
		System.out.println(obj.getter());
	}
}
class X{
	private int pin=1234;
	int getter() {
		return pin;
	}
	void setter(int b) {
		pin=b;
	}
}
