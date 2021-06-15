package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maze_runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t-->0) {
			 int arr[][]= {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,1,1,0}};
			 List<String> lis=new ArrayList();
			 lis=run_maze(arr);
			 System.out.println(lis);
		 }

	}

	private static List<String> run_maze(int[][] arr) {
		// TODO Auto-generated method stub
		List<String> lis=new ArrayList();
		int row=0;
		int col=0;
		boolean visited[][]=new boolean[arr.length][arr[0].length];
		temp_runMaze(arr,visited,lis,row,col,"");
		return lis;
	}

	private static void temp_runMaze(int[][] arr,boolean visited[][], List<String> lis, int row, int col, String ans) {
		// TODO Auto-generated method stub
		if(row==arr.length-1 && col==arr[0].length-1) {
			lis.add(ans);
			return;
		}
		
		if(row<0 || col<0 || row>arr.length-1 || col>arr[0].length-1|| visited[row][col]==true ||arr[row][col]==1 ) {
			return;
		}
		
		visited[row][col]=true;
		temp_runMaze(arr,visited,lis,row-1,col,ans+"T");
		temp_runMaze(arr,visited,lis,row+1,col,ans+"D");
		temp_runMaze(arr,visited,lis,row,col-1,ans+"L");
		temp_runMaze(arr,visited,lis,row,col+1,ans+"R");
		visited[row][col]=false;
		
	}

}
