package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int length = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());
		
		Integer[] nums = new Integer[length];
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0 ; i < length ; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
			if(num > nums[i]) {
				bw.append(nums[i] + " ");
			}
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}
