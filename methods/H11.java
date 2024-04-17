/*•	Create a java application where we have one class it contains a
 non-static method m1 having parameter and return type, 
 non-static method m2, m3, m4 with parameter and return type, 
 static method m5 with integer as parameter returns class then invoke 
 all the methods under main without creating object directly and without 
 using object reference directly and by providing dynamic inputs and 
 do not create multiple object references. (class H11)*/
package methods;

import java.util.Scanner;

public class H11 {
	static Scanner sc=new Scanner(System.in);
	public static int m1(char a) {
		System.out.println(a);
		return sc.nextInt();
	}
	long m2(char c) {
		System.out.println(c);
		return sc.nextLong();
	}
	double m3(float f) {
		System.out.println(f);
		return sc.nextDouble();
	}
	char m4(String s) {
		System.out.println(s);
		return sc.next().charAt(0);
	}
	static H11 m5(int a) {
		System.out.println(a);
		return new H11();
	}

	public static void main(String[] args) {
		H11 obj=m5(sc.nextInt());
		System.out.println(m5(sc.nextInt()).m1(sc.next().charAt(0)));
		System.out.println(obj.m2(sc.next().charAt(0)));
		System.out.println(obj.m3(sc.nextFloat()));
		System.out.println(obj.m4(sc.next()));
	}

}
