SELECT name
    FROM (
        SELECT name, (price * quantity) AS total, quantity
        FROM Products
    ) AS p
    ORDER BY total DESC, quantity DESC
    LIMIT 1;
