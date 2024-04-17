package innerClasses;

public class Anonymous {

	public static void main(String[] args) {
		A obj=new A() {
			//Anonymous class
			//1.It is creating an anonymous class that is subtype of Class A(same like class B)So it should implement m1() method
			//2.It is creating object to that anonymous class of A type
			public void m1() {
				System.out.println("Anonymous m1()");
			}
		};
		obj.m1(); // it will call anonymous m1()
		
		A obj2=new B();
		obj2.m1(); // it will call m1() of B class
		
		A1 ob1=new A1() {
			public void m2() {
				System.out.println("m2() of anonymous");
			}
		};
		ob1.m2(); // will call m2() anonymous class
		
		A1 ob2=new B1();
		ob2.m2(); //will call m2() of B1
		
		//it is also possible to write-->
		A1 ob=new B1() {//no need to write m2() as it is already implemented in B class,so new B() contains m2();
		};
		
	}

}
interface i1{
	void m1();
}
abstract class ABSi1 implements i1{
	public abstract void m1();
}
abstract class A {
	public abstract void m1();
}
class B extends A{
	public void m1() {
		System.out.println("Normal m1()");
	}
}
interface A1{
	void m2(); //by default all methods of interfaces are public.
}
class B1 implements A1{
	//void m2() {//should be public
	public void m2() {
		System.out.println("m2() of B1");
	}
}
