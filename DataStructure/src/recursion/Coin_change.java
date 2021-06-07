package recursion;

import java.util.Scanner;

public class Coin_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int v=sc.nextInt();
			int arr[]=new int[v];
			for(int i=0;i<v;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(change_coin(n,arr));
			
		}
	}

	private static int change_coin(int n, int[] ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			
			return 1;
		}
		
		int res=0;
		
		if(n<0) {
			return 0;
		}
		for(int i=0;i<ans.length;i++) {
			res+=change_coin(n-ans[i],ans);
		}
		return res;
	}

}
