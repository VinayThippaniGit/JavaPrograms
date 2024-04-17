package inheritance;
//over riding method invocation and execution
public class TypeCasting {

	public static void main(String[] args) {
		Parent1 p1=new Child1();
		//accessing takes with respect to reference type
		//whereas execution takes place wrt object 
		
		p1.m1(); //calls Child1 m1();
		
		//Child1 c1=p1; //invalid -- can't store p1 of Parent1 type to Child1
		Child1 c1=(Child1)p1; //type casts p1 to child type i.e store the p1 object address into Child1 c1 address
		//but take Parent1 type of Parent1 object
		//explicit type casting
		Parent1 p2=new Parent1();
		//Child1 C2=(Child1)p2; //(invalid)in compile time it is ok it was casted
		//but p2 is holding Parent1 object , it can't be stored into Child1 c2 object Address
		//so it will lead to run time exception.(ClassCastException)
		
		p1.m1();
		p1.m2();
		//p1.m3();
		c1.m1();
		c1.m2(); //c1 is of Child1 type and Child1 object it will search for m2 1stly in Child1 class as it cant found it goes one step up and discovers m2() in Parent1 class
		c1.m3();
	}
}
class Parent1{
	void m1() {
		System.out.println("Parent m1()");
	}
	void m2() {
		System.out.println("Parent m2()");
	}
}
class Child1 extends Parent1{
	void m1() {
		System.out.println("Child m1()");
	}
	void m3() {
		System.out.println("Child m3()");
	}
}