package basic_Algorithm;

public class Max4_Method {
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(max < b) max = b;
		if(max < c) max = c;
		if(max < d) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max4(1, 10, 9, 8)" + " : " + max4(1, 10, 9, 8));
	}

}
