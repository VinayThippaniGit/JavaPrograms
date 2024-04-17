package inheritance;

import java.util.Scanner;

public class AccesingClassesVthObj {

	public static void main(String[] args) {
		System.out.println("mamatha");
		
		P obj=new R();
		obj.mn();
		
		/*P p=null; //at compile time the whole process carries on through reference variable only,but at run time it will fail as no object was created
		Q q=null; //at run time if its doesn't points to any object it will give NullPointerException.
		R r=null; //it can access all the members of its type and its super type. i.e P,Q,R and Object.
		
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input<100) {
			p=new P();
			
		}else if(input>100) {
			p=new Q();
			q=new Q();
		}else {
			p=new R();
			q=new R();
			r=new R();
		}
		
		p.m1();p.m2();
		//p.m3();p.m4();p.m5();//cannot access its child members
		p.equals(p);p.hashCode();//but can access their parent class members(object class)
		
		
		q.m1();q.m2();q.hashCode();
		q.m3();q.m4();
		//q.m5(); //as m5() resides in child class ,it cant be accessed
		
		
		P pq=new R();
		//pq.m1();
		//pq.m3(); cant be accessed ,only its type and its super type members can be accessed regardless whatever the object it is.
		
		Q rq=new R();
		rq.m1();
		return 10;*/
	}
}
//private > default > protected > public
class P{
	static void m1() {}
	public void m2() {}
	public void mn() {
		System.out.println("P");
	}
}
class Q extends P{
	protected static void m1() {}
	public void m3() {}
	public void m4() {}
	public void mn() {
		System.out.println("Q");
	}
}
class R extends Q{
	public void m5() {}
}
