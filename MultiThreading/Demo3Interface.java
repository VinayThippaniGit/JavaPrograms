package MultiThreading;

public class Demo3Interface {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread.currentThread().setName("Vinay");
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		//MyRunnable r=new MyRunnable();
		Thread t1=new Thread(new MyRunnable());//passing object can give r also as r is having object
		//if we dont pass obj then run() of thread class only will be executed , it doesnt execute our MyRunnable run().
		System.out.println(t1.getName());
		t1.start();//new thread created and will execute from run method
		Thread t2=new Thread(new MyRun());
		t2.start();
		for (int i = 0; i < 40; i++) {
			System.out.print("V");
		}
	}
}
class MyRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 40; i++) {
			System.out.print("M");
		}
	}
}
class MyRun implements Runnable{
	public void run() {
		for (int i = 0; i < 40; i++) {
			System.out.print("L");
		}
	}
}
