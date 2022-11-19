package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_1633 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] score = new int[30][2];
		
		for(int i = 0 ; i < 30 ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			score[i][0] = Integer.parseInt(st.nextToken());
			score[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(score, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] != o2[0] ? o2[0] - o1[0] : o1[0] - o2[0];
			}
		});
		
		int sum = 0;
		int cnt = 0;
		
		for(int i = 0 ; i < 30 ; i++) {
			if(cnt < 15 && score[i][0] > score[i][1]) {
				sum += score[i][0];
				cnt++;
			} else {
				sum += score[i][0];
			}
		}
		System.out.println(sum);
	}
}
