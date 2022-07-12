package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		int x = input.indexOf(" ");
		int y = input.lastIndexOf(" ");

		int a = Integer.parseInt(input.substring(0, x)); // 올라가기
		int b = Integer.parseInt(input.substring(x + 1, y)); // 미끄러지기
		int v = Integer.parseInt(input.substring(y + 1)); // 막대길이
		
		int day = (v - b) / (a - b); // (length - down) / (up - down)
		
		if((v - b) % (a- b) != 0) { // 나머지가 있을 경우
			day++;
		}
		
//		int go = 0;  // 가는 거리
//		int day = 0; // 걸리는 시간
		
//		while(v > go) {
//			go += a;
//			if(v <= go) {
//				break;
//			}
//			go -= b;
//			day++;
//		}
		br.close();
		System.out.println(day);
	}
}
