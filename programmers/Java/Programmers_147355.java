package programmers;

import java.math.BigInteger;

public class Programmers_147355 {
	// 크기가 작은 부분문자열
	// https://school.programmers.co.kr/learn/courses/30/lessons/147355?language=java
    public int solution(String t, String p) {
        int answer = 0;
        for(int i = 0 ; i <= t.length() - p.length() ; i++) {
        	BigInteger a = new BigInteger(t.substring(i, i+p.length()));
        	BigInteger b = new BigInteger(p);
        	
        	if(a.max(b).equals(b)) {
        		answer++;
        	}
        }
        return answer;
    }
}

// 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
