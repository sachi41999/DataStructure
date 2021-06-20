package recursion;

import java.util.Scanner;

public class QueenPermut_1dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int box_size=sc.nextInt();
			int tot_queen=sc.nextInt();
			qpermut(box_size,tot_queen);
			
		}

	}

	private static void qpermut(int box_size, int tot_queen) {
		// TODO Auto-generated method stub
		boolean arr[]=new boolean[box_size];
		qpermut(arr,0,tot_queen,"");
		
	}

	private static void qpermut(boolean[] arr,int curr_queen, int tot_queen, String ans) {
		// TODO Auto-generated method stub
		if(curr_queen==tot_queen) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==false) {
			arr[i]=true;
			qpermut(arr,curr_queen+1,tot_queen,ans+"b"+i+"q"+curr_queen+",");
			arr[i]=false;
			}
		}
		
	}

}
