package arrays;

import java.util.Scanner;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			boolean flag=false;
			for(int i=arr.length-1;i>0;i--) {
				if(arr[i]>arr[i-1]) {
					int temp=arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;
					flag=true;
					break;
				}
			}
			
			if(flag) {
			
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			}
			else {
				for(int i=arr.length-1;i>=0;i--) {
					System.out.print(arr[i]+" ");
				}
			}
		}

	}

}
