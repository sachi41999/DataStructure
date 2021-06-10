package recursion;

public class Coding_blocks_rec {
	static int k;
	static int arr1[]=new int[k];
	static int j=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,45,12,97,12,12};
		int ele=12;
		k=same_ele(arr,ele,0,arr.length); 
		System.out.println(k+" "+arr1.length);
//		occur(arr,ele,0,arr.length);
//		System.out.println(arr1.toString());
	}
	static int len=0;
	private static int same_ele(int[] arr,int ele, int i, int length) {
		
		
		
		if(i==length) {
			return 0;
		}
		
		if(arr[i]==ele) {
			len++;
		}
		
		
		same_ele(arr,ele,i+1,length);
		return len;
		// TODO Auto-generated method stub
		
		
	}
	
	
	
	private static void occur(int[] arr,int ele, int i, int length) {
		// TODO Auto-generated method stub
		if(i==length) {
			return;
		}
		
		if(arr[i]==ele) {
			arr1[j]=i;
			j++;
		}
		
		occur(arr,ele,i+1,length);
		
		 
		
		
	}

}
