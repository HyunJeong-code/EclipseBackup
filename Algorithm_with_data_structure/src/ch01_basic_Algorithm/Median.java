package ch01_basic_Algorithm;

public class Median {
	static int med3(int a, int b, int c) {
		if(a >= b) { //b�� ���� a�� c �� �� �ϳ� ������ ���� �� ���յ�
			if(b >= c)
				return b; // a >= b >= c
			else if(a <= c)
				return a; // c >= a >= b
			else // a > c
				return c; // a >= c >= b
		} else if(a > c) // c < a <= b -> �⺻���� a <= b
			return a;
		else if(b > c) // b >= c >= a -> �� ���ǵ鿡�Լ� b�� c, a���� ���� ����� ���� �� ���� �Ϸ�
			return c;
		else  // c >= b > a -> a <= b�̸鼭 �� ���ǵ��� �ݴ� a < c, b < c�� ���� c�� ���� ũ�Ƿ� c�� ����
			return b;	
	}
	
	public static void main(String[] args) {
		int n = med3(1, 2, 3);
		
		System.out.println(n);
	}
}
