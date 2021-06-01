package recursion;

import java.util.Scanner;

public class Increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			incrs(n);
		}
	}

	private static void incrs(int n) {
		// TODO Auto-generated method stub
		 if(n==0) {
			 return;
		 }
		 
		 incrs(n-1);
		 System.out.print(n+" ");
	}

}
