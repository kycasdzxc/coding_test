package exam;

import java.util.Scanner;

public class Exam_208 {
	public static void main(String[] args) {
		// 8. 등수구하기
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] score = new int[num];
		
		// 점수 입력
		for(int i = 0 ; i < num ; i++) {
			score[i] = sc.nextInt();
		}
		
		StringBuilder sb = new StringBuilder();
		
		// 등수 계산
		for(int i = 0 ; i < num ; i++) {
			int tmp = 1;
			
			for(int j = 0 ; j < num ; j++) {
				if(score[i] < score[j]) {
					tmp++;
				}
			}
			
			sb.append(tmp).append(" ");
		}
		
		System.out.println(sb.toString().trim());
		sc.close();
	}
}
