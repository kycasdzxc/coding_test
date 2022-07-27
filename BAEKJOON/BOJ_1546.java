package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		double[] score = new double[num];
		double max = 0;
		
		for(int i = 0 ; i < num ; i++) {
			double x = Double.parseDouble(st.nextToken());
			score[i] = x;
			if(x > max) {
				max = x;
			}
		}
		
		double result = 0;
		
		for(int i = 0 ; i < num ; i++) {
			result += score[i] / max * 100;
		}
		
		System.out.println(result / num);
	}
}
