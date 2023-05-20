package greed;

import java.util.Arrays;
import java.util.Scanner; 

public class LawOfBigNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 입력받을 수의 갯수
		int M = sc.nextInt(); // 전체 더할 횟수
		int K = sc.nextInt(); // 한번에 최대 몇번까지 더할 수 있는지..
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int first = arr[N - 1];
		int second = arr[N - 2];
		int result = 0;
		
		while(true) {
			for(int j = 0; j < K; j++) {
				if(M == 0)
					break;
				result += first;
				M--;
			}
			if(M == 0)
				break;
			result += second;
			M--;
		}
		
		System.out.println(result);
	}

}
