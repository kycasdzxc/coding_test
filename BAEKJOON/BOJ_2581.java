package springTest.com.crizen.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2581 {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int min = -1;
		
		for( ; a <= b ; a++) {
			boolean flag = true;

			if(a == 1) {
				continue;
			}
			for(int j = 2 ; j < a ; j++) {
				if(a % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				sum += a;
				if(min == -1) min = a;
			}
		}
		br.close();
		if(sum > 0) System.out.println(sum);
		System.out.println(min);
	}
}
