package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {

	 public static void main(String args[]) {
	        // Your Code Here
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        String src="T1";
	        String dest="T2";
	        String help="T3";
	        List<String> ll=new ArrayList<String>();
	        ll=toh(n,src,dest,help,ll);
	        System.out.println(ll);
	    }
	    public static List<String> toh(int n,String src,String dest,String help,List<String> ll ){
	        if(n==0){
	            return ll;
	        }

	        toh(n-1,src,help,dest,ll);
	        String s="Move "+n+"th disc from "+src+" to "+dest;
	        ll.add(s);
	        toh(n-1,help,dest,src,ll);
	        
	        return ll;
	    }

}
