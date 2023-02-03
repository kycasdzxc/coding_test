-- 3월에 태어난 여성 회원 목록 출력하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/131120

SELECT
    MEMBER_ID
    , MEMBER_NAME
    , GENDER
    , TO_CHAR(DATE_OF_BIRTH, 'yyyy-MM-dd') DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE TO_CHAR(DATE_OF_BIRTH, 'MM') = '03'
AND GENDER = 'W'
AND TLNO is not null
ORDER BY MEMBER_ID
;

-- 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
