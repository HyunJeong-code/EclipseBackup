package ch01_basic_Algorithm;

import java.util.Scanner;

public class EX_Q_06 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println("i = "+ i);
		System.out.println("n = "+ n);

	}

}
