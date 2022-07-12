package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= 10_000_000 ; i++) {
			if(i >= x) {
				if(i % 2 == 0) {
					System.out.println(x + "/" + (i - x + 1));
				} else {
					System.out.println(i - x + 1 + "/" + x);
			}
				break;
			}
			x -= i;
		}
	}
}
