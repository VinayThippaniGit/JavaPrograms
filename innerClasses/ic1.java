/*Create java application where we have one class that contains one private variable and 
one method with parameter and return type, inside this class, we have two inner 
classes, which contain one method with parameter and return type individually, these 
methods have to access the private variable and then we need to invoke all these 
methods under main by providing dynamic inputs.(class ic1)*/
package innerClasses;

import java.util.Scanner;

public class ic1 {
	Scanner sc=new Scanner(System.in);
	private int pass=1234;
	private int m1(boolean b) {
		System.out.println(b);
		return sc.nextInt();
	}
	 class ic01{
		 int m2(int a) {
			 pass=a;
			 System.out.println(pass);
			return sc.nextInt(); 
		 }
	}
	 class ic02{
		 int m3(int b) {
			 pass=b;
			 System.out.println(pass);
			 return sc.nextInt();
		 }
	 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ic1.ic01 obj=new ic1().new ic01();
		System.out.println(obj.m2(sc.nextInt()));
		ic1.ic02 obj2=new ic1().new ic02();
		System.out.println(obj2.m3(sc.nextInt()));
		ic1 obj3=new ic1();
		System.out.println(obj3.m1(sc.nextBoolean()));
	}

}
