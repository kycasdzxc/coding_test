package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2033 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int x = 1;
		int result = num;
		
		while(num > 0) {
			result = (int)((result / (double)x) + 0.5) * x;
			x *= 10;
			num /= 10;
		}
		
		System.out.println(result);
	}
}
