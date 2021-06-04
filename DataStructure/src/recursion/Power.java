package recursion;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(4,3));
	}

	private static int pow(int i, int j) {
		// TODO Auto-generated method stub
		if(j==1) {
			return i;
		}
		int p= i * pow(i,j-1);
		return p;
	}

}
