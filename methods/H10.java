/*•	Create a java application where we have one class it contains a 
 non-static method m1 having parameter integer return a Boolean value, 
 a static method m2 having parameter double returns a long value, 
 then invoke m1 method under main method, if the m1 method returns true
  then invoke m2 under main, if it returns false then print any user friendly message 
  by providing dynamic inputs. (class H10)*/
package methods;

import java.util.Scanner;

public class H10 {
	public static int x=10;
	static H10 obj=new H10();
	static Scanner sc=new Scanner(System.in);
	boolean m1(int a) {
		System.out.println(a);
		return sc.nextBoolean();
	}
	public static long m2(double d) {
		System.out.println(d);
		return sc.nextLong();
	}
	public static void main(String[] args) {
		boolean b=obj.m1(sc.nextInt());
		if(b==true) {
			System.out.println(m2(sc.nextDouble()));
		}
		else {
			System.out.println("Mama");
		}
	}
}
