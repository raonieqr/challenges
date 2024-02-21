SELECT
    SUM((CASE
        WHEN type = 'human' THEN 2
        WHEN type = 'cat' OR type = 'dog' THEN 4
    END)) as summary_legs
FROM creatures
ORDER BY id;
