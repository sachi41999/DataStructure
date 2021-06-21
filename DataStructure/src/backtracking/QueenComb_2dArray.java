package backtracking;

import java.util.Scanner;

public class QueenComb_2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int row=sc.nextInt();
			int col=sc.nextInt();
			int tot_queen=sc.nextInt();
			QueenComb_2d(row,col,tot_queen);
		}
	}

	private static void QueenComb_2d(int row, int col,int tot_queen) {
		// TODO Auto-generated method stub
		int rw=0;
		int cl=0;
		QComb_2d(row,col,"",rw,cl,tot_queen,0);
		
	}

	private static void QComb_2d(int row, int col, String ans, int rw, int cl,int tot_queen,int curr_queen) {
		// TODO Auto-generated method stub
		
		if(curr_queen==tot_queen) {//positive base case
			System.out.println(ans);
			return;
		}
		
		if(cl==col) {//its for row increment
			rw=rw+1;
			cl=0;
		}
		
		if(rw==row) {//negative base case
			return;
		}
		
		//its for placed
		QComb_2d(row,col,ans+"q"+curr_queen+" {"+rw+","+cl+"}"+",",rw,cl+1,tot_queen,curr_queen+1);
		//its for not placed
		QComb_2d(row,col,ans,rw,cl+1,tot_queen,curr_queen);
		
	}

}
