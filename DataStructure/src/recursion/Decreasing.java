package recursion;

import java.util.Scanner;

public class Decreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			decrs(n);
		}
	}

	private static void decrs(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return ;
		}
		System.out.print(n+" ");
		decrs(n-1);
	}

}
