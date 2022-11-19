package boj;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_17828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		int len = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		
		StringBuilder sb = new StringBuilder();
		boolean flag = true;
		
		// 값이 길이보다 적을 때
		if(x < len) {
			flag = false;
		}
		// 값을 26으로 나눴을 때 길이보다 클 때
		if((x/26) > len) {
			flag = false;
		}
		// 값을 26으로 나눴을 때 길이는 같으나, 'Z'로 다 넣어도 부족할 때
		if(x / 26 == len && x % 26 != 0) {
			flag = false;
		}
		
		if(flag) {
			char[] chars = new char[len];
			x -= len;
			
			for(int i = len - 1 ; i >= 0 ; i--) {
				// 배열을 'A'로 초기화
				chars[i] = 'A';
				
				// 값이 25 이상일 경우, 'Z'로 초기화
				if(x >= 25) {
					x -= 25;
					chars[i] += 25;
				}
				// 값이 남은 경우, 배열에 값 더해주기
				else if(x > 0 && x < 25) {
					chars[i] += x;
					x = 0;
				}
				sb.append(chars[i]);
			}
			// 배열 뒤집기
			sb.reverse();
			System.out.println(sb);
		}
		// 출력을 할 수 없는 경우
		else {
			System.out.println("!");
		}
		sc.close();
	}
}
