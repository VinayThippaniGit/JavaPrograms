/*Create a java application where we have one class it contains three static variables, 
three non-static variables alternatively, two static methods and two non-static methods 
with parameter and return type alternatively, named m1, m2, m3, m4 respectively then 
invoke all the methods under main method, invoke m1 under m2, m2 under m3, m3 
under m4 and m4 under main by providing dynamic inputs. (class H13)*/
package methods;

import java.util.Scanner;

public class H13 {
	static Scanner sc=new Scanner(System.in);
	static int a=sc.nextInt();
	float f=sc.nextFloat();
	static String s=sc.next();
	long l=sc.nextLong();
	static char c=sc.next().charAt(0);
	double d=sc.nextDouble();
	static String m1(int a) {
		System.out.println(a);
		return sc.next();
	}
	float m2(char c) {
		System.out.println(c);
		System.out.println(m1(sc.nextInt()));
		return sc.nextFloat();
	}
	static long m3(String s) {
		H13 obj=new H13();
		System.out.println(obj.m2(sc.next().charAt(0)));
		System.out.println(s);
		return sc.nextLong();
	}
	boolean m4(boolean b) {
		System.out.println(m3(sc.next()));
		System.out.println(b);
		return sc.nextBoolean();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H13 obj=new H13();
		System.out.println(obj.m4(sc.nextBoolean()));
		System.out.println(a);
		System.out.println(obj.f);
		System.out.println(s);
		System.out.println(obj.l);
		System.out.println(c);
		System.out.println(obj.d);
	}

}
