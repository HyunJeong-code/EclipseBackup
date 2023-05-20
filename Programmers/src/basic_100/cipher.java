package basic_100;

import java.util.Scanner;

public class cipher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cipher = sc.nextLine();
		int code = sc.nextInt();
		
		String answer = "";
        int n = 0;
        int i = 0;
        while(n < cipher.length()) {
            i++;
            n = code * i;
            answer += cipher.charAt(n-1);
        }
        System.out.println(answer);
	}

}
