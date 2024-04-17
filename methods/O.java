/*Create a java application where we have one class it contains a
static method m1 having parameter integer returns long value,
non-static method m2 having parameter string returns character value, 
static method m3 having parameter double returns Boolean value 
then invoke all the methods under main method by providing 
dynamic input for both parameter and return types. */
package methods;

import java.util.Scanner;

public class O {
	static Scanner sc=new Scanner(System.in);
	static long m1(int a) {
		System.out.println(a);
		return sc.nextLong();
	}
	char m2(String a) {
		System.out.println(a);
		return sc.next().charAt(0);
	}
	static boolean m3(double a) {
		System.out.println(a);
		return sc.nextBoolean();
	}
	public static void main(String[] args) {
		O obj=new O();
		System.out.println(m1(sc.nextInt()));
		System.out.println(obj.m2(sc.next()));
		System.out.println(m3(sc.nextDouble()));
	}

}
