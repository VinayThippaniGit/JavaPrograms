package arrays;

import java.util.Scanner;

public class Identity_matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),c=0,m=0;
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
				if(a[i]==a[j] && a[i][j]==a[0][0]) {
					c++;
				}
				if(a[i]!=a[j] && a[i][j]==0) {
					m++;
				}
			}
		}
		if(c==n && m==(n*n)-c) {
			System.out.println(a[0][0]+" Identity Matrix");
		}
		else {
			System.out.println("Not an identity Matrix");
		}
		
	}

}
