package arrays;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[4];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int newArray[]=new int[a[1]];
		int k=a[0];
		for(int i=0;i<newArray.length;i++) {
			newArray[i]=k;
			if(i%2==0) {
				k+=a[2];
			}
			else {
				k+=a[3];
			}
		}
		for(int x:newArray) {
			System.out.println(x+" ");
		}
	}

}
