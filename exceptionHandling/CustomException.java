package exceptionHandling;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}else {
			 /*//Throwing an exception (built in exception)
			IllegalArgumentException ex= new IllegalArgumentException("Invalid age");
			throw ex; //raising exception
			
			//throw new IllegalArgumentEXception("Invalid Age");
			*/
			
			/*own exception
			throw new InvalidAgeException("invalid age "+age);
			*/
		}
	}

}
class Checked{
	//checked exceptions compulsurily needed to be reported , they should use throws
	void m1() throws Exception {
		throw new Exception();
	}
}
class InvalidAgeException extends RuntimeException{
	InvalidAgeException(){
		//super(); //optional
	}
	InvalidAgeException(String s){
		//super(s);
	}
}

class Sample1 extends Throwable{ 
	//highly discouraged
}
class Sample2 extends Exception{
	//falls under checked exception
}
class Sample3 extends RuntimeException{
	//falls under unchecked exception
}
class Sample4 extends Error{
	//not recommended
	//unchecked exception
}
