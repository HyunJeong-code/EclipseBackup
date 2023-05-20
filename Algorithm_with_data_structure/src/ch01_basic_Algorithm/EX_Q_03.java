package ch01_basic_Algorithm;

public class EX_Q_03 {

	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(min > b) min = b;
		if(min > c) min = c;
		if(min > d) min = d;
		
		return min;
	}
	
	public static void main(String[] args) {
		int n = min4(5, 9, 0, 1);
		
		System.out.println(n);
	}

}
