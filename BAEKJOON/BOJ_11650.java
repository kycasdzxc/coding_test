package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11650 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		int[][] points = new int[num][2];
		
		for(int i = 0 ; i < num ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			points[i][0] = Integer.parseInt(st.nextToken());
			points[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(points, (o1, o2) -> {
			if(o1[0] == o2[0]) {
				return Integer.compare(o1[1], o2[1]);
			} else {
				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		for(int i = 0 ; i < num ; i++) {
			System.out.println(points[i][0] + " " + points[i][1]);
		}
	}
}
