-- 저자 별 카테고리 별 매출액 집계하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/144856

SELECT
    B.AUTHOR_ID,
    A.AUTHOR_NAME,
    B.CATEGORY,
    SUM(S.SALES*B.PRICE) AS TOTAL_SALES
FROM BOOK_SALES S, BOOK B, AUTHOR A
WHERE S.BOOK_ID = B.BOOK_ID
  AND B.AUTHOR_ID = A.AUTHOR_ID
  AND TO_CHAR(S.SALES_DATE,'YYYYMM')='202201'
GROUP BY B.AUTHOR_ID,A.AUTHOR_NAME,B.CATEGORY
ORDER BY 1, 3 DESC
;

-- 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
