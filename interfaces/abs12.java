/* Create a java application where we have three interfaces with one abstract method 
each. Inherit all these interfaces at a time into a concrete class to provide functionality 
for abstract methods and then invoke all the methods under main by providing dynamic 
inputs. (class ab12)*/
package interfaces;

import java.util.Scanner;

interface A{
	Scanner sc=new Scanner(System.in);
	int m1(int a) ;
}
interface B{
	default void m4() {
		int a=A.sc.nextInt();
		System.out.println(a);
	}
	float m2(float b);
}
interface C{
	char m3(char c);
}
public class abs12 implements A,B,C {
	
	public int m1(int a) {
		System.out.println(a);
		return sc.nextInt();
	}
	public float m2(float b) {
		System.out.println(b);
		return sc.nextFloat();
	}
	public char m3(char c) {
		System.out.println(c);
		return sc.next().charAt(0);
	}

	public static void main(String[] args) {
		A obj=new abs12();
		B obj2=new abs12();
		C obj3=new abs12();
		// or abs12 obj=new abs12();
		System.out.println(obj.m1(sc.nextInt()));
		System.out.println(obj2.m2(sc.nextFloat()));
		System.out.println(obj3.m3(sc.next().charAt(0)));
	}

}
