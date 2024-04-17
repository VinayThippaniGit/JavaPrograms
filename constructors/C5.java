/*Create a java application where we have one static variable integer, two non-static 
variables Boolean and double, one non-static method with parameter character returns 
a long value, a default constructor and a parameterized constructor then invoke all the 
properties under main by providing dynamic inputs. (class c5)*/
package constructors;

import java.util.Scanner;

public class C5 {
	static Scanner sc=new Scanner(System.in);
	static int a=sc.nextInt();
	boolean b=sc.nextBoolean();
	double d=sc.nextDouble();
	long m1(char c) {
		System.out.println(c);
		return sc.nextLong();
	}
	C5(){
		System.out.println(sc.next());
	}
	C5(String a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		C5 obj=new C5();
		new C5(sc.next());
		System.out.println(a);
		System.out.println(obj.b);
		System.out.println(obj.d);
		System.out.println(obj.m1(sc.next().charAt(0)));
	}

}
