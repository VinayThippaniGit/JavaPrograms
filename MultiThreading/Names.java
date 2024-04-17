package MultiThreading;

public class Names {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		//displays the name of the current thread with all lines
		System.out.println("Default name--"+Thread.currentThread().getName());
		//prints name of the current thread
		Thread.currentThread().setName("Mama");
		System.out.println("Updated main name--"+Thread.currentThread().getName());
		//prints Mama
		MyThread t1=new MyThread();
		System.out.println("old t1 name--"+t1.getName());
		//prints name of the thread t1--Thread-0
		t1.setName("Thread 2");
		System.out.println("Updated t1 name--"+t1.getName());
		t1.start();
		//System.out.println(10/0);
		//shows error in Mama thread
	}
}
