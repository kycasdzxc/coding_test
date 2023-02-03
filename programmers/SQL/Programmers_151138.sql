-- 자동차 대여 기록에서 장기/단기 대여 구분하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/151138

SELECT
    history_id, car_id,
    to_char(start_date, 'yyyy-MM-dd') as start_date,
    to_char(end_date, 'yyyy-MM-dd') as end_date,
    case
        when end_date - start_date + 1 >= 30 then '장기 대여'
        else '단기 대여'
    end as RENT_TYPE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where to_char(start_date, 'yyyy-MM-dd') like '2022-09-__'
order by 1 desc
;

-- 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
