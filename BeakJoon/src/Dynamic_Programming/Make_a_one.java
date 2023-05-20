package Dynamic_Programming;
// ���� 1463��
import java.util.*;

public class Make_a_one {
	static int[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		dp = new int[N+1];
		dp[0] = dp[1] = 0;
		
		for(int i = 2; i < N + 1; i++) {
			dp[i] = dp[i-1] + 1; // 1 ���ְ� Ƚ�� 1ȸ ���ϴ� ��
			
			if(i % 3 == 0) { // ���ǹ��� i�� N�̶� �ᵵ ���� �����µ�, ���ؿ��� Ʋ�ȴٰ� ���� ���ϱ�?
				dp[i] = Math.min(dp[i], dp[i/3] + 1); // -1 ���� ����� 3 �����⸦ ��
			}
			if(i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2] + 1);
			}
		}
		
		System.out.println(dp[N]);

	}
}
