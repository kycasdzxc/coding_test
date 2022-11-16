package exam;

import java.util.Scanner;

public class Exam_207 {
	public static void main(String[] args) {
		// 7. 점수계산
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] score = new int[num];
		
		// 점수 입력
		for(int i = 0 ; i < num ; i++) {
			score[i] = sc.nextInt();
		}
		
		int sum = score[0];
		int cnt = 1;
		
		// 점수 계산
		for(int i = 1 ; i < num ; i++) {
			if(score[i] == 1) {
				// 이전에 점수획득 했는지 확인
				if(score[i-1] == 1) {
					cnt++;
				}
				sum += cnt;
			} else {
				cnt = 1;
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}
