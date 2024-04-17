/* Create a java application where we have one class it contains a default constructor, 
double parameterized constructor and a triple parameterized constructor. You also have 
methods like m1, m2, m3 with parameter and return type, then invoke all the methods 
under main and invoke m1 under default constructor, m2 under double parameterized 
constructor and m3 under triple parameterized constructor by providing dynamic inputs.
(class ch1)*/
package constructors;

import java.util.Scanner;

public class CH1 {
	static Scanner sc=new Scanner(System.in);
	CH1(){
		System.out.println(m1(sc.next()));
		System.out.println(sc.next());
	}
	CH1(int a,String s){
		System.out.println(m2(sc.nextFloat()));
		System.out.println(a);
		System.out.println(s);
	}
	CH1(float f,boolean b,double d){
		System.out.println(m3(sc.nextLong()));
		System.out.println(f);
		System.out.println(b);
		System.out.println(d);
	}
	int m1(String a) {
		System.out.println(a);
		return sc.nextInt();
	}
	char m2(float f) {
		System.out.println(f);
		return sc.next().charAt(0);
	}
	boolean m3(long l) {
		System.out.println(l);
		return sc.nextBoolean();
	}
	public static void main(String[] args) {
		new CH1();
		new CH1(sc.nextInt(),sc.next());
		new CH1(sc.nextFloat(),sc.nextBoolean(),sc.nextDouble());
	}

}
