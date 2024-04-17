/*Create a java application where we have one interface it contains two abstract methods 
and two defined methods, inherit this interface into a concrete class to provide 
functionality for all abstract methods and then invoke all the properties under main 
method by providing dynamic inputs. (class ab11)*/
package interfaces;

import java.util.Scanner;

interface if2{
	Scanner sc=new Scanner(System.in);
	int m1(boolean a) ;
	boolean m2(char c);
	default float m3(int a) {
		System.out.println(a);
		return sc.nextFloat();
	}
	default char m4(String b) {
		System.out.println(b);
		return sc.next().charAt(0);
	}
}
public class abs11 implements if2{ 
	public int m1(boolean b) {
		System.out.println(b);
		return sc.nextInt();
	}
	public boolean m2(char c) {
		System.out.println(c);
		return sc.nextBoolean();
	}
	public static void main(String[] args) {
		if2 obj=new abs11();
		System.out.println(obj.m1(sc.nextBoolean()));
		System.out.println(obj.m2(sc.next().charAt(0)));
		System.out.println(obj.m3(sc.nextInt()));
		System.out.println(obj.m4(sc.next()));
	}
}
