package Thread_demo;

public class MyStack  {
	 static final int MAX = 26;
	 public char[ ] info = new char [MAX];
	 int index = -1;
	 
	 synchronized void push(char item) throws InterruptedException
	 {
		 
		 if(index == MAX)
		 {
			 System.out.println("stack overflow");
			 wait();
		 }
		 info[++index] =item; 
		 notify();
	 }
	 
	 synchronized char pop() throws InterruptedException
	 {
		 
		 if(index<0)
		 {
			 System.out.println("stack underflow");
			 wait();
		 }
		 notifyAll();
		 char x=info[index--];
		 return x;
	 }

}
