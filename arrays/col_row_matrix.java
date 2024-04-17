//{2,2,2}{3,3,3}{5,5,5}----row matix
//{1,2,3}{1,2,3}{1,2,3}----column matrix
package arrays;

import java.util.Scanner;

public class col_row_matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),r=0,c=0;
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
				if(a[i][j]==a[i][0]) {
					r++;
				}
			}
			int k=0;
			for(int j=0;j<n;j++) {
				if(a[j][k]==a[j][k]) {
					c++;
				}
			}
		}
//		for(int k=0;k<n;k++) {
//			int j=0;
//			for(int i=0;i<n;i++) {
//				if(a[i][j]==a[i][j]) {
//					c++;
//				}
//			}
//		}
		if(r==c && r==n*n) {
			System.out.println("Both Equal row and column matrix");
		}
		else if(r==n*n) {
			System.out.println("Equal Row matrix");
		}
		else if(c==n*n) {
			System.out.println("Equal Column matrix");
		}
		else {
			System.out.println("normal matrix");
		}
	}

}
