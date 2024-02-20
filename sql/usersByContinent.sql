	SELECT continent, SUM(users) 'users'
	FROM countries
	GROUP BY continent
	ORDER BY users DESC;
