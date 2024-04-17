package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Error {

	public static void main(String[] args) throws FileNotFoundException {
		//int x=5/0;
		//System.out.println(x);
		
//unchecked exception - Runtime exception and all its sub typees and error and its sub types
//checked exception - Exception type and all its subtypes that are not under RuntimeException.
		
		
		//checked exception : they are warned at compile time if not handled,so called compile time exceptions,they need to be handled at compile time only,regardless the exception may occur or not
		try{
			FileInputStream file=new FileInputStream("");  //FileNotFoundException [CE]
		}catch(FileNotFoundException ex) {
			
		}
		//checked exception needed to be handled at compile time only
		
		
		//unchecked exception : compiler dont warn at compile time as it his already handled in its class--NumberFormatException
		String data="1234";
		System.out.println(Integer.parseInt(data)); //[UCE]
		
		
	/*	long[] ar=null;
		try {
			ar=new long[Integer.MAX_VALUE];
		}catch(OutOfMemoryError e) {
			
		}
		System.out.println(ar); */
	}

}
