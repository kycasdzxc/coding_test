-- 진료과별 총 예약 횟수 출력하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/132202

SELECT MCDP_CD as "진료과 코드", count(*) as "5월예약건수"
from APPOINTMENT
where to_char(apnt_ymd, 'yyyy-MM') = '2022-05'
group by MCDP_CD
order by 2, 1
;

-- 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
