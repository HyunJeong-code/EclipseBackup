package ch01_basic_Algorithm;

public class EX_Q_02 {
	
	static int min3(int a, int b, int c) {
		int min = a;
		
		if(min > b) min = b;
		if(min > c) min = c;
		
		return min;
	}
	public static void main(String[] args) {
		int n = min3(4, 8, 1);
		
		System.out.println(n);
	}

}
