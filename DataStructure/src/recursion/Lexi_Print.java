package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lexi_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			List<Integer> arr=new ArrayList();
			int curr=0;
			System.out.println(print_lexi(n,curr,arr));
		}

	}

	private static List<Integer> print_lexi(int n, int curr, List<Integer> arr) {
		// TODO Auto-generated method stub
		if(curr>n) {
			return arr;
		}
		arr.add(curr);
		int dig=0;
		if(curr==0) {
			dig=1;
		}
		for(int i=dig;i<=9;i++) {
			print_lexi(n,curr*10+i,arr);
		}
		return arr;
	}

}
