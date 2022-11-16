package exam;

import java.util.Scanner;

public class Exam_212 {
	public static void main(String[] args) {
		// 12. 멘토링
		Scanner sc = new Scanner(System.in);
		
		int student = sc.nextInt();
		int test = sc.nextInt();
		
		int[][] score = new int[test][student];
		
		// 학생 별 점수 입력
		for(int i = 0 ; i < test ; i++) {
			for(int j = 0 ; j < student ; j++) {
				score[i][j] = sc.nextInt();
			}
		}
		
		int cnt = 0;
		
		// 계산할 학생
		for(int i = 0 ; i < student ; i++) {
			// 비교 학생
			for(int j = 0 ; j < student ; j++) {
				boolean flag = true;
				
				// 자기 점수랑은 비교 X
				if(i != j) {
					for(int k = 0 ; k < test ; k++) {
						if(score[k][i] < score[k][j]) {
							flag = false;
							break;
						}
					}
					
					if(flag) {
						cnt++;
					}
				}
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}
