package inheritance;

public class Parent {
	ChildSamePackage obj=new ChildSamePackage();
	private int a;// can only be accessed within the class
	int b;// Accessed anywhere in the same package
	protected int c;//
	public int d;

	private void m1() {

	}

	void m2() {
	}

	protected void m3() {
	}

	public void m4() {
	}
}
class x extends Parent{
	void display() {
		System.out.println(obj.z);
		obj.displayChildSamePackage();
	}
}
