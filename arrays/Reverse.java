package arrays;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=n-1;i>=0;i--) {
			int rev=0;
			while(a[i]>0) {
				int r=a[i]%10;
				rev=rev*10+r;
				a[i]/=10;
			}
			System.out.print(rev+" ");
		}
	}
}
