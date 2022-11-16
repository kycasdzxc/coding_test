package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Exam_303 {
	public static void main(String[] args) throws IOException {
		// 3. 최대 매출
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> nums = new ArrayList<Integer>();
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int days = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
		
		// 매출 입력
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0 ; i < days ; i++) {
			nums.add(Integer.parseInt(st.nextToken()));
		}
		
		int result = 0;
		
		// 최대 매출 조회
		for(int i = 0 ; i < days-2 ; i++) {
			int sum = 0;
			
			// 범위만큼 합산
			for(int j = i ; j < i + length ; j++) {
				sum += nums.get(j);
			}
			
			result = Math.max(result, sum);
		}
		
		System.out.println(result);
	}
	
}
