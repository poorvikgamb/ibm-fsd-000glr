package comm.first;

import java.util.Arrays;

public class Tester {

	public static void main(String [  ] args) {
	
		/*int arr[  ] = {
				100,1,-20,30,0
				};
	    Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--) {
		System.out.println(arr[i] );
		}
		int pos = Arrays.binarySearch(arr, 30);
		System.out.println(pos);*/
		
		/*int length1=10; 
		
		char a[  ] = {
				'a','b','c','d'
		};
		
		MyStack s1 = new MyStack();
		s1.mystack_push(a,'e', length1);
		for(int i=0;i<length1;i++) {
			System.out.println(a[i]);
		}*/
		
		InnerClass ic = new InnerClass();
		InnerClass.In innerObj = ic.new In();
		
		
		ic.InnerFunction();
		
		innerObj.InFunctionn();
		}
		
}
