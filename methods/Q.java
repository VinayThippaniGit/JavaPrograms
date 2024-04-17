/*Create a java application where we have one class it contains
a non-static method named m1 having parameter integer, 
static method m2 having parameter Boolean, 
non-static method m3 having parameter double, 
static method m4 having parameter character, 
non-static method m5 having parameter string 
then invoke m1 under m2, m2 under m3, m3 under m4, 
m4 under m5 and m5 under main by providing dynamic inputs. (class Q)*/
package methods;

import java.util.Scanner;

public class Q {
	static Q obj=new Q();
	static Scanner sc=new Scanner(System.in);
	void m1(int a) {
		System.out.println(a);
	}
	static void m2(boolean b) {
		obj.m1(sc.nextInt());
		System.out.println(b);
	}
	void m3(double d) {
		m2(sc.nextBoolean());
		System.out.println(d);
	}
	static void m4(char c) {
		obj.m3(sc.nextDouble());
		System.out.println(c);
	}
	void m5(String s) {
		m4(sc.next().charAt(0));
		System.out.println(s);
	}
	public static void main(String[] args) {
		obj.m5(sc.next());
	}
}
