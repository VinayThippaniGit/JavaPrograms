package arrays;

import java.util.Scanner;

public class Dec_Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		String x="";
		while(n>0) {
			int r=n%2;
			x=r+x;
			n/=2;
		}
		int a[]=new int[x.length()];
		int i=0;
		while(temp>0) {
			a[i]=temp%2;
			temp/=2;
			i++;
		}
		for(int j=x.length()-1;j>=0;j--) {
			System.out.print(a[j]+" ");
		}
	}

}
