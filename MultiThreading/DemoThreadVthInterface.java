package MultiThreading;

public class DemoThreadVthInterface {

	public static void main(String[] args) {
		DemovthInterface obj=new DemovthInterface();
		for(int i=999;i>0;i--) {
			System.out.println(i);
		}
	}

}
class DemovthInterface implements Runnable{
	public void run() {
		for(int i=0;i<1500;i++) {
			System.out.println(i+"       "+i);
		}
	}
}
