/*•	Create a java application where we have one class
it contains a non-static method m1 having parameter 
integer returns an integer value, static method m2 
having parameter float returns a float value,
non-static method m3 having parameter character
returns a character value, static method m4 having 
parameter String returns a String value then invoke 
them under main method by providing dynamic inputs.(class H5)*/
package methods;

import java.util.Scanner;

public class H5 {
	
	static Scanner sc=new Scanner(System.in);
	int m1(int a) {
		System.out.println(a);
		return sc.nextInt();
	}
	static float m2(float f) {
		System.out.println(f);
		return sc.nextFloat();
	}
	char m3(char c) {
		System.out.println(c);
		return sc.next().charAt(0);
	}
	static String m4(String s) {
		System.out.println(s);
		return sc.next();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H5 obj=new H5();
		System.out.println(obj.m1(sc.nextInt()));
		System.out.println(m2(sc.nextFloat()));
		System.out.println(obj.m3(sc.next().charAt(0)));
		System.out.println(m4(sc.next()));
	}

}
