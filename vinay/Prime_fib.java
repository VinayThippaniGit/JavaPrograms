package com.vinay;

import java.util.Scanner;
//2 --- 3,,5--7
public class Prime_fib {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			nextPrime(n);
				
		}
		public static void nextPrime(int n)
		{
			int c=0;
			for(int i=n+1;i>0;i++)
			{
				c=0;
				for(int k=1;k<=i;k++)
				{
					if(i%k==0)
					{
						c++;
					}
				}
				if(c==2)
				{
					System.out.print(i+" ");
					nextFibonacci(n,0,1);
					break;
				}
			}
		}
		public static void nextFibonacci(int n,int a,int b)
		{
			int c=a+b;
			if(c<n) {
				a=b;
				b=c;
				nextFibonacci(n,a,b);
			}
			else {
				System.out.println(c);
			}
		}
}
	
	/*	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int c=1;
				int m=2;
				int pc=0;
				int a=0,b=1,d;
				for(int i=1;i<=n;i++)
				{
					for(int j=1;j<=i;)
					{
						if(c%2==1)
						{
							pc=0;
							for(int k=1;k<=m;k++)
							{
								if(m%k==0)
								{
									pc++;
								}
							}
							if(pc==2)
							{
								System.out.print(m+" ");
								c++;
								j++;
							}
							m++;
						}
						else
						{
							System.out.print(a+" ");
							d=a+b;
							a=b;
							b=d;
							c++;
							j++;
						}
					}
					System.out.println();
				}

		}

}

/*	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=0;
		int f1=0,f2=1;
		int primeLogicEnd=1;
		int primeStart=2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				k++;
				if(k%2==0) {
					System.out.print(f1+" ");
					int f3=f2+f1;
					f1=f2;
					f2=f3;
				}
				else {
					int serialCheckForPrime=primeStart;
					while(primeLogicEnd!=0) {
						int count=0;
						for(int divisor=2;divisor<serialCheckForPrime;divisor++) {
							if(serialCheckForPrime%divisor==0) {
								count++;
							}
						}
						if(count==0) {
							primeLogicEnd=0;
							System.out.print(serialCheckForPrime+" ");
						}
						primeStart=++serialCheckForPrime;
						//serialCheckForPrime++;
					}
					//primeStart=++serialCheckForPrime;
					primeLogicEnd=1;
				}
			}
			System.out.println();
		}
	}
}*/