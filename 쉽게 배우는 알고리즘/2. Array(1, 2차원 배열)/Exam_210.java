package exam;

import java.util.Scanner;

public class Exam_210 {
	public static void main(String[] args) {
		// 10. 봉우리
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[][] board = new int[num+2][num+2];
		// 격자 가장자리는 제외하고 입력
		for(int i = 1 ; i < board.length - 1 ; i++) {
			for(int j = 1 ; j < board.length - 1 ; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		int cnt = 0;
		
		// 봉우리 계산
		for(int i = 1 ; i < board.length - 1 ; i++) {
			for(int j = 1 ; j < board.length - 1 ; j++) { // 1 1 0 1
				if(board[i][j] > board[i-1][j] && board[i][j] > board[i][j-1] && board[i][j] > board[i+1][j] && board[i][j] > board[i][j+1]) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}
