package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Str_recurr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		List<String> ll=new ArrayList();
	
		recur_str(s,ll,"");
		System.out.println(ll);

		
	}

	private static void recur_str(String s, List<String> ll ,String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			ll.add(ans);
			return;
		}
		
		int n=Integer.parseInt(s.substring(0, 1));
		if(n>0) {
		char c=(char) (96+n);
		recur_str(s.substring(1),ll,ans+c);
		}
		if(s.length()>1) {
			int n1=Integer.parseInt(s.substring(0, 2));
			if(n1>0 && n1<=26) {
			char c1=(char) (96+n1);
			recur_str(s.substring(2),ll,ans+c1);}
		}
		
		
		
	}

}
