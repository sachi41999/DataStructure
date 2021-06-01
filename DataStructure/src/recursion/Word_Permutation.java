package recursion;

import java.util.Scanner;

public class Word_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
		
			word_permut("abc","");
		
		}

	}

	private static void word_permut(String string, String string2) {
		// TODO Auto-generated method stub
		if(string.length()==0) {
			System.out.println(string2);
			return;
		}
		
		for(int i=0;i<string.length();i++) {
			String s=string.substring(0,i)+string.substring(i+1);
			word_permut(s,string2+string.charAt(i));
		}
		
	}

}
