package greed;

import java.util.Scanner;

public class NumberCardGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			int min = 10001;
			for(int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
				min = Math.min(min, arr[i][j]);
			}
			result = Math.max(min, result);
		}
		
		System.out.println(result);
		
	}
}
