package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sequential_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int low=sc.nextInt();
			int high=sc.nextInt();
			List<Integer> ll=new ArrayList<>();
			ll=sequ(low,high);
			System.out.println(ll);
		}

	}

	private static List<Integer> sequ(int low, int high) {
		List<Integer> ll=new ArrayList();
		sqdigit(low,high,1,0,ll);
		Collections.sort(ll);
		return ll;
		// TODO Auto-generated method stub
		
	}

	private static List<Integer> sqdigit(int low, int high, int prev, int curr, List<Integer> ll) {
		if(curr>low && curr<high) {
			if(!ll.contains(curr)) {
			ll.add(curr);
			}
			
			
		}
		if(curr>high) {
			return ll;
		}
		
		
		int k=0;
		for(int i=prev;i<=9;i++) {
			
			int rem=curr%10;
			if(curr==0) {
				rem=rem+k;
			}
			if(rem+1==i) {
			sqdigit(low,high,i+1,curr*10+i,ll);
			
			}
			else {
				return ll;
			}
			
			k++;
		}
		return ll;
		// TODO Auto-generated method stub
		
	}

}
