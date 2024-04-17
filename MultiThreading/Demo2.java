package MultiThreading;

public class Demo2 {

	public static void main(String[] args) {
		Demo2Thread2 D2T2 =new Demo2Thread2();
		D2T2.start();
		System.out.println(Thread.currentThread());
		//System.out.println(D2T2.getId());
		for(int i=0;i<50;i++) {
			System.out.print("M");
		}
	}
}

class Demo2Thread2 extends Thread{
	public void run() {
		mD2T2();
	}
	public void mD2T2() {
		for(int i=0;i<50;i++) {
			System.out.print("V");
		}
	}
	
}
