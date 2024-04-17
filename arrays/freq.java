package arrays;

import java.util.Scanner;

public class freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]= new int[7];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		int freq=1;
		int b[]=new int[a.length+1];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int i=1;i<b.length;i++) {
			if(b[i]==b[i-1]) {
				freq++;
			}
			if(b[i]!=b[i-1]) {
				System.out.println(b[i-1]+"-"+freq+"times");
				freq=1;
			}
		}
	}

}
