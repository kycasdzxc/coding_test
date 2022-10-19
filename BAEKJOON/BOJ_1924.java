package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1924 {
	public static void main(String[] args) throws IOException {
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		
		for(int i = 0 ; i < month-1 ; i++) {
			day += months[i];
		}
		
		System.out.println(days[day % 7]);
	}
}
