package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Unique_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			System.out.println(countNumbersWithUniqueDigits(n));
		}

	}
	 public static int countNumbersWithUniqueDigits(int n) {
		List<List<Integer>> ll=new ArrayList();
		int x=(int) Math.pow(10,n);
		List<Integer> arr=new ArrayList();
		countNumber(x,ll,0,arr);
		System.out.println(ll);
		return ll.size();
	        
	 }
	private static void countNumber(int x, List<List<Integer>> ll,int curr,List<Integer> arr) {
		// TODO Auto-generated method stub
		if(curr>x) {
			return;
		}
		
		if(arr.size()>=1 && curr<x) {
		ll.add(new ArrayList(arr));
		if(arr.get(0)==0) {
			return ;
		}
		}
		for(int i=0;i<=9;i++) {
			
			if(!arr.contains(i)) {
				arr.add(i);
			countNumber(x,ll,curr*10+i,arr);
			arr.remove(arr.size()-1);
			}
		}
		
	}

}
