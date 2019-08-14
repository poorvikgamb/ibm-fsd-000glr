package comm.second;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionDemo {
	
	static Scanner sc = new Scanner(System.in);
	
	private String str[  ];
	private Set set;
	
	public CollectionDemo() throws InputMismatchException
	{
		System.out.println("umber of elements are");
		str = new String[sc.nextInt()];
		for(int i=0;i<str.length;i++) 
		{
			System.out.println("name: ");
			str[i]=sc.next().toString().toUpperCase();
		}
		
		set = new HashSet();
		
		for(String s:str) {
			if(!set.add(s))
			{
				System.out.println("duplicate element found not added in set");
			}
		}
	}
	
	public  void diplayCollection() 
	{
		Iterator  i = set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next().toString());
		}
		
	}
}
