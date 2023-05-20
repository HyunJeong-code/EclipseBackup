package Dynamic_Programming;
// 백준 1463번
import java.util.*;

public class Make_a_one {
	static int[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		dp = new int[N+1];
		dp[0] = dp[1] = 0;
		
		for(int i = 2; i < N + 1; i++) {
			dp[i] = dp[i-1] + 1; // 1 빼주고 횟수 1회 더하는 것
			
			if(i % 3 == 0) { // 조건문의 i를 N이라 써도 답은 나오는데, 백준에서 틀렸다고 나옴 왜일까?
				dp[i] = Math.min(dp[i], dp[i/3] + 1); // -1 연산 수행과 3 나누기를 비교
			}
			if(i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2] + 1);
			}
		}
		
		System.out.println(dp[N]);

	}
}
