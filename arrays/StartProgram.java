package arrays;

import java.util.Scanner;

public class StartProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		String b[][]=new String[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<c;i++)
		{
			sum=0;
			for(int j=0;j<r;j++)
			{
				sum+=a[j][i];
			}
			//System.out.println(sum);
			int d=0;
			for(int k=1;k<=sum;k++)
			{
				if(sum%k==0)
				{
					d++;
				}
			}
			if(d!=2)
			{
				for(int l=0;l<r;l++) {
					b[i][l]="*";
				}
			}
			else
			{
				for(int l=0;l<r;l++) {
					String temp=Integer.toString(a[i][l]);
					b[i][l]=temp;
				}
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
	}

}