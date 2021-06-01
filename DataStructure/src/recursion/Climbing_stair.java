package recursion;

import java.util.Scanner;

public class Climbing_stair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
		
			climbstair(0,n,"");
		
		}

	}

	private static void climbstair(int curr,int n, String ans) {
		// TODO Auto-generated method stub
		
		if(curr==n) {
			System.out.println(ans);
			return ;
		}
		if(curr>n) {
			return; 
		}
		
		climbstair(curr+1,n,ans+"1");
		climbstair(curr+2,n,ans+"2");
		climbstair(curr+3,n,ans+"3");
	
	}

}
