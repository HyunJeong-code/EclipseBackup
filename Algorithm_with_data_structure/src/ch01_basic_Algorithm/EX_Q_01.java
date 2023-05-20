package ch01_basic_Algorithm;

public class EX_Q_01 {

	static int max4(int a, int b, int c, int d) {
		int max = 0;
		
		if(a > max) {
			max = a;
		}
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		if(d > max) {
			max = d;
		}
		
		return max;
	}
	public static void main(String[] args) {
		int n = max4(4,3,2,1);
		
		System.out.println(n);
		
	}

}
