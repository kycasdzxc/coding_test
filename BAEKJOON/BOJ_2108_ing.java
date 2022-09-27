package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_2108_ing {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		Integer[] cnts = new Integer[8001];
		
		for(int i = 0 ; i < cnts.length ; i++) {
			cnts[i] = 0;
		}
		
		double avg  = 0; // 산술평균
		int center = 0; // 중앙값
		int mode   = 0; // 최빈값
		int length = 0; // 최대값 - 최소값
		
		List<Integer> nums = new ArrayList<Integer>();
		
		int tmp = 0;
		
		for(int i = 0 ; i < cnt ; i++) {
			tmp = Integer.parseInt(br.readLine());
			nums.add(tmp);
			avg += tmp;
			if(tmp > -1) {
				cnts[tmp]++;
			} else {
				cnts[Math.abs(tmp) + 4000]++;
			}
		}
		
		Collections.sort(nums);
		
		int num = -1;
		int max = -1;
		
		for(int i = 0 ; i < cnts.length ; i++) {
			if(max < cnts[i]) {
				num = i;
				max = cnts[i];
			}
		}
		
		avg = Math.round(avg / cnt);
		center = nums.get(nums.size() / 2);
		mode = num > 4000 ? num - 4002 : num;
		length = nums.get(nums.size()-1) - nums.get(0);
		
		System.out.println((int)avg);
		System.out.println(center);
		System.out.println(mode);
		System.out.println(length);
	}
}
