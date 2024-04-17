package com.vinay;

import java.util.Scanner;
public class Bank extends Bank2{
	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.main();
	}
}
class Bank2 {
	static int n=100,temp,user,ac=424537,record=0;
	int amount=0,balance=0,previousTransaction=0;
	static String name[]=new String[n],pass,password[]=new String[n];
	static int aca[]=new int[n];
	static long mbl[]=new long[n];
	static Bank2 user1=new Bank2(); //object for 1st customer.
	static Bank2 user2=new Bank2(); //object for 2nd customer.
	static Bank2 user3=new Bank2(); //object for 3nd customer.
	static Bank2 userN=new Bank2();
	static Bank2 Vinay=new Bank2();
	static Bank2 Mamatha=new Bank2();
	/*Here I decided to create accounts for only 3 users,so i created only 3 objects.
	If u want to create more users accounts then please create new objects 
	with the continuation of series and call that users in openAccount method in if else 
	conditions from line number 105 by following the procedures from line 96.*/
	static Scanner sc=new Scanner(System.in);
	void main() {
		name[99]="Thippani_Vinay";
		mbl[99]=6303976298l;
		aca[99]=765679;
		Vinay.balance=100000;
		password[99]="vinay@2001";
		name[98]="Biyyana_Mamatha";
		mbl[98]=9381386595l;
		aca[98]=666052;
		Mamatha.balance=200000;
		password[98]="mamatha@2002";
		System.out.println("Welcome to our banking services");
		System.out.println("Bank Name   : ******* Bank");
		System.out.println("Bank Branch : *********");
		System.out.println("IFSC Code : IFSC12345");
		options();
	}
	void options() {
		System.out.println("*========*========*=========*==========*\nSelect an option: ");
		char option1='/';
			System.out.println("A.Register\nB.Login\nC.Diplay Users\nE.Exit");
			option1=sc.next().charAt(0);
			if(option1=='A') {
				register();
			}
			else if(option1=='B') {
				login();
			}
			else if(option1=='C') {
				display();
			}
			else if(option1=='E') {
				System.out.println("*========*========*=========*==========*\nTHANK YOU\n*========*========*=========*==========*");
				System.exit(0);
			}
			else {
				System.out.println("Invalid Option.Please Try again.");
				login();
			}
	}
	void display() {
		System.out.print("*========*========*=========*==========*\nThis is to display all the registered users in the bank\nOnly manager can access it.\nEnter your password(Manager password) : ");
		String mngPass="1234";
		String manager_password=sc.next();
		if(manager_password.equals(mngPass)) {
			for(int i=0;i<n;i++) {
				if(aca[i]!=0) {
					System.out.println("---------------------------\nAccount number : "+aca[i]+"\nAccount Holder : "+name[i]+"\nMobile Number  : "+mbl[i]);
				}
			}
			System.out.println("---------------------------");
			options();
		}
		else {
			System.out.println("-------------------------\nInvalid Password!Please Try Again.");
			options();
		}
	}
	void register() {
		System.out.println("Are you a new customer.Please Register to login.");
			System.out.print("Enter the customer name(No Spaces,Use Underscores) : ");
			name[record]=sc.next();
			System.out.print("Enter your Mobile Number : ");
			mbl[record]=sc.nextLong();
			System.out.println("Details verified.");
			System.out.print("Create your password.\n*Dont forget it.\n*It is mandatory to remember your password for your future references* : ");
			password[record]=sc.next();
			System.out.println("*========*========*=========*==========*\nRegistration Successfull.\n*========*========*=========*==========*");
			System.out.println("ACCOUNT NUMBER : "+ ac);
			aca[record]=ac+117;
			System.out.println("USER NAME :  "+name[record]);
			record++;
			System.out.println("*========*========*=========*==========*");
			options();
	}
	void login() {
		System.out.print("Enter the Account number to login to your account : ");
		user=sc.nextInt();
		temp=-1;
		for(int i=0;i<n;i++) {
			if(aca[i]==user) {
				temp=i;
			}
		}
		if(temp==-1) {
			System.out.println("No account founded.Please Check your account number and Try again!");
			options();
		}
		else {
		System.out.println("USER NAME : "+name[temp]);
		System.out.print("Enter your password : ");
		pass=sc.next();
		if(pass.equals(password[temp])) {
			openAccount();
		}
		else {
			System.out.println("Invalid Password! Please Login Again.");
			login();
		}
		}
	}
	void openAccount() {
		System.out.println("*========*========*=========*==========*");
		System.out.println("=====LOGIN SUCCESSFULL=====\nWelcome to our Banking Services.");	
		System.out.println("*========*========*=========*==========*");
		System.out.println("Account holder name : "+name[temp]);
		System.out.println("Mobile number : "+mbl[temp]+"\n-------------------------------------------------------");
		if(temp==0) {
			user1.services();
		}
		else if(temp==1) {
			user2.services();
		}
		else if(temp==2) {
			user3.services();
		}
		else if(temp==99) {
			Vinay.services();
		}
		else if(temp==98) {
			Mamatha.services();
		}
		else {
			userN.services();
		}
	}
	void services() {
		char option='/';
		System.out.println("A.Check Balance\nB.Credit\nC.Debit\nD.Previous Transaction\nE.Log Out\n-------------------------------------------------------");
		do {
			option=sc.next().charAt(0);
			switch(option) {
			case 'A':
				System.out.println("----------------------------------------\nYour Account Balance is : "+balance+"\n----------------------------------------");
				break;
			case 'B':
				System.out.print("Enter the Amount to deposit : ");
				amount=sc.nextInt();
				System.out.println("----------------------------------------\nYou have deposited "+amount+"\n----------------------------------------");
				balance+=amount;
				previousTransaction=amount;
				break;
			case 'C':
				System.out.print("Enter the Amount to Withdraw : ");
				amount=sc.nextInt();
				System.out.println("----------------------------------------\nYou have debited "+amount+"\n----------------------------------------");
				balance-=amount;
				previousTransaction=-amount;
				break;
			case 'D':
				if(previousTransaction<0) {
					System.out.println("----------------------------------------\nYou have debited "+amount+"\n----------------------------------------");
				}
				else if(previousTransaction>0) {
					System.out.println("----------------------------------------\nYou have credited "+amount+"\n----------------------------------------");
				}
				else {
					System.out.println("----------------------------------------\nNo Transaction Occured.\n=============================");
				}
				break;
			case 'E':
				System.out.println("-------------------Successfully logged out---------------------");
				break;
			default:
				System.out.println("Invalid option! Please Try again.");
				break;
			}
		}while(option!='E');
		System.out.println("Thank u.Do you want to login again.Choose an option");
		options();
	}
}
