package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exam3 {
	public static void main(String[] args) throws IOException {
		// 3. 문장 속 단어(indexOf(), substring())
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int cnt = st.countTokens();
		String[] strs = new String[cnt];
		
		for(int i = 0 ; i < cnt ; i++) {
			strs[i] = st.nextToken();
		}

		String result = "";

		for(int i = 0 ; i < strs.length ; i++) {
			if(strs[i] == null) {
				break;
			}
			if(result.length() < strs[i].length()) {
				result = strs[i];
			}
		}
		
		System.out.println(result);
	}
}
