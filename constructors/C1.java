/*Create a java application it contains a default constructor it has to
display any user friendly message on the console while we invoke this
 constructor under main method.(class c1)*/
package constructors;

import java.util.Scanner;

public class C1 {
	static Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	C1(){
		System.out.println("mamu");
	}
	C1(char a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		new C1();
		new C1(sc.next().charAt(0));
	}

}
