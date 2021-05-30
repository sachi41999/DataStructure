package maths;

import java.math.BigInteger;

public class Add_Two_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a="10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
//		String b="110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
//		
		String a="11";
		String b="11";
		
		  BigInteger aa = new BigInteger(a,2);
		  //converting to biginteger
		  System.out.println("aa= "+aa);
	        BigInteger bb = new BigInteger(b,2);
	        System.out.println("bb= "+bb);
	        BigInteger ans =aa.add(bb);
	        System.out.println(ans);
	      String res =ans.toString(2);
	      System.out.println(res);
		
		
		long j=0;
		long sum=0;
		for(long i=a.length()-1;i>=0;i--) {
			long mul=Long.valueOf(String.valueOf(a.charAt((int)i)))*(long)Math.pow(2,j);
		//	System.out.println(Integer.parseInt(String.valueOf(a.charAt(i))));
			sum=sum+mul;
			j++;
		}
		
		long sum1=0;
		j=0;
		for(long i=b.length()-1;i>=0;i--) {
			long mul=Long.valueOf(String.valueOf(b.charAt((int)i)))*(long)Math.pow(2,j);
			sum1=sum1+mul;
			j++;
		}
		
		long totsum=sum+sum1;
		System.out.println(totsum);
		
		String c="";
		if(totsum==0) {
			c+="0";
		}
		else {
	while(totsum!=0) {
		long d=totsum%2;
		c+=String.valueOf(d);
		totsum=totsum/2;
		
		
	}}
	
	StringBuilder str=new StringBuilder();
	str.append(c);
	str.reverse();
	c=String.valueOf(str);
	
	//System.out.println(c);

	}

}
