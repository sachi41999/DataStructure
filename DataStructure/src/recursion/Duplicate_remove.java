package recursion;

import java.util.Scanner;

public class Duplicate_remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			System.out.println(remove_duplicate(s));
		}
	}

	private static String remove_duplicate(String s) {
		// TODO Auto-generated method stub
		if(s.length()<=1) {
			return s;
		}
		if(s.charAt(0)==s.charAt(1)) {
			return remove_duplicate(s.substring(1));
		} 
		else {
			return s.charAt(0)+remove_duplicate(s.substring(1));
		}
		
	}

}
