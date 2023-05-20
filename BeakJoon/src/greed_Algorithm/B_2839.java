package greed_Algorithm;

import java.util.Scanner;

public class B_2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int cnt = 0;
        
//        if(N >= 5) {
//            cnt += (N / 5);
//            N %= 5;
//        } else if( N >= 3 && N % 3 == 0) {
//            cnt += (N / 3);
//        } else {
//            cnt = -1;
//        }
        
        while(N > 0) {
            if(N >= 5 && N % 3 != 0) {
                cnt++;
                N -= 5;
            } else if(N >= 3) {
                cnt++;
                N -= 3;
            } else {
            	break;
            }
        }
        
        if(N == 1 || N == 2) {
        	cnt = -1;
        }
        
        System.out.println(cnt);
	}
}
