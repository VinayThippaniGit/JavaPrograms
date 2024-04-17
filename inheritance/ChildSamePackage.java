package inheritance;

public class ChildSamePackage extends Parent{
	int z=20;
	public void displayChildSamePackage() {
		//System.out.println("private a "+a);
		System.out.println("Package private b "+b);
		System.out.println("Protected c "+c);
		System.out.println("Public d "+d);
		//m1();
		m2();
		m3();
		m4();
	}
}
class obj{
	void diplay() {
		ChildSamePackage obj =new ChildSamePackage();
		System.out.println(obj.c);
		//obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}
}
