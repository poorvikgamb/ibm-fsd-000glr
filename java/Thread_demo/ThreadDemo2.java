package Thread_demo;

public class ThreadDemo2 implements Runnable  {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int j=0;j<50;j++)
		{
			System.out.println("j=>"+j);
		}
		
	}
}
