package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			List<List<String>> ll1=new ArrayList();
			List<String> arr=new ArrayList();
			ll1=str_part(s,"",arr);
			System.out.println(ll1);
		}

	}
	
	static List<List<String>> ll=new ArrayList();
	private static List<List<String>> str_part(String s,String ans,List<String> arr) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			
			  List<String> r = (List<String>) ((ArrayList<String>) arr).clone();
			ll.add(r);
			
			return ll;
		}
		
		
		for(int i=0;i<s.length();i++) {
			
			if(pali_checker(s.substring(0, i+1))) {
				arr.add(s.substring(0, i+1));
			str_part(s.substring(i+1),ans+s.substring(0, i+1),arr);
			arr.clear();
			}
		}
		return ll;
		
	}
	private static boolean pali_checker(String s) {
		
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
