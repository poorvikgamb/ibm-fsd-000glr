package Thread_demo;

public class PushThread implements Runnable {
	
	private MyStack stack;

	public PushThread(MyStack stack) {
		super();
		this.stack = stack;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<26;i++)
		{
			try {
				 stack.push((char)(i+65));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
