/* Create a Java Application where we have one interface it contains one abstract method 
and one defined method, inside this interface we have two interfaces with respect to 
individual abstract methods, then provide an implementation for all these interfaces 
into one concrete class and then invoke all these methods by providing dynamic inputs.
(class ic7)*/
package innerClasses;

import java.util.Scanner;

interface i7{
	static Scanner sc=new Scanner(System.in);
	int m1(char c);
	default boolean m2(boolean b) {
		System.out.println(b);
		return sc.nextBoolean();
	}
	interface i71{
		char m3(float f);
	}
	interface i72{
		String m4(double d);
	}
}
public class ic7 implements i7,i7.i71,i7.i72{
	static Scanner sc=new Scanner(System.in);
	public int m1(char c) {
		System.out.println(c);
		return sc.nextInt();
	}
	
	public char m3(float f) {
		System.out.println(f);
		return sc.next().charAt(0);
	}
	public String m4(double d) {
		System.out.println(d);
		return sc.next();
	}
	public static void main(String[] args) {
		i7 obj=new ic7();
		System.out.println(obj.m1(sc.next().charAt(0)));
		i7.i71 obj1=new ic7();
		System.out.println(obj1.m3(sc.nextFloat()));
		i7.i72 obj2=new ic7();
		System.out.println(obj2.m4(sc.nextDouble()));
		System.out.println(obj.m2(sc.nextBoolean()));
	}
}
