SELECT id, a, b, operation, c
    FROM (
        SELECT id, a, b, operation, c,
            CASE
                WHEN operation = '*' THEN a * b
                WHEN operation = '/' THEN a / b
                WHEN operation = '+' THEN a + b
                WHEN operation = '-' THEN a - b
            END AS total
        FROM expressions
    ) AS total_table
    WHERE c = total;
