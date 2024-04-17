/*Create a java application where we have one interface it consists of two abstract 
methods then inherit this interface into a concrete class to provide functionality for all 
abstract method and then invoke all the properties under main method by providing 
dynamic inputs. (class ab10)*/
package interfaces;
interface if1{
	void m1();
	int m2();
	static void m3() {
		System.out.println("m3()");
	}
	default void m4() {
		System.out.println("m4()");
	}
}
public class abs10 implements if1{
	public void m1() {
		System.out.println("m1()");
	}
	public int m2() {
		System.out.println("m2()");
		return 10;
	}
	
	public static void main(String[] args) {
		if1 obj=new abs10();
		obj.m1();
		System.out.println(obj.m2());
		if1.m3();
		obj.m4();
	}
}