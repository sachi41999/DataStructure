package recursion;

import java.util.Scanner;

public class Fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int num=sc.nextInt();
			int n1=0;
			int n2=1;
			int sum=0;
			fibo(num,n1,n2,sum);
		}

	}

	private static void fibo(int num,int n1,int n2,int sum) {
		// TODO Auto-generated method stub
		if(num>0) {
			System.out.print(n1+" ");
			sum=n1+n2;
			n1=n2;
			n2=sum;
			fibo(num-1,n1,n2,sum);
		}
		
		
	}

}
