package comm.first;


public class MyStack {
		
	public int mystack_push(char a[  ],char x,int length1) {
		length1 = a.length;
		a[length1]=x; 
		length1++;
		return 1;
		}
		
	
	public char mystack_pop(char a[  ],int length1) {
		char x;
			x=a[length1];
			length1--;
			return x;
		}
	}


