package recursion;

import java.util.Scanner;

public class Tower_Of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		toi(n,"src","dest","aux");

	}

	private static void toi(int n, String src, String dest, String aux) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		
		toi(n-1,src,aux,dest);
		System.out.println("move "+n+" from "+src+" to "+dest);
		toi(n-1,aux,dest,src);
		
		
	}

}
