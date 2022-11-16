package exam;

import java.util.Scanner;

public class Exam_209 {
	public static void main(String[] args) {
		// 9. 격자판 최대합
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[][] board = new int[num][num];
		
		// 격자판 입력
		for(int i = 0 ; i < num ; i++) {
			for(int j = 0 ; j < num ; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		int result = -1;
		
		int x_sum = 0; // 대각선 합
		int y_sum = 0; // 역대각선 합
		
		// 행의 합, 열의 합, 대각선 합 계산
		for(int i = 0 ; i < num ; i++) {
			int r_sum = 0; // 행의 합
			int c_sum = 0; // 열의 합
			
			for(int j = 0 ; j < num ; j++) {
				r_sum += board[i][j];
				c_sum += board[j][i];
				
				// 대각선 합 계산
				if(i == j) {
					x_sum += board[i][j];
				}
				// 역대각선 합 계산
				if(j + i == num - 1) {
					y_sum += board[i][j];
				}
			}
			// 행의 합, 열의 합 비교
			result = Math.max(result, Math.max(r_sum, c_sum));
		}
		// 대각선 합 비교
		result = Math.max(result, Math.max(x_sum, y_sum));
		
		System.out.println(result);
		sc.close();
	}
}
