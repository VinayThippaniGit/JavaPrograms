//Create a Java Application where we need to satisfy constructor injection. (class Encap2)
package com.vinay;

import java.util.Scanner;
public class enc2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Y obj=new Y(sc.nextInt());
		System.out.println(obj.get());
	}
}
class Y{
	private int pin=1234;
	int get() {
		return pin;
	}
	Y(int b){
		pin=b;
	}
}
