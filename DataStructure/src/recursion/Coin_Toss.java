package recursion;

import java.util.Scanner;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			toss_coin(n,"");
		}

	}

	
	private static void toss_coin(int n,String ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(ans);
			return;
		}
		toss_coin(n-1,ans+"H");
		toss_coin(n-1,ans+"T");
		
	}

}
