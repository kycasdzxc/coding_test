package exam;

import java.util.Scanner;

public class Exam_211 {
	public static void main(String[] args) {
		// 11. 임시반장 정하기
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[][] grade = new int[num][5];
		
		// 학생 별 학년 반 입력
		for(int i = 0 ; i < num ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				grade[i][j] = sc.nextInt();
			}
		}
		
		int result = -1;
		int leader = 0;
		
		// 학생 별 동급생 수 계산
		for(int i = 0 ; i < num ; i++) {
			int cnt = 0;
			
			// 다른 학생과 비교
			for(int j = 0 ; j < num ; j++) {
				// 학년 별 비교
				for(int k = 0 ; k < 5 ; k++) {
					if(grade[i][k] == grade[j][k]) {
						cnt++;
					}
				}
			}
			
			if(result < cnt) {
				result = cnt;
				leader = i + 1;
			}
		}
		
		System.out.println(leader);
		sc.close();
	}
}
