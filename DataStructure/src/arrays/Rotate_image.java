package arrays;

import java.util.Scanner;

public class Rotate_image {

	 public static void main(String args[]) {
	        // Your Code Here
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int arr[][]=new int[n][n];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                arr[i][j]=sc.nextInt();
	            }
	        }

	        int arr1[][]=new int[n][n];
	        for(int i=0;i<n;i++){
	            int row=n-1;
	            int col=i;
	            for(int j=0;j<n;j++){
	                arr1[row][col]=arr[i][j];
	                row--;
	            }
	        }

	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                System.out.print(arr1[i][j]+" ");
	            }
	            System.out.println();
	        }

	        
	    }

}
