package ch01_basic_Algorithm;

import java.util.Scanner;

public class EX_Q_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int gaSum = (1 + n) * n / 2;
		
		System.out.println(gaSum);
	}

}
