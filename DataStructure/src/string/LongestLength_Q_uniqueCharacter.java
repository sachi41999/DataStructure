package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestLength_Q_uniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String ss = sc.next();
		//	sc.nextLine();
			int k = sc.nextInt();
			int arr[] = new int[26];

			int s = 0;
			int f = 0;

			int maxSize = 0;
			if (k > ss.length() || ss==null) {
				maxSize = -1;
			} else {
				while (f < ss.length()) {
					arr[ss.charAt(f) - 'a']++;
					int arrsize = checksize(arr);
					System.out.println(arrsize);

					while (arrsize > k) {
						arr[ss.charAt(s) - 'a']--;
						s++;
						arrsize = checksize(arr);

					}
					maxSize = Math.max(maxSize, f - s + 1);
					f++;
				}

			}
			System.out.println(maxSize);
		}

	}

	public static int checksize(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				count++;
			}
		}
		return count;

	}

}
