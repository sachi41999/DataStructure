package string;

public class All_Ocurrance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this takes O(n) but here we use predefine method 
		String s="recurrcion";
		String s1=s.replaceAll("c", "");
		System.out.println(s1);
       // now we code manually without using replace method
		String ss="linkdin";
		char c='i';
		int i=0;
		while(i<ss.length()) {
			if(ss.charAt(i)==c) {
				ss=ss.substring(0,i)+ss.substring(i+1);
			}
			i++;
		}
		System.out.println(ss);
		
		
		
	}

}
