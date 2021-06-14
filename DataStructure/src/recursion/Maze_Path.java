package recursion;

import java.util.Scanner;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int row=3;
			int col=3;
			int right=0;
			int down=0;
			
			path(row,col,right,down,"");
		}
	}

	private static void path(int row, int col, int right, int down, String string) {
		// TODO Auto-generated method stub
		if(right==col || down==row) {
			return;
		}
		if(right==col-1 && down==row-1) {
			System.out.println(string);
			return;
		}
		
		path(row,col,right+1,down,string+"R");
		path(row,col,right,down+1,string+"D");
		
	}

}
