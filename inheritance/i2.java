/*Create a java application where we have a mobile manufacturing company which will 
manufacture a respective branded mobile phone with specifications like ram, rom, 
camera, processor, operating system, battery and price and this mobile phone is 
released into wholesale market where the price has to increase by 10% and then from 
here it is taken to retail market where the price has to increase by 10% again. From here 
this mobile phone will be purchased by a customer and customer has to display all the 
specifications of the mobile phone by using a user-defined method and then invoke this 
method under main method by providing dynamic inputs. (class i2)*/
package inheritance;

import java.util.Scanner;
class Manufacture{
	static Scanner sc=new Scanner(System.in);
	int ram=sc.nextInt();
	int rom=sc.nextInt();
	int camera=sc.nextInt();
	int processor=sc.nextInt();
	String os=sc.next();
	float price=sc.nextFloat();
	Manufacture obj=new Market();;
	void m1() {
		System.out.println("Manu m1()");
	}
}
class Market extends Manufacture{
	void m1(){
		System.out.println("Maraket m1()");
	}
	{
	price+=((10*price)/100);
	}
}
class retail extends Market{
	{
		price+=((10*price)/100);
	}
}
public class i2 extends retail{
	void display() {
		System.out.println("RAM : "+ram+"GB");
		System.out.println("ROM : "+rom+"GB");
		System.out.println("Camera : "+camera+"MP");
		System.out.println("Processor : "+processor);
		System.out.println("OS : "+os);
		System.out.println("Price : "+price);
	}
	public static void main(String[] args) {
		i2 obj=new i2();
		obj.display();
	}
}