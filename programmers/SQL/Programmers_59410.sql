-- NULL 처리하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/59410

SELECT
    ANIMAL_TYPE
    , CASE WHEN NAME is null THEN 'No name' ELSE NAME END NAME
    , SEX_UPON_INTAKE
FROM ANIMAL_INS
ORDER BY ANIMAL_ID
;

-- 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
