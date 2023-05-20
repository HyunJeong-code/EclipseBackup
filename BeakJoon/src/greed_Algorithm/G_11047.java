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
		
		//같은 동전으로 여러번 나눠야 할 경우? 어떻게 구현할 것인가
		// -> 중첩 반복문을 생각했으나, 여러번 겹칠 때 중첩 횟수가 많으므로 검색 Go.. >> 결과 : 간단한 나눗셈, 나머지 연산으로 해결 가능
		
		for(int j = N - 1; j >= 0; j--) {
			if(A[j] <= K) {
				cnt += K / A[j];
				K = K % A[j];
			}
		}
		
		System.out.println(cnt);
	}
}
