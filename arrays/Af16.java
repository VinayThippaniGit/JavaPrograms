//16.	Input: {{1,2,3},{4,5,6},{5,6,7}} output: {{1,2,3,6},{4,5,6,15},{5,6,7,18}} (Last value sum of row values)
package arrays;

import java.util.Scanner;

public class Af16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int c2=c+1;
		int b[][]=new int[r][c2];
		for(int i=0;i<r;i++) {
			int sum=0;
			for(int j=0;j<c;j++) {
				b[i][j]=a[i][j];
				sum+=a[i][j];
				System.out.print(b[i][j]+" ");
			}
			b[i][c2-1]=sum;
			System.out.println(sum);
		}
	}
}
