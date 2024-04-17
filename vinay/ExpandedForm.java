package com.vinay;

public class ExpandedForm {

	public static void main(String[] args) {
		int n=4358;
		int c=0;
		int temp=n;
		while(temp>0) {//To get the count of no. of digits
			temp/=10;
			c++;
		}
		temp=n;
		while(temp>0) {
			c--;
			int tens=(int)Math.pow(10, c);//To get 10's according to count
			int quo=temp/tens; //dividing will give the quotoent of 1 digit
			System.out.print(quo*tens); //prints the single digit with expanded form
			if(c!=0) {
				System.out.print("+");
			}else {
				System.out.print("="+n);
			}
			temp%=tens;
		}
	}

}
