package innerClasses;
//Accesing of static and non static inner classes
public class Demo {

	public static void main(String[] args) {
		Outer o=new Outer();
		Outer.NestedNonStatic nns=o.new NestedNonStatic();
		
		Outer.NestedStatic ns=new Outer.NestedStatic();
	}

}
class Outer{
	int a;
	static int b;
	void m1() {
		System.out.println(a);
		System.out.println(b);
		//m1(); //valid
		//m2(); //valid
		
		NestedNonStatic nns=new NestedNonStatic();
		
		NestedStatic ns=new NestedStatic();
	}
	static void m2() {
		Outer o=new Outer();
		NestedNonStatic nns=o.new NestedNonStatic();
		
		NestedStatic ns=new NestedStatic();
	}
	
	
	class NestedNonStatic{
		int x;
		static int y;
		void n1() {
			NestedNonStatic nns=new NestedNonStatic(); //can create object directly in NS context
			//Accessing NestedNonStatic members
			System.out.println(x);
			System.out.println(y);
			// n2(); //can call static methods directly
			//NestedNonStatic.n2(); //can call static methods with class name 
		}
		static void n2() {
			//NestedNonStatic nns=new NestedNonStatic(); //cant create object directly
			Outer o=new Outer();
			NestedNonStatic nns=o.new NestedNonStatic();
			
			//System.out.println(x); //x is a NSM should be called with obj reference
			System.out.println(nns.x);
			System.out.println(y);
			
			//nns.n1(); //valid
			//nns.n2(); //valid
			//NestedNonStatic.n2(); //valid
			//n2(); //valid
		}
	}
	static class NestedStatic{
		int p;
		static int q;
		void g1() {
			NestedStatic ns=new NestedStatic();
			
			System.out.println(p);
			System.out.println(q);
			//g1(); //valid
			//g2(); //valid
			
			System.out.println(NestedStatic.q);
			//NestedStatic.g2(); //valid
		}
		static void g2() {
			NestedStatic ns=new NestedStatic();
		}
	}
}