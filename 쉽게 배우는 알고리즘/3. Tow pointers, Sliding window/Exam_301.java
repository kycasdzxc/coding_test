package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Exam_301 {
	public static void main(String[] args) throws IOException {
		// 1. 두 배열 합치기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> nums = new ArrayList<Integer>();
		
		// 첫 번째 배열
		int length = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0 ; i < length ; i++) {
			nums.add(Integer.parseInt(st.nextToken()));
		}
		
		// 두 번째 배열
		length = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0 ; i < length ; i++) {
			nums.add(Integer.parseInt(st.nextToken()));
		}
		
		// 오름차순 정렬
		Collections.sort(nums);
		
		// 배열 출력
		for(Integer list : nums) {
			System.out.print(list + " ");
		}
	}
	
}
