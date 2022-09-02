package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_7568 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		int[] height = new int[num];
		int[] weight = new int[num];
		
		for(int i = 0 ; i < num ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			height[i] = Integer.parseInt(st.nextToken());
			weight[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0 ; i < num ; i++) {
			int rank = 1;
			for(int j = 0 ; j < num ; j++) {
				if(i == j) {
					continue;
				}
				if(height[j] > height[i] && weight[j] > weight[i]) {
					rank++;
				}
			}
			bw.append(rank + " ");
		}
		bw.flush();
	}
}
