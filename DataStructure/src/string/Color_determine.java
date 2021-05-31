package string;

import java.util.Scanner;

public class Color_determine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			boolean flag = detrmine_color(s);
			System.out.println(flag);
		}
	}

	private static boolean detrmine_color(String s) {
		// TODO Auto-generated method stub
		boolean flag = true;

		int a = s.charAt(0);
		int b = Integer.parseInt(String.valueOf(s.charAt(1)));
		if(a%2!=0) {
			if(b%2!=0) {
				flag=false;
			}
			else {
				flag=true;
			}
		}
		else {
			if(b%2!=0) {
				flag=true;
			}
			else {
				flag=false;
			}
		}

		return flag;
	}

}
