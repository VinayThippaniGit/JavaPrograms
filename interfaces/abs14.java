/* Create a java application where we have two interfaces with one abstract method each, 
we also have one abstract class which contains one parameterized constructor, one 
defined method and one abstract method, we also have one concrete class which 
contains one defined method and a parameterized constructor then inherit all these 
templates into one concrete class to provide functionality for abstract methods and 
invoke all the methods under main by providing dynamic inputs. (class ab14)*/
package interfaces;

import java.util.Scanner;

interface if001{
	void m1(int a);
}
interface if002{
	void m2(boolean b);
}
abstract class ab001{
	ab001(float c){
		System.out.println(c);
	}
	void m3(boolean d) {
		System.out.println(d);
	}
	abstract void m4(char e);
}
class A001{
	void m5(int f) {
		System.out.println(f);
	}
	A001(float g){
		System.out.println(g);
	}
}
public class abs14 extends ab001 implements if001,if002{
	static Scanner sc=new Scanner(System.in);
	public void m1(int a) {
		System.out.println(a);
	}
	public void m2(boolean b) {
		System.out.println(b);
	}
	abs14(){
		super(sc.nextFloat());
	}
	void m4(char e) {
		System.out.println(e);
	}
	public static void main(String[] args) {
		if001 obj=new abs14();
		obj.m1(sc.nextInt());
		if002 obj2=new abs14();
		obj2.m2(sc.nextBoolean());
		ab001 obj3=new abs14();
		obj3.m3(sc.nextBoolean());
		obj3.m4(sc.next().charAt(0));
		A001 c=new A001(sc.nextFloat());
		c.m5(sc.nextInt());
	}

	
}
