package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Derypting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			String ss=decrypt(s);
			System.out.println(ss);
		}

	}

	private static String decrypt(String s) {
		Map<String,String> mp=new HashMap();
		mp.put("1","a");
		mp.put("2","b");
		mp.put("3","c");
		mp.put("4","d");
		mp.put("5","e");
		mp.put("6","f");
		mp.put("7","g");
		mp.put("8","h");
		mp.put("9","i");
		mp.put("10#","j");
		mp.put("11#","k");
		mp.put("12#","l");
		mp.put("13#","m");
		mp.put("14#","n");
		mp.put("15#","o");
		mp.put("16#","p");
		mp.put("17#","q");
		mp.put("18#","r");
		mp.put("19#","s");
		mp.put("20#","t");
		mp.put("21#","u");
		mp.put("22#","v");
		mp.put("23#","w");
		mp.put("24#","x");
		mp.put("25#","y");
		mp.put("26#","z");
		String ss="";
		int n=s.length();
		int j=0;
		while(j<n) {
			if(s.charAt(j)=='1' || s.charAt(j)=='2') {
				if(j+1<n && j+2<n && s.charAt(j)=='1' && String.valueOf(s.charAt(j+1)).matches("[0-9]") && s.charAt(j+2)=='#' ) {
					String s1=s.substring(j,j+3);
					ss+=mp.get(s1);
					j=j+3;
				}
				else if(j+1<n && j+2<n && s.charAt(j)=='2' && String.valueOf(s.charAt(j+1)).matches("[0-6]") && s.charAt(j+2)=='#') {
					String s1=s.substring(j,j+3);
					ss+=mp.get(s1);
					j=j+3;
					
				}
				else {
					ss+=mp.get(String.valueOf(s.charAt(j)));
					j++;
				}
			}
			else {
				ss+=mp.get(String.valueOf(s.charAt(j)));
				j++;
			}
		}
		
		return ss;
	}

}
