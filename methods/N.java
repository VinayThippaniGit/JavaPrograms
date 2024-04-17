/*Create a java application where we have one class it contains
a non-static method m1 having parameter integer returns a
 Boolean value then invoke this method under main method 
 by providing dynamic inputs.(class N)*/
package methods;

import java.util.Scanner;

public class N {
	static Scanner sc=new Scanner(System.in);
	boolean m1(int a) {
		System.out.println(a);
		return sc.nextBoolean();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N obj=new N();
		System.out.println(obj.m1(sc.nextInt()));
	}

}
