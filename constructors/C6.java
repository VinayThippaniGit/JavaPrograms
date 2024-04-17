/*Create a java application where we need to create any two constructors and 
 * invoke any one constructor under main then it has to invoke the remaining 
 * constructor automatically. (class c6)*/
package constructors;

import java.util.Scanner;

public class C6 {
	static Scanner sc=new Scanner(System.in);
	C6(){
		System.out.println(sc.nextInt());
	}
	C6(boolean b){
		System.out.println(b);
		new C6();
	}
	public static void main(String[] args) {
		new C6(sc.nextBoolean());
	}

}
