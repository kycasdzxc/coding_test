package boj;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1302 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		
		String[] books = new String[num];
		
		for(int i = 0 ; i < num ; i++) {
			books[i] = sc.nextLine();
		}
		
		Arrays.sort(books);
		
		String result = books[0];
		int cnt = 1;
		int max = 0;
		
		if(num > 1) {
			for(int i = 1 ; i < num ; i++) {
				if(books[i].equals(books[i-1])) {
					cnt++;
				} else {
					if(cnt > max) {
						max = cnt;
						result = books[i-1];
					}
					cnt = 1;
				}
			}
		}
		
		System.out.println(result);
		sc.close();
	}
}
