package boj;

import java.util.Scanner;

public class BOJ_2740 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] A = new int[N][M];
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < M ; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		sc.nextInt();
		int K = sc.nextInt();
		
		int[][] B = new int[M][K];
		
		for(int i = 0 ; i < M ; i++) {
			for(int j = 0 ; j < K ; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		int[][] C = new int[N][K];
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < K ; j++) {
				
				for(int h = 0 ; h < M ; h++) {
					C[i][j] += A[i][h] * B[h][j];
				}
				sb.append(C[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
