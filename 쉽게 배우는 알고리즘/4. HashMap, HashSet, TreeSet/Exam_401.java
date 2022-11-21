package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Exam_401 {
	public static void main(String[] args) throws IOException {
		// 1. 학급 회장(해쉬)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String vote = br.readLine();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0 ; i < num ; i++) {
			char c = vote.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		int max = Integer.MIN_VALUE;
		char result = ' ';
		
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				result = key;
			}
		}
		
		System.out.println(result);
	}
	
}
