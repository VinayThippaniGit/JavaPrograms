package arrays;

import java.util.Scanner;

public class array_powers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			System.out.print(((int)Math.pow(a[i], i+1))+" ");
		}
	}

}
