package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Exam_302 {
	public static void main(String[] args) throws IOException {
		// 2. 공통원소 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> nums = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		
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
			int tmp = Integer.parseInt(st.nextToken());
			
			// 중복 여부 확인
			if(nums.contains(tmp)) {
				result.add(tmp);
			}
		}
		
		// 오름차순 정렬
		Collections.sort(result);
		
		// 배열 출력
		for(Integer list : result) {
			System.out.print(list + " ");
		}
	}
	
}
