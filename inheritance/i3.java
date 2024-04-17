/*Create a java application where we need to satisfy hybrid inheritance by using above 
diagrammatic representation (check diagram in notes). (class i3)*/
package inheritance;
import java.util.Scanner;
class A {
	Scanner sc=new Scanner(System.in);
	String name;
	int id;
	{
		name=sc.next();
		id=sc.nextInt();
	}
}
class B extends A{
	{
		System.out.println("NAME : "+name);
	}
}
class C extends A{
	String gender;
	{
		System.out.println("ID : "+id);
		System.out.println("Enter gender : ");
		gender=sc.next();
	}
}
class D extends C{
	float height;
	{
		System.out.println("GENDER : "+gender);
		System.out.println("Enter height : ");
		height=sc.nextFloat();
	}
}
class E extends D{
	String fav;
	{
		System.out.println("HEIGHT : "+height);
		System.out.println("fav food : ");
		fav=sc.next();
	}
}
class F extends E{
	{
		System.out.println("Favourite food : "+fav);
	}
}
class G extends E{
	{
		System.out.println("Favourite food : "+fav);
	}
}
class H extends E{
	{
	E ob=new E();
	}
}
public class i3{
	
	void display() {
		//System.out.println("Favourite food : "+obj1.fav);
	}
	public static void main(String[] args) {
		H obj1=new H();
		//i3 obj=new i3();
		//obj.display();
	}
}
