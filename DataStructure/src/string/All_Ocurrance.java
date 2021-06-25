package string;

import java.util.Scanner;

public class All_Ocurrance {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		String input2=sc.next();
		All_Ocurrance aa=new All_Ocurrance();
		String ss=aa.removingOccurrences(input1,input2);
		System.out.println(ss);
		
//		String s="recurrcion";
//		String s1=s.replaceAll("c", "");
//		System.out.println(s1);
//      
//		String ss="linkdin";
//		char c='i';
//		int i=0;
//		while(i<ss.length()) {
//			if(ss.charAt(i)==c) {
//				ss=ss.substring(0,i)+ss.substring(i+1);
//			}
//			i++;
//		}
//		return ss;
		
		
		
	}
	
	public String removingOccurrences(String input1,String input2) {
		

      
		String ss=input1;
		char c[]=input2.toCharArray();
		char c1=c[0];
		int i=0;
		while(i<ss.length()) {
			if(ss.charAt(i)==c1) {
				ss=ss.substring(0,i)+ss.substring(i+1);
			}
			i++;
		}
		return ss;
		
	}

}
