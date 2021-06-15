package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generate_B_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			List<Integer> arr=new ArrayList();
			found_gsb(s,arr);
			System.out.println(arr);
			List<String> arr1=new ArrayList();
			int idx=0;
			gbs(idx,arr,arr1,s);
			System.out.println(arr1);
			
		}

	}

	private static void gbs(int idx, List<Integer> arr, List<String> arr1, String s) {
		// TODO Auto-generated method stub
		if(idx==arr.size()) {
			arr1.add(s);
			return;
		}
		
		
			gbs(idx+1,arr,arr1,s.substring(0, arr.get(idx))+"0"+s.substring(arr.get(idx)+1));
		
			gbs(idx+1,arr,arr1,s.substring(0, arr.get(idx))+"1"+s.substring(arr.get(idx)+1));
		
		
	}

	private static List<Integer> found_gsb(String s,List<Integer> arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='1' && s.charAt(i)!='0') {
				arr.add(i);
			}
		}
		
		return arr;
	}

}
