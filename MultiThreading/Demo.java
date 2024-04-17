package MultiThreading;

public class Demo {
	/*In console the io blocks to print at the same time
	 * thats why it looks like sequential but in background
	 * multi threading is gng on,i.e they are running
	 * parallally 
	 */
	public static void main(String[] args) {
		Thread.currentThread().setPriority(8);
		Task t1=new Task();
		t1.start();
		/*It consists of a start0() method which was native one 
		 * which will be written in c++(native method stack in jvm),it will create a new thread
		 * and execution will be processed in the created object
		 * class from run method();
		 * 
		 * while with the start0() method a new thread being
		 * created it will remove the start method()
		 * from the main method frame and executes the main thread
		 * frame,i.e M for loop will be executed for some time(allocated time for it)
		 * until the thread is being created
		*/
		Thread[] tarray=new Thread[Thread.activeCount()];
		Thread.enumerate(tarray);
		for(int i=0;i<tarray.length;i++) {
			System.out.println(tarray[i]);
		}
		/*for(int i=0;i<1500;i++) {
			System.out.print("M");
		}*/
		
	}

}
class Task extends Thread{
	public void run() {
		System.out.println(Thread.currentThread());
	/*the run method is a predefined method in thread 
 	class where it is like a main method for new 
	thread that has been created,i.e from herse the
	execution will be started for the new thread*/
		doTask();
	}
	void doTask(){
		/*for(int i=0;i<1500;i++) {
		System.out.print("V");
		}*/
	}
}
