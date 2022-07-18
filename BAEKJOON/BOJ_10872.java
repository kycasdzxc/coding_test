package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10872 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int num = Integer.parseInt(br.readLine());
		int sum = 1;
		
		while(num != 0) {
			sum *= num;
			num--;
		}
		br.close();
		System.out.println(sum);
	}
}
