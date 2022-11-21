package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exam_306 {
	public static void main(String[] args) throws IOException {
		// 6. 최대 길이 연속부분수열
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int length = Integer.parseInt(st.nextToken());
		int change = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int[] nums = new int[length];
		
		for(int i = 0 ; i < length ; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = 0;
		
		for(int i = 0 ; i < length / 2 ; i++) {
			int cnt = change;
			int tmp = 0;
			
			for(int j = i ; j < length ; j++) {
				if(nums[j] == 0) {
					if(cnt > 0) {
						tmp++;
						cnt--;
					} else {
						break;
					}
				} else {
					tmp++;
				}
			}
			result = Math.max(result, tmp);
		}
		System.out.println(result);
	}
	
}
