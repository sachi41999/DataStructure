package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {

//	 public static void main(String args[]) {
//	        // Your Code Here
//	        Scanner sc=new Scanner(System.in);
//	        int n=sc.nextInt();
//	        String src="T1";
//	        String dest="T2";
//	        String help="T3";
//	        List<String> ll=new ArrayList<String>();
//	        ll=toh(n,src,dest,help,ll);
//	        System.out.println(ll);
//	    }
//	    public static List<String> toh(int n,String src,String dest,String help,List<String> ll ){
//	        if(n==0){
//	            return ll;
//	        }
//
//	        toh(n-1,src,help,dest,ll);
//	        String s="Move "+n+"th disc from "+src+" to "+dest;
//	        ll.add(s);
//	        toh(n-1,help,dest,src,ll);
//	        
//	        return ll;
//	    }
	public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int k=sc.nextInt();
         
          int count=0;
            if(k>s.length()){
                System.out.println("-1");
            }
            else{
                StringBuilder ss=new StringBuilder();
                int i=1;
                for(;i<k;i++){
                  if(s.charAt(i)!=s.charAt(i-1)){
                      ss.insert(0,s.charAt(i-1));
                  }
                }

                if(!ss.toString().contains(String.valueOf(s.charAt(i-1)))){
                   ss.insert(0,s.charAt(i-1));
                }

                System.out.println(ss.length()+" "+ss);
            }
        }
    }

}
