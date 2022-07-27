package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2851 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int score = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			int mush = Integer.parseInt(br.readLine());
			
			if(score + mush > 100) {
				if((100 - score) == (100 - score + mush) * -1) {
					score += mush;
					break;
				} else {
					break;
				}
			} else {
				score += mush;
			}
		}
		System.out.println(score);
	}
}
