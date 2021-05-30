package maths;

public class Excel_Sheet_Column_Title_168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=701;
		String ss=excel_sheet(n);
		System.out.println(ss);
	}

	private static String excel_sheet(int n) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder();
		while(n>0) {
			n--;
			char dd=(char)((n%26)+65);
			str.insert(0,dd);
			n=n/26;
		}
		return str.toString();
	}

}
