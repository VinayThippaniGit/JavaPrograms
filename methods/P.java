/*Create a java application where we have one class it contains
a non-static method named m1 having parameter integer returns 
nothing, static method m2 having parameter Boolean returns nothing, 
non-static method m3 having parameter string returns nothing, 
then invoke m1 under m2, m2 method under m3 and m3 method
 under main by providing dynamic inputs. (class P)*/
package methods;

import java.util.Scanner;

public class P {
	static P obj=new P();
	static Scanner sc=new Scanner(System.in);
	void m1(int a) {
		System.out.println(a);
	}
	static void m2(boolean b) {
		obj.m1(sc.nextInt());
		System.out.println(b);
	}
	void m3(String s) {
		m2(sc.nextBoolean());
		System.out.println(s);
	}
	public static void main(String[] args) {
		obj.m3(sc.next());
	}

}
