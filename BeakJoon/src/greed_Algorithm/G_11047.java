package greed_Algorithm;

import java.util.*;

public class G_11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		int cnt = 0;
		
		//���� �������� ������ ������ �� ���? ��� ������ ���ΰ�
		// -> ��ø �ݺ����� ����������, ������ ��ĥ �� ��ø Ƚ���� �����Ƿ� �˻� Go.. >> ��� : ������ ������, ������ �������� �ذ� ����
		
		for(int j = N - 1; j >= 0; j--) {
			if(A[j] <= K) {
				cnt += K / A[j];
				K = K % A[j];
			}
		}
		
		System.out.println(cnt);
	}
}
