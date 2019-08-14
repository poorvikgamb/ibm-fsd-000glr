package comm.first;

public class ArrayTrial {
	private char arr[ ] ;
	
	public ArrayTrial() {
		
	}
	
	public void createArray(int length) {
		arr = new char[length];
		for(int  i=0;i<arr.length;i++)
		{
			arr[i] = (char)('A'+i);
		}
	}

	public char[] getArr() {
		return arr;
	}


	
}
