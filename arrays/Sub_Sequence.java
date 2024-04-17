package arrays;

import java.util.Scanner;

public class Sub_Sequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int k=(int)Math.pow(2, n);
		for(int i=0;i<k;i++) {
			String bin=binary(i);
			int ind=0;
			for(int j=bin.length()-1;j>=0;j--) {
				if(bin.charAt(j)=='1') {
					System.out.print(a[ind]+" ");
				}
				ind++;
			}
			System.out.println();
			ind++;
		}
	}
	static String binary(int i) {
		String bin="";
		while(i>0) {
			bin=i%2+bin;
			i/=2;
		}
		return bin;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int k=(int)Math.pow(2,n);
		for(int i=1;i<k;i++) {
			String bin=binary(i);
			int ind=0;
			for(int j=bin.length()-1;j>=0;j--) {
				if(bin.charAt(j)=='1') {
					System.out.print(a[ind]+" ");
				}
				ind++;
			}
			System.out.println();
		}
	}
	static String binary(int i) {
		String bin="";
		while(i>0) {
			bin=(i%2)+bin;
			i/=2;
		}
		return bin;
		*/

}
