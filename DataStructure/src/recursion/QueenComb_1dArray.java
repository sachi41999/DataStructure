package recursion;

import java.util.Scanner;

public class QueenComb_1dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int box_size=sc.nextInt();
			int tot_queen=sc.nextInt();
			qcomb_1d(box_size,tot_queen);
		}

	}

	private static void qcomb_1d(int box_size, int tot_queen) {
		// TODO Auto-generated method stub
		qcomb(box_size,0,0,tot_queen,"");
		
	}

	private static void qcomb(int box_size,int prev_queen, int curr_queen, int tot_queen, String ans) {
		// TODO Auto-generated method stub
		if(curr_queen==tot_queen) {
			System.out.println(ans);
			return;
		}
		for(int i=prev_queen;i<box_size;i++) {
			qcomb(box_size,i+1,curr_queen+1,tot_queen,ans+"b"+i+"q"+curr_queen);
		}
		
	}

}
