package basic_100;

import java.util.Scanner;

public class array_updown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num_list[] = new int[N];
        int[] answer = new int[N];
        int index = 0;
        for(int i = 0; i  < N; i++) {
        	num_list[i] = sc.nextInt();
        }
        for(int i = N - 1; i >= 0; i--) {
            answer[index] = num_list[i];
            index++;
        }
        for(int i = 0; i < N; i++) {
        	System.out.println(answer[i]);
        }
	}

}
