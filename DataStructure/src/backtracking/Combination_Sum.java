package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			List<List<Integer>> ll=new ArrayList();
	        List<Integer> ans=new ArrayList<>();
	        combination(n,1,k,ll,ans);
	        for(List<Integer> a:ll) {
	        	System.out.println(a);
	        }
		}

	}

	  public static List<List<Integer>> combination(int n,int prev,int k,List<List<Integer>> ll,List<Integer> ans){
	        
	        if(k==0){
	            List<Integer> r = (List<Integer>) ((ArrayList<Integer>) ans).clone();
				ll.add(r);
	          //  ans.remove(ans.size()-1);
	            return ll;
	        }
	        
	        for(int i=prev;i<=n;i++){
	            ans.add(i);
	            combination(n,i+1,k-1,ll,ans);
	             ans.remove(ans.size()-1);
	        }
	        return ll;
	    }

}
