package Thread_demo;

public class ThreadDemo implements Runnable{

	
	
	/* public static void main(String[] args) {
		 ThreadDemo thread1 = new ThreadDemo();
		 ThreadDemo2 thread2 = new ThreadDemo2();
			Thread t1 = new Thread(thread1);
			Thread t2 = new Thread(thread2);
			t1.start();		
			t2.start();
			System.out.println(t1.isAlive());
			
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}*/

	
	@Override
	public void run() {
		
		for(int i=0;i<200;i++)
		{
			if(i == 10)
			{
				try {
					Thread.yield();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("i:"+i);
		}
	}

}
