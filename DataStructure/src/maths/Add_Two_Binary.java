package maths;

public class Add_Two_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="1010";
		String b="1011";
		int j=0;
		int sum=0;
		for(int i=a.length()-1;i>=0;i--) {
			int mul=Integer.parseInt(String.valueOf(a.charAt(i)))*(int)Math.pow(2,j);
		//	System.out.println(Integer.parseInt(String.valueOf(a.charAt(i))));
			sum=sum+mul;
			j++;
		}
		
		int sum1=0;
		j=0;
		for(int i=b.length()-1;i>=0;i--) {
			int mul=Integer.parseInt(String.valueOf(b.charAt(i)))*(int)Math.pow(2,j);
			sum1=sum1+mul;
			j++;
		}
		
		int totsum=sum+sum1;
		System.out.println(totsum);
		String c="";
	while(totsum!=0) {
		int d=totsum%2;
		c+=String.valueOf(d);
		totsum=totsum/2;
		
		
	}
	
	StringBuilder str=new StringBuilder();
	str.append(c);
	str.reverse();
	c=String.valueOf(str);
	
	System.out.println(c);

	}

}
