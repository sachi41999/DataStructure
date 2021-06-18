package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ascii_Sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		List<String> lis=new ArrayList();
		
		subAscii(s,lis,"");
		for(String a:lis){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println(lis.size());
		
		
	}

	private static void subAscii(String s, List<String> lis, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			lis.add(ans);
			return;
		}
		
		
		subAscii(s.substring(1),lis,ans);
		subAscii(s.substring(1),lis,ans+s.substring(0, 1));
		String c=s.substring(0,1);
		char b[]=c.toCharArray();
		int n=b[0];
		subAscii(s.substring(1),lis,ans+n);
		
		
	}

}
