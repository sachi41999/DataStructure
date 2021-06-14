package recursion;

import java.util.Scanner;

public class LexiGraphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			System.out.println(101);
			print_lexi(n,0);
		}

	}

	private static void print_lexi(int n, int curr) {
		// TODO Auto-generated method stub
		
		if(curr>n) {
			return;
		}
		
		int f1=curr%10;
		int f2=curr%100;
		
		if(Math.abs(f1-f2)==1) {
			System.out.println(curr);
		}
		
		
		int t=0;
		if(curr==0) {
			t=1;
		}
		for(int i=t;i<=9;i++) {
		
			print_lexi(n,curr*10+i-1);
			print_lexi(n,curr*10+i+1);
		}
		
	}

}
