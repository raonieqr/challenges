SELECT name
	FROM (
		SELECT name, score
		FROM leaderboard
		ORDER BY score DESC
		LIMIT 5 OFFSET 3
	) as leader;
-- OFFSET ignora as 3 primeiras linhas
