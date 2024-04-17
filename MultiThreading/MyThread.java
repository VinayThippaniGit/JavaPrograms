package MultiThreading;

	class MyThread extends Thread{
		public void run() {
			//ThreadPriorityDemo
			for(int i=1;i<10;i++) {
				System.out.print("M");
			}
			/*//Names.java
			 * System.out.println(Thread.currentThread().getName());
			Thread.currentThread().setName("New Updated");
			System.out.println(Thread.currentThread().getName());*/
		}
	}