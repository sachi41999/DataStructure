package recursion;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int num=sc.nextInt();
			System.out.println(fact(num));
		}

	}

	private static int fact(int num) {
		// TODO Auto-generated method stub
		if(num==1) {
			return 1;
		}
		int n=num*fact(num-1);
		return n;
	}

}
