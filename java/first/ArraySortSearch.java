package comm.first;

import java.util.Arrays;

public class ArraySortSearch {
	

	public ArraySortSearch() {
		int arr[  ] = {
				100,1,-20,30,0
				};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i] );
		}
		int pos = Arrays.binarySearch(arr, 30);
		System.out.println(pos);
	}

}
