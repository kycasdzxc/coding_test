package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_18111 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N][M];
		
		int total = B;
		
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                total += map[i][j];
            }
        }
        
        // 한칸에 가질 수 있는 최대높이
        int height = (total) / (N * M);
        //System.out.println(height);
        if (height > 256) height = 256;
        int min_time = Integer.MAX_VALUE;
        // System.out.println(time); 2147483647
        int final_Height = height;
 
        while (height >= 0) {
            int currentTime = 0;
            // 현재 높이에서의 시간 구하기
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] <= height)
                        currentTime += (height - map[i][j]);
                    else
                        currentTime += (2 * (map[i][j] - height));
                }
            }
            if (currentTime < min_time) {
                min_time = currentTime;
                final_Height = height;
            }
            height--;
 
        }
        System.out.println(min_time + " " + final_Height);
	}
}
