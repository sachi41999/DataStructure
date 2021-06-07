package recursion;

public class Max_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,10,30,45};
		int n=arr.length;
		int i=0;
		max(arr,n-1);
	}
	static int max=Integer.MIN_VALUE;
	private static void max(int[] arr,  int n) {
		// TODO Auto-generated method stub
		
		if(n==-1) {
			return ;
		}
		System.out.print(arr[n]+" ");
		
		max(arr,n-1);
		
		
	}

}
