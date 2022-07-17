package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_23037 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int sum = 0;
		
		while(num > 0) {
			int x = num % 10;
			sum += x * x * x * x * x;
			num /= 10;
		}
		br.close();
		System.out.println(sum);
	}
}
