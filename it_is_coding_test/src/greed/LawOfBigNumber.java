package greed;

import java.util.Arrays;
import java.util.Scanner; 

public class LawOfBigNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // �Է¹��� ���� ����
		int M = sc.nextInt(); // ��ü ���� Ƚ��
		int K = sc.nextInt(); // �ѹ��� �ִ� ������� ���� �� �ִ���..
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
