package arrays;



/*Input 2 :            742

Ouput 2 :          Keith Number

Explanation :    7 + 4 + 2 =13

                         4 + 2 + 13 = 19

                         2 + 13 + 19 = 34

                         13 + 19 + 34 = 66

                         19 + 34 + 66 = 119

                         34 + 66 + 119 = 219

                         66 + 119 + 219 = 404

                         119 + 219 + 404 = 742. Which is equal to given number . So 742 is a Keith Number.
*/
import java.util.Scanner;
public class Kth_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int temp=n;
			int c=0;
			while(temp>0) {
				temp/=10;
				c++;
			}
			temp=n;
			int a[]=new int[c];
			int i=c-1;
			while(temp>0) {
				a[i]=temp%10;
				temp/=10;
				i--;
			}
			int sum=0;
			while(sum<n) {
				sum=0;
				for(int x:a) {
					sum+=x;
				}
				if(sum==n) {
					System.out.println(n+" is a kth number.");
					System.exit(0);
				}
				int index=0;
				while(index<c-1) {
					a[index]=a[index+1];
					index++;
				}
				a[index]=sum;
				
			}
		System.out.println("Not a kth number");
	}
}
