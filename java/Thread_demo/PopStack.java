package Thread_demo;

public class PopStack implements Runnable {

	private MyStack stack;

	public PopStack(MyStack stack) {
		super();
		this.stack = stack;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<26;i++)
		{
			try {
				System.out.println(stack.pop());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
