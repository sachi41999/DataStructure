package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int arr[]= {1,2,2};
			List<List<Integer>> lis=new ArrayList();
			lis=sub(arr);
			System.out.println(lis);
			
		}

	}

	private static List<List<Integer>> sub(int[] arr) {
		// TODO Auto-generated method stub
		Set<List<Integer>> lis=new HashSet();
		int ind=0;
		List<Integer> temp=new ArrayList();
		sub(arr,ind,temp,lis);
		
		
		
		return new ArrayList(lis);
	}

	private static void sub(int[] arr,int ind,List<Integer> temp, Set<List<Integer>> lis) {
		// TODO Auto-generated method stub
		if(ind==arr.length) {
			
			lis.add(new ArrayList(temp));
			return;
		}
		
		temp.add(arr[ind]);
		sub(arr,ind+1,temp,lis);//include
		temp.remove(temp.size()-1);
		sub(arr,ind+1,temp,lis);//exclude
	}

}
