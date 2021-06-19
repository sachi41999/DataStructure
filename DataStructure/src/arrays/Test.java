package arrays;

import java.util.Scanner;

public class Test {

	 public static void main (String args[]) {
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t-->0){
	            String s=sc.next();
	            System.out.println(sum_ofNumber(s));
	        }
	    }
	    private static long sum_ofNumber(String s){
	       long count=0;
	       s=s+" ";
	       String s1="";
	       for(int i=0;i<s.length();i++){
	            char ch = s.charAt(i);
	           if(Character.isDigit(ch)){
	               
	               s1+=s.charAt(i);
	           }
	           else if(s1.length()>0){
	               count+=Integer.parseInt(s1);
	               s1="";
	           }
	       }
	        return (count);
	    }
}
