package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Exam_304 {
	public static void main(String[] args) throws IOException {
		// 4. 연속 부분수열
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> nums = new ArrayList<Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int length = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		// 수열 세팅
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0 ; i < length ; i++) {
			nums.add(Integer.parseInt(st.nextToken()));
		}
		
		int result = 0;
		
		// 수열 합산 시작
		for(int i = 0 ; i < length ; i++) {
			int sum = 0;
			
			// 범위만큼 합산
			for(int j = i ; j < length ; j++) {
				if(sum < x) {
					sum += nums.get(j);
				} else {
					break;
				}
			}
			
			if(sum == x) {
				result++;
			}
		}
		
		System.out.println(result);
	}
	
}
