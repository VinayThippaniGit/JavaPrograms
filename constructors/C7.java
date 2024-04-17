/*Create a java application where we need to create one object parameterized 
constructor it has to display any user friendly message on the console when 
we invoke this constructor under main method. (class c7)*/
package constructors;
import java.util.Scanner;
public class C7 {
	static Scanner sc=new Scanner(System.in);
	C7(){
		
	}
	
	C7(C7 obj){
		System.out.println(obj);
	}
	public static void main(String[] args) {
		new C7(new C7());
	}
}
