package exam;

import java.util.Scanner;

public class Exam_105 {
	public static void main(String[] args) {
		// 5. 특정 문자 뒤집기(toCharArray())
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] chars = str.toCharArray();
		
		int last = chars.length - 1; // 끝 글자 index
		char tmp; // 담아둘 공간
		
		for(int i = 0 ; i < chars.length ; i++) {
			if(checkedAlpabet(chars[i])) {
				while(!checkedAlpabet(chars[last])) {
					last--;
				}
				
				if(last <= i) {
					break;
				}
				
				tmp = chars[i];
				chars[i] = chars[last];
				chars[last] = tmp;
				last--;
			}
		}
		sc.close();
		System.out.println(new String(chars));
	}
	
	private static boolean checkedAlpabet(char c) {
		if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
			return true;
		}
		return false;
	}
}
