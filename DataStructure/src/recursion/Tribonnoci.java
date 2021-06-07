package recursion;

import java.util.Scanner;

public class Tribonnoci {
	static int n1=0,n2=1,sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			tibo(n);
		}

	}

	private static void  tibo(int n) {
		// TODO Auto-generated method stub
		if(n>=0) {
			System.out.print(n1+" ");
			sum=n1+n2;
			n1=n2;
			n2=sum;
			tibo(n-1);
			
		}
	}

}
