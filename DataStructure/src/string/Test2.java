package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> names = new ArrayList<>();
		while(n-->0) {
			
			String name=sc.next();
			names.add(name);
		}
		
		Comparator<String> com=new Comparator<String>() {

			public int compare(String name1, String name2) {
		        if (name1.contains(name2) || name2.contains(name1)) {
		            return name2.compareTo(name1);
		        }
		        return name1.compareTo(name2);
		    }
			
		};
		
		Collections.sort(names, com);
		// names.sort(compare(o1,o2));
		
		for(String s:names) {
			System.out.println(s);
		}
		

	}
	

}
