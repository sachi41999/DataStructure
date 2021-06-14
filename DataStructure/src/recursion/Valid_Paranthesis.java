package recursion;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Valid_Paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int open_p=0;
			int close_p=0;
			List<String> arr=new ArrayList();
			System.out.println(valid_p(n,open_p,close_p,"",arr));
		}
	}

	private static List<String> valid_p(int n, int open_p, int close_p, String ans, List<String> arr) {
		// TODO Auto-generated method stub
		if(open_p==n && close_p==n) {
			arr.add(ans);
			return arr;
		}
		
		if(open_p>n || close_p>n || close_p>open_p) {
			return arr;
		}
		
		valid_p(n,open_p+1,close_p,ans+"(",arr);
		valid_p(n,open_p,close_p+1,ans+")",arr);
		
		return arr;
	}

}
