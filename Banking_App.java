package com.banking;

import java.util.Scanner;

public class Banking_App {
	static Scanner sc=new Scanner(System.in);
	static long temp=95;
	static int user=0,count=1;
	static String name,password;
	static int amount,balance,previousTransaction,attempts=3;
	static long ac=1000000000,an,mbl;
	static Banking_App obj=new Banking_App();
	static Banking_App user1=new Banking_App();
	static Banking_App user2=new Banking_App();
	static Banking_App user3=new Banking_App();
	static Banking_App user4=new Banking_App();
	static Banking_App user5=new Banking_App();
	public static void main(String[] args) {
		System.out.println("Welcome to the world number one recognized bank");
		System.out.println("Bank Name : SBI Bank");
		System.out.println("Bank Branch : KPHB,Hyderabad");
		System.out.println("IFSE Code : IFSE12345");
		System.out.println("We can store only 5 more new customers only.So please co-operate.");
			user1.register();
			user2.register();
			user3.register();
			user4.register();
			user5.register();
			obj.login();
			
	}
	void register() {
		System.out.println("=============================");
		System.out.print("Enter Customer Number "+ ++user+" Details : \nName : ");
		name=sc.nextLine();
		if(count!=1) {
			sc.next();
		}
		count++;
		//System.out.print("Mobile Number : ");
		//mbl=sc.nextLong();
		//System.out.print("Enter Your Aadhar Number :");
		//an=sc.nextLong();
		System.out.println("Details are verified.\nYour account number is :"+temp++);
		System.out.print("Enter your Account number for checking : ");
		ac=sc.nextLong();
		System.out.print("Create a Password : ");
		password=sc.next();
		System.out.println("Congratulations Your Account is created.\nPlease Login to continue our services");
	}
	void login() {
		System.out.print("==============LOGIN WITH YOUR DETAILS===============\nEnter Account Number : ");
		long account_number=sc.nextLong();
		if(account_number==user1.ac) {
			System.out.print("Enter the password : ");
			if(sc.next().equals(user1.password)) {
				System.out.println("Login succesfull");
				System.out.println("Account Holder Name : "+user1.name);
				System.out.println("Account number : "+user1.ac);
				user1.Details();
			}
			else {
				System.out.println("Wrong Password.....Please Check your password");
				login();
			}
		}
		else if(account_number==user2.ac) {
			System.out.print("Enter the password : ");
			if(sc.next().equals(user2.password)) {
				System.out.println("Login succesfull");
				System.out.println("Account Holder Name : "+user2.name);
				System.out.println("Account number : "+user2.ac);
				user2.Details();
			}
			else {
				System.out.println("Wrong Password.....Please Check your password");
				login();
			}
		}
		else if(account_number==user3.ac) {
			System.out.print("Enter the password : ");
			if(sc.next().equals(user3.password)) {
				System.out.println("Login succesfull");
				System.out.println("Account Holder Name : "+user3.name);
				System.out.println("Account number : "+user3.ac);
				user3.Details();
			}
			else {
				System.out.println("Wrong Password.....Please Check your password");
				login();
			}
		}
		else if(account_number==user4.ac) {
			System.out.print("Enter the password : ");
			if(sc.next().equals(user4.password)) {
				System.out.println("Login succesfull");
				System.out.println("Account Holder Name : "+user4.name);
				System.out.println("Account number : "+user4.ac);
				user4.Details();
			}
			else {
				System.out.println("Wrong Password.....Please Check your password");
				login();
			}
		}
		else if(account_number==user5.ac) {
			System.out.print("Enter the password : ");
			if(sc.next().equals(user5.password)) {
				System.out.println("Login succesfull");
				System.out.println("Account Holder Name : "+user5.name);
				System.out.println("Account number : "+user5.ac);
				user5.Details();
			}
			else {
				System.out.println("Wrong Password.....Please Check your password");
				login();
			}
		}
		else {
			System.out.println("Invalid Account number.Please register.");
		}
	}
	void checkBalance() {
		System.out.println("=============================\nYour Account Balance is : "+balance+"\n=============================");
	}
	void credit() {
		System.out.print("Enter the Amount to deposit : ");
		amount=sc.nextInt();
		System.out.println("=============================\nYou have deposited "+amount+"\n=============================");
		balance+=amount;
		previousTransaction=amount;
		}
	void debit() {
		System.out.print("Enter the Amount to Withdraw : ");
		amount=sc.nextInt();
		System.out.println("=============================\nYou have debited "+amount+"\n=============================");
		balance-=amount;
		previousTransaction=-amount;
	}
	void previousTransaction() {
		if(previousTransaction<0) {
			System.out.println("=============================\nYou have debited "+amount+"\n=============================");
		}
		else if(previousTransaction>0) {
			System.out.println("=============================\nYou have credited "+amount+"\n=============================");
		}
		else {
			System.out.println("=============================\nNo Transaction Occured.\n=============================");
		}
	}

	void Details() {
		System.out.println("=============================");
		System.out.println("Welcome to our Banking Services.");	
		System.out.println("=============================");
		char option='/';
		System.out.println("A.Check Balance\nB.Credit\nC.Debit\nD.Previous Transaction\nE.Exit\n=============================");
		do {
			option=sc.next().charAt(0);
			switch(option) {
			case 'A':
				checkBalance();
				break;
			case 'B':
				credit();
				break;
			case 'C':
				debit();
				break;
			case 'D':
				previousTransaction();
				break;
			case 'E':
				System.out.println("=============================");
				break;
			default:
				System.out.println("Invalid option! Please Try again.");
				break;
			}
		}while(option!='E');
		System.out.println("Thank u.");
		char option1='/';
		do {
			System.out.println("Do you want to login again?");
			System.out.println("Y.YES");
			System.out.println("N.NO");
			option1=sc.next().charAt(0);
			if(option1=='Y') {
				login();
			}
		}while(option1!='N');
		System.out.println("THANK YOU!");
		}
}