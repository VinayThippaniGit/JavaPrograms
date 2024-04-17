package exceptionHandling;

import java.util.Scanner;

public class Demo {
//Throws keyword is written in method signature, i.e to report the causable exception , for our understanding that what tpe of exceptio may occur in it
//throw keyword is used to throw our customized exception that was created by us explicitly
/*We can have multiple catch blocks for one single try block
 * ddepending the exception type occured the corresponding suitable
 * catch block will be executed
 * inside one catch block we can have multiple exception-->
 * catch(ArithmeticException | NullPointerException ex){...}
 * Throwable -- Exception -- subExceptions (Parent to child tree)
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			int res=a/b;
			System.out.println(res);
		}catch(ArithmeticException ex) {
			System.out.println("Cannot divide by zero");
			ex.printStackTrace();
		}catch(Exception ex) {
			//Arithmetic is child of exception
		}catch(Throwable ex) {
			//all are childs of Throwable
			//if any exception was missed to hanlde , then by throwable class will handle all type of exceptions that we missed to mention in catch block
		}	
		
		finally {
			System.out.println("No matter what the exception will be finally block will always execute once the try block gets completed");
		}
		
	}

}
