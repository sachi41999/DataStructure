package string;

import java.util.ArrayList;
import java.util.Scanner;

public class WordsContained {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		ArrayList<String> arr=new ArrayList();
		
		
		int j=0;
		for(int i=1;i<s.length();i++) {
			char c=s.charAt(i);
			c=Character.toUpperCase(c);
			if(s.charAt(i)==c) {
				String ss=s.substring(j,i);
				arr.add(ss);
				j=i;
			}
		}
		String ss=s.substring(j);
		arr.add(ss);
		
		for(String a:arr) {
			System.out.println(a);
		}

	}

}
