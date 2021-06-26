package backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Letter_TilePossibilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			System.out.println(numTilePossibilities(s));
			
		}

	}
public static int numTilePossibilities(String tiles) {
	Set<String> ll=new HashSet<>();
	numTile(tiles,tiles,ll,"");
	
	//System.out.println(ll);
	return ll.size()-1;
        
    }
private static void numTile(String til,String tiles, Set<String> ll, String ans) {
	// TODO Auto-generated method stub
	if(ans.length()>til.length()) {
		return;
	}
	
	ll.add(ans);
	
	for(int i=0;i<tiles.length();i++) {
		numTile(til,tiles.substring(0,i)+tiles.substring(i+1),ll,ans+tiles.charAt(i));
	}
	
}

}
