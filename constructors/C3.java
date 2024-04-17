/*Create a java application where we have one class it contains a default constructor, a 
single parameterized constructor, a double parameterized constructor and a triple 
parameterized constructor, then invoke all these constructors under main method by 
providing dynamic inputs. (class c3)*/
package constructors;

import java.util.Scanner;

public class C3 {
	static Scanner sc=new Scanner(System.in);
	C3(){
		String a=sc.next();
		System.out.println(a);
	}
	C3(int i){
		System.out.println(i);
	}
	C3(float f,String s){
		System.out.println(f);
		System.out.println(s);
	}
	C3(double d,float f,boolean b){
		System.out.println(d);
		System.out.println(f);
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new C3();
		new C3(sc.nextInt());
		new C3(sc.nextFloat(),sc.next());
		new C3(sc.nextDouble(),sc.nextFloat(),sc.nextBoolean());
	}

}
