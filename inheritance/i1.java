/*Create a java application where we have a bank it will provide customer details like 
account number, IFSC code, ATM pin and available balance to the customer, then 
customer has to display all the values by using a user defined method and then invoke 
this method under main method by providing dynamic inputs. (class abs10)*/
package inheritance;

import java.util.Scanner;
class Bank{
	Scanner sc=new Scanner(System.in);
	long accountNumber;
	String IFSC;
	long atm;
	float balance;
	{
		System.out.print("Enter Account number : ");
		accountNumber=sc.nextLong();
		System.out.print("Enter IFSC code : ");
		IFSC=sc.next();
		System.out.print("Enter ATM pin : ");
		atm=sc.nextLong();
		System.out.print("Enter Balance : ");
		balance=sc.nextFloat();
	}
}

public class i1 extends Bank{
	void display() {
		System.out.println("Account number : "+accountNumber);
		System.out.println("IFSC code : "+IFSC);
		System.out.println("ATM Number : "+atm);
		System.out.println("Bank Balance : "+balance);
	}
	public static void main(String[] args) {
		i1 obj1=new i1();
		obj1.display();
		i1 obj2=new i1();
		obj2.display();
		obj1.display();
	}
}
