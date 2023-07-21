package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int cnt_noListen = Integer.parseInt(st.nextToken());
		int cnt_noSee = Integer.parseInt(st.nextToken());
		
		Set<String> noListen = new HashSet<String>();
		List<String> noSee = new ArrayList<String>();
		
		for(int i = 0 ; i < cnt_noListen ; i++) {
			noListen.add(br.readLine());
		}
		
		for(int i = 0 ; i < cnt_noSee ; i++) {
			String str = br.readLine();
			if(noListen.contains(str)) {
				noSee.add(str);
			}
		}
		
		Collections.sort(noSee);
		
		int size = noSee.size();
		System.out.println(size);
		
		for(int i = 0 ; i < size ; i++) {
			System.out.println(noSee.get(i));
		}
	}
}
