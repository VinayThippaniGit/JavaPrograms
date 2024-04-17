package MultiThreading;

public class GetStacakTrace {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getStackTrace());//current thread stack frame address
		m1();//calling m1 from main();
		
		System.out.println("=====================");
		//stroing stack traces into array of type StackTraceElement
		StackTraceElement e[]=Thread.currentThread().getStackTrace();
		for(StackTraceElement x:e) {
			System.out.println(x);
		}
	}
	public static void m1() {
		System.out.println("=====================");
		StackTraceElement e[]=Thread.currentThread().getStackTrace();
		for(StackTraceElement x:e) {
			System.out.println(x);//prints the current stackframe name;
		}
		m2();//calling m2 from m1();
	}
	public static void m2() {
		System.out.println("=====================");
		StackTraceElement e[]=Thread.currentThread().getStackTrace();
		for(StackTraceElement x:e) {
			System.out.println(x);
		}
	}
}