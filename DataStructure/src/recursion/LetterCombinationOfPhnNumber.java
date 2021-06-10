package recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LetterCombinationOfPhnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			List<String> arr=new ArrayList<>();
			
			arr=letcomb(s,"");
			System.out.print(arr);
		}
		
		

	}
	
	static String aar[]= {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	static List<String> arr=new ArrayList();
	private static List<String> letcomb(String s, String string) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			arr.add(string);
			return arr;
		}
		int n=Integer.parseInt(String.valueOf(s.charAt(0)));
		
		String ss=aar[n];
		for(int i=0;i<ss.length();i++) {
			char c=ss.charAt(i);
			letcomb(s.substring(1),string+c);
		}
		
		return arr;
	}

}
