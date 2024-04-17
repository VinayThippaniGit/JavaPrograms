/* Create a java application where we have two interfaces with one abstract method each, 
inherit these two interfaces into one more interface which contains one abstract 
method and one defined method then inherit this interface into an abstract class where 
we have one parameterized constructor, one abstract method and one defined method. 
Then inherit this class into a concrete class where we have to provide functionality for all 
abstract methods and then invoke all the methods under main by providing dynamic 
inputs. (class ab13)*/
package interfaces;

import java.util.Scanner;

interface if01{
	static Scanner sc=new Scanner(System.in);
	int m1(char a);
}
interface if02{
		char m2(int b);
}
interface if03 extends if01,if02{
	boolean m3(boolean c);
	default String m4(String d) {
		System.out.println(d);
		return sc.next();
	}
}
abstract class ab01 implements if03{
	ab01(int e){
		System.out.println(e);
	}
	abstract boolean m5(float f);
	String m6(int g) {
		System.out.println(g);
		return sc.next();
	}
}

public class abs13 extends ab01 {
	public int m1(char a) {
		System.out.println(a);
		return sc.nextInt();
	}
	public char m2(int b) {
		System.out.println(b);
		return sc.next().charAt(0);
	}
	public boolean m3(boolean c) {
		System.out.println(c);
		return sc.nextBoolean();
	}
	boolean m5(float f) {
		System.out.println(f);
		return sc.nextBoolean();
	}
	abs13(){
		super(sc.nextInt());
	}
	public static void main(String[] args) {
		abs13 obj=new abs13();
		System.out.println(obj.m1(sc.next().charAt(0)));
		System.out.println(obj.m2(sc.nextInt()));
		System.out.println(obj.m3(sc.nextBoolean()));
		System.out.println(obj.m5(sc.nextFloat()));
		System.out.println(obj.m4(sc.next()));
		System.out.println(obj.m6(sc.nextInt()));
	}

}
