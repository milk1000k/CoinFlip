package test;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Please update n with the properly input
		int n = 0;
		System.out.println(randomNumber(n));
		
	}
	public static boolean flip(){
		return Math.random() >= 0.5;
	}
	
	//You must implement a randomNumber(n) function that generates a random number greater than or equal to 0, and less than input n.
	public static int randomNumber(int n){
		//n must be greater than 0
		//n must be less than 1,000,000
		if (n>1000000 || n<=0) throw new java.lang.Error("Please check the input n");
		String binaryValueN = Integer.toBinaryString(n);
		int lengthN = binaryValueN.length();
		String binaryValueRes="";
		for (int i = 0; i < lengthN; i++) {
			binaryValueRes += flip()?1:0;
		}
		int res = Integer.parseInt(binaryValueRes, 2);
		 // Returns a number between [0, n)
		return res<n?res:randomNumber(n);
	}
}
