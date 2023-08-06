-- 코드를 입력하세요
SELECT
        HISTORY_ID,
        CASE
            WHEN DUR < 7 THEN ROUND(DAILY_FEE * DUR)
            WHEN DUR < 30 THEN ROUND(DAILY_FEE * DUR * 0.95)
            WHEN DUR < 90 THEN ROUND(DAILY_FEE * DUR * 0.92)
            ELSE ROUND(DAILY_FEE * DUR * 0.85)
        END AS FEE
FROM
    (SELECT * FROM CAR_RENTAL_COMPANY_CAR WHERE CAR_TYPE = '트럭') C
JOIN
    (SELECT *, DATEDIFF(END_DATE, START_DATE)+1 DUR FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY) H
ON
    C.CAR_ID = H.CAR_ID
GROUP BY
    HISTORY_ID
ORDER BY
    FEE DESC, HISTORY_ID DESC
;