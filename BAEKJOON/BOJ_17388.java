package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17388 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int Soongsil = Integer.parseInt(st.nextToken());
		int Korea = Integer.parseInt(st.nextToken());
		int Hanyang = Integer.parseInt(st.nextToken());
		
		if(Soongsil + Korea + Hanyang >= 100) {
			System.out.println("OK");
		} else {
			int min = -1;
			min = Math.min(Soongsil, Korea);
			min = Math.min(min, Hanyang);
			
			if(min == Soongsil) {
				System.out.println("Soongsil");
			}
			else if(min == Korea) {
				System.out.println("Korea");
			}
			else {
				System.out.println("Hanyang");
			}
		}
	}
}
