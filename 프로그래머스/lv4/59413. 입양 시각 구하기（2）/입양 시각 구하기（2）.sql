WITH RECURSIVE cte AS
(
  SELECT 0 AS h
  UNION ALL
  SELECT h + 1 FROM cte WHERE h < 23
)
SELECT h, COUNT(HOUR(DATETIME))
FROM cte
LEFT JOIN ANIMAL_OUTS on h = HOUR(DATETIME)
GROUP BY h
ORDER BY h;

