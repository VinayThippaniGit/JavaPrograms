package methods;
import java.util.Scanner;
public class Pattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				if (n % 2 != 0) {
					if (i % 2 != 0) {
						a = j;
					} else {
						a--;
					}
				}
				else {
					if(i%2!=0) {
						a--;
					}
					else {
						a=j;
					}
				}
				System.out.print(a+ " ");
			}
			System.out.println();
		}
	}
}
