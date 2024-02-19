	SELECT subscriber
	FROM (
		SELECT subscriber
		FROM full_year
		WHERE newspaper LIKE '%Daily%'
		UNION ALL
		SELECT subscriber
		FROM half_year
		WHERE newspaper LIKE '%Daily%'
	) subscribers
	GROUP BY subscriber
	ORDER BY subscriber;
