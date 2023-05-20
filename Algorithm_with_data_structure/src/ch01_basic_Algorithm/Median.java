package ch01_basic_Algorithm;

public class Median {
	static int med3(int a, int b, int c) {
		if(a >= b) { //b가 보통 a나 c 둘 중 하나 값보다 작을 때 조합들
			if(b >= c)
				return b; // a >= b >= c
			else if(a <= c)
				return a; // c >= a >= b
			else // a > c
				return c; // a >= c >= b
		} else if(a > c) // c < a <= b -> 기본조건 a <= b
			return a;
		else if(b > c) // b >= c >= a -> 앞 조건들에게서 b가 c, a보다 작을 경우의 수는 다 조사 완료
			return c;
		else  // c >= b > a -> a <= b이면서 앞 조건들의 반대 a < c, b < c일 경우는 c가 가장 크므로 c는 제외
			return b;	
	}
	
	public static void main(String[] args) {
		int n = med3(1, 2, 3);
		
		System.out.println(n);
	}
}
