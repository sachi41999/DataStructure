package string;

import java.util.Scanner;

public class String_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		
		sortString(arr);
		for(String a:arr) {
			System.out.println(a);
		}
		

	}

	private static void sortString(String[] arr) {
		// TODO Auto-generated method stub
		boolean flag=false;
		
		for(int i=0;i<arr.length-1;i++) {
			flag=false;
			String s1=arr[i].toLowerCase();
			String s2=arr[i+1].toLowerCase();
			int j=0;
			int k=0;
			while(j<s1.length() && k<s2.length()) {
				if(s1.charAt(j)>s2.charAt(k)) {
					String temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag=false;
					break;
				}
				else if(s1.charAt(j)<s2.charAt(k)) {
					flag=false;
					break;
				}
				else if(s1.charAt(j)==s2.charAt(k)) {
					flag=true;
				}
				j++;
				k++;
			}
			if(flag) {
				if(s2.length()>s1.length()) {
					String temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		
	}

}
