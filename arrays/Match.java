package arrays;

import java.util.Scanner;

public class Match {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int matches=sc.nextInt();
		int players=sc.nextInt();
		int a[][]=new int[matches][players];
		for(int i=0;i<matches;i++) {
			for(int j=0;j<players;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int max,p=-1;
		for(int i=0;i<matches;i++) {
			max=0;
			for(int j=0;j<players;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
					p=j;
				}
			}
			System.out.println("Player"+(p+1)+" - "+a[i][p]);
		}
		int sum=0,max2=0,m=0;
		for(int j=0;j<players;j++) {
			sum=0;
			for(int i=0;i<matches;i++) {
				sum+=a[i][j];
			}
			if(sum>max2) {
				max2=sum;
				m=j+1;
			}
			
		}
		System.out.println("Player"+m+" - "+max2);
	}

}
