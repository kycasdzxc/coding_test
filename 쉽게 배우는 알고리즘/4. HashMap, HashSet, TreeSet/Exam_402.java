package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Exam_402 {
	public static void main(String[] args) throws IOException {
		// 2. 아나그램(해쉬)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s1 = br.readLine();
		String s2 = br.readLine();
		
		System.out.println(anagram(s1, s2));
	}
	
	static private String anagram(String s1, String s2) {
		String result = "YES";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : s1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for(char c : s2.toCharArray()) {
			if(!map.containsKey(c) || map.get(c) == 0) {
				result = "NO";
				break;
			}
			map.put(c, map.get(c) - 1);
		}
		
		return result;
	}
	
}
