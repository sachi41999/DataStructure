package string;

import java.util.Scanner;

public class LongestCommanPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		System.out.println(lcp(arr));
	}

	private static String lcp(String[] arr) {
		// TODO Auto-generated method stub
		String s=arr[0];
		String s2="";
		boolean flag=true;
		for(int i=1;i<arr.length;i++) {
			String s1=arr[i];
			int j=0;
			int k=0;
			while(j<s1.length() && k<s.length()) {
				if(s.charAt(k)==s1.charAt(j)) {
					s2+=s.charAt(k);
				}
				else {
					flag=false;
					break;
				}
				j++;
				k++;
			}
			s=s2;
			s2="";
			
		}
		return s;
	}

}
