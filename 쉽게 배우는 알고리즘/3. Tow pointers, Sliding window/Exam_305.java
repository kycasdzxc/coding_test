package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam_305 {
	public static void main(String[] args) throws IOException {
		// 5. 연속된 자연수의 합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int result = 0;
		
		for(int i = 1 ; i <= num ; i++) {
			int sum = 0;
			
			for(int j = i ; j <= num ; j++) {
				if(sum == num) {
					result++;
					break;
				}
				else if(sum < num) {
					sum += j;
				} else {
					break;
				}
			}
		}
		
		System.out.println(result);
	}
	
}
