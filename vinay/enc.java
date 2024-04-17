package com.vinay;

import java.util.Scanner;

public class enc extends ZS {
	public static void main(String [] args) {
		ZS obj=new ZS();
		obj.setter(4567);
	}
}
class ZS{
	Scanner sc=new Scanner(System.in);
	static private int atm=1234;
	void setter(int atm) {
		System.out.println("Enter old pin");
		int enter=sc.nextInt();
		if(enter==this.atm) {
			this.atm=atm;
			System.out.println("Pin changed");
		}
	}
	int getter() {
		return this.atm;
	}
}

