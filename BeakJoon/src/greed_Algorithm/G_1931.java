package greed_Algorithm;

import java.util.Scanner;

public class G_1931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[5];
		int str[] = new int[5];
		for(int i  = 0; i < 5; i++) {
			arr[i] = sc.nextLine();
		}
		for(int j = 0; j < 5; j++) {
			str[j] = arr[j].length();
			System.out.println(str[j]);
		}
	}	
}