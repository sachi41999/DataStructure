package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Intersection_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr1[]=new int[n];
			for(int i=0;i<n;i++) {
				arr1[i]=sc.nextInt();
			}
			
			int arr2[]=new int[n];
			for(int i=0;i<n;i++) {
				arr2[i]=sc.nextInt();
			}
			List<Integer> lis=new ArrayList();
			
			lis=inter_array(arr1,arr2);
			System.out.println(lis);
		}

	}
   static List<Integer> li=new ArrayList();
	private static List<Integer> inter_array(int[] arr1,int[] arr2) {
		
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int n=arr1.length;
		
		int i=0;
		int j=0;
		while(i<n && j<n) {
			if(arr1[i]==arr2[j]) {
				li.add(arr1[i]);
				i++;
				j++;
			}
			
			else if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr1[i]>arr2[j]) {
				j++;
			}
		}
		
		return li;
		// TODO Auto-generated method stub
		
		
	}

}
