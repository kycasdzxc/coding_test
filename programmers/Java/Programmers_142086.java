package programmers;

public class Programmers_142086 {
	// 가장 가까운 같은 글자
	// https://school.programmers.co.kr/learn/courses/30/lessons/142086?language=java
	public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0 ; i < s.length() ; i++) {
            int pos = -1;
            
            for(int j = 0 ; j < i ; j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    pos = i - j ;
                }
            }
            answer[i] = pos;
        }
        return answer;
    }
}

// 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
