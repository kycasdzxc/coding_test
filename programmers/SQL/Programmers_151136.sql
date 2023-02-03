-- 평균 일일 대여 요금 구하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/151136

SELECT
    round(avg(daily_fee),0) as average_fee
from CAR_RENTAL_COMPANY_CAR
where CAR_TYPE = 'SUV'
;

-- 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
