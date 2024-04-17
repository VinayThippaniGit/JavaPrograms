/*Create a java application where we have one class it contains
a non-static method named m1 having parameter integer returns nothing, 
static method m2 having no parameter returns a Boolean value, 
non-static method m3 having no parameter and return type, 
static method m4 having parameter long and returns a double value, 
then invoke m1 under m2, m2 under m3, m3 under m4 and m4 under main by providing dynamic inputs. (class R)*/
package methods;

import java.util.Scanner;

public class R {
	static R obj=new R();
	static Scanner sc=new Scanner(System.in);
	void m1(int a) {
		System.out.println(a);
	}
	static boolean m2() {
		obj.m1(sc.nextInt());
		return sc.nextBoolean();
	}
	void m3() {
		System.out.println(m2());
		System.out.println(sc.nextInt());
	}
	static double m4(long l) {
		obj.m3();
		System.out.println(l);
		return sc.nextDouble();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(m4(sc.nextLong()));
	}

}
