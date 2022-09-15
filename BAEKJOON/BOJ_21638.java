package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_21638 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int t1 = Integer.parseInt(st.nextToken());
		int v1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int t2 = Integer.parseInt(st.nextToken());
		int v2 = Integer.parseInt(st.nextToken());
		
		if(t2 < 0 && v2 >= 10) {
			System.out.println("A storm warning for tomorrow! Be careful and stay home if possible!");
		}
		else if(t2 < t1) {
			System.out.println("MCHS warns! Low temperature is expected tomorrow.");
		}
		else if(v1 < v2) {
			System.out.println("MCHS warns! Strong wind is expected tomorrow.");
		}
		else {
			System.out.println("No message");
		}
	}
}
