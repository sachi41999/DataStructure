package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Incrs_decrs_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			String ss=incurr(s);
			System.out.println(ss);
		}
	} 

	private static String incurr(String s) {
		// TODO Auto-generated method stub
		String ss="";
		SortedMap<Character,Integer> mp=new TreeMap();
		for(int i=0;i<s.length();i++) {
			mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
		}
		ArrayList<Character> key=new ArrayList(mp.keySet());
		while(!mp.isEmpty()) {
			for(int i=0;i<key.size();i++) {
				if(mp.containsKey(key.get(i)) && mp.get(key.get(i))>0) {
					ss+=String.valueOf(key.get(i));
					mp.put(key.get(i),mp.get(key.get(i))-1);
				}
				else if(mp.containsKey(key.get(i))) {
					mp.remove(key.get(i));
				}
			}
			for(int i=mp.size()-1;i>=0;i--) {
				if(mp.containsKey(key.get(i))&&mp.get(key.get(i))>0) {
					ss+=String.valueOf(key.get(i));
					mp.put(key.get(i),mp.get(key.get(i))-1);
				}
				else if(mp.containsKey(key.get(i))) {
					mp.remove(key.get(i));
				}
			}
		}
		return ss;
	}

}
