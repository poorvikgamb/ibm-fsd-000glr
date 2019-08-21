package Thread_demo;

public class StackMain  {
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		PushThread push = new PushThread(stack);
		
		PopStack pop = new PopStack(stack);
		
		Thread t1 = new Thread(push);
		
		Thread t2 = new Thread(pop);
		
			t1.start();
			t2.start();	

	}



}
