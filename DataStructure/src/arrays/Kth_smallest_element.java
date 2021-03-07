package arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Kth_smallest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,3,89,2,76,98,55,10};
		int n=arr.length;
		int k=3;//this is the integer value which find Kth smallest element from an array;
		
		
		/*
		 * this approach is simple that implemment in sorted array takes time complexity :-O(nlogn)
		 * 
		Arrays.sort(arr);
		
		System.out.println(arr[k-1]);
		*/
		
		//and this is the second approach which implemment in unsorted array optimize time complexity to O(n);
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		for(int i=0;i<n;i++) {
			pq.add(arr[i]);
		}
		
		for(int i=0;i<k-1;i++) {
			pq.poll();
		}
		System.out.print(pq.poll());
		
		
		
	}

}
