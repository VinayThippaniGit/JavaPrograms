package arrays;

public class fib {
	public static void main(String[] args) {
		int a[]= {1,0,2,5,7,8,9,13,21,34,55,89};
		float sum=0,c=0;
		for(int i=0;i<a.length;i++) {
			if(fib(a[i])==true) {
				sum+=a[i];
				c++;
				//System.out.println(a[i]);
			}
		}
		System.out.println((float)(sum/c));
	}
	public static boolean fib(int n) {
		boolean x=false;
		int a=0,b=1,c=0;
		while(c<n) {
			c=a+b;
			a=b;
			b=c;
		}
		if(c==n) {
			x=true;
		}
		return x;
	}
}
