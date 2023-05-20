package ch01_basic_Algorithm;

import java.util.Scanner;

public class EX_Q_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		
		if(a <= b) {
			while(a <= b) {
				sum += a;
				a++;
			}
		} else {
			while(b <= a) {
				sum += b;
				b++;
			}
		}
		
		System.out.println(sum);
	}

}
