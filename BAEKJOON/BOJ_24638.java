package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_24638 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String[][] years = new String[2][2];
		
		years[0][0] = st.nextToken();
		years[0][1] = st.nextToken();
		
		st = new StringTokenizer(br.readLine(), " ");
		
		years[1][0] = st.nextToken();
		years[1][1] = st.nextToken();
		
		int first  = 0;
		int second = 0;
		
		first  = years[0][1].equals("BC") ? -Integer.parseInt(years[0][0]) + 1 : Integer.parseInt(years[0][1]);
		second = years[1][1].equals("BC") ? -Integer.parseInt(years[1][0]) + 1 : Integer.parseInt(years[1][1]);

		System.out.println(Math.abs(first - second));
	}
}
