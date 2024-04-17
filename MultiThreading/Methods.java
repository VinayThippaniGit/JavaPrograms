package MultiThreading;

public class Methods {

	public static void main(String[] args) {
		System.out.println("main start");
		
		//isDaemon();(background thread)
		/*if only daemon threads are left then the jvm will terminates automaticlly
		 * it doesnt have the power to to keep the jvm running
		 * if there exits atleast one non-daemon thread then the jvm will keep running until the non --aemon thread finishes its work
		 * int he mean time some of the daemon thread execution can be done , but the jvm wont keep running until the non daemon thread finishes its job,only until non-daemon thread
		 * main thread is non-daemon thread(also called as user thread)
		 * child class posseses the parent daemon property
		 * we can set the daemon priority only before the thread getting started , once started we cant set the daemon property
		 */
		System.out.println("is Daemon : "+Thread.currentThread().isDaemon());
		
		System.out.println("is interrupted : "+Thread.currentThread().isInterrupted());
		
		MDemo task=new MDemo();
		Thread t1=new Thread(task);
		//t1.setDaemon(false); //As it was setted to non daemon the jvm will wait until the t1 thread work gets finished, i.e 1000 iterations will be executed
		//t1.setDaemon(true); //will terminate once the main thread finishes its job, no guarantee of how much the t1 thread work will be executed
		t1.start();
		
		//isInterrupted
		/*If a thread is sleeping,waiting , blocked, it will verify the interruption status immediatly 
		 * after gets out of sleeping,waiting,blocked state
		 * 
		 * if the thread was interrupted while sleeping,waiting,blocking, the thread will cause
		 * InterruptionException & clear the interuprion status.
		 * 
		 * 2- methods
		 * boolean isInterrupted() : doesnt clears the interuption status , jst return the boolean value
		 * static boolean interrupted() : changes the interruption status to false after returning the value , if was interrupted
		 */
		System.out.println("is t1 interrupted : "+t1.isInterrupted());
		t1.interrupt(); //interrupting the t1 from main , it is static method
		
		//isAlive();
		System.out.println("is t1 alive : "+t1.isAlive());//returns boolean whether the thread is alive or not
		
		System.out.println("main end");
	}
}
class MDemo implements Runnable{
	public void run() {
		System.out.println("start of t1");
		System.out.println("is "+Thread.currentThread().getName() + " interrupted : "+Thread.currentThread().isInterrupted());
		for(int i=1;i<=10;i++) {
			System.out.print(" t1-"+i);
		}
		System.out.println("\n"+"is "+Thread.currentThread().getName() + " interrupted : "+Thread.currentThread().isInterrupted());
		System.out.println("end of t1");
	}
}