package recursion;

public class Incfreasing_decr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		incr_decr(1,n);
		
	}

	private static void incr_decr(int curr, int n) {
		// TODO Auto-generated method stub
		if(curr==n) {
			return;
		}
		System.out.println("Hi"+curr);
		incr_decr(curr+1,n);
		System.out.println("bye"+curr);
		
	}

}
