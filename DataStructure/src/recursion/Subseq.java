package recursion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			List<String> aa=new ArrayList();
			String c=sc.next();
			aa=seq(c,"");
			System.out.println(aa);
		}
	}
	static List<String> ss=new ArrayList();
	private static List<String> seq(String c, String string) {
		// TODO Auto-generated method stub
		
		
		if(c.length()==0) {
			ss.add(string);
			return ss;
		}
		char ch=c.charAt(0);
		c=c.substring(1);
		seq(c,string);
		seq(c,string+ch);
		
		Collections.sort(ss);
		
		return ss;
	}

}
