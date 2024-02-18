SELECT  CASE 
  WHEN DAYOFWEEK(mischief_date) = 1 THEN 6
  WHEN DAYOFWEEK(mischief_date) = 2 THEN 0
  WHEN DAYOFWEEK(mischief_date) = 3 THEN 1
  WHEN DAYOFWEEK(mischief_date) = 4 THEN 2
  WHEN DAYOFWEEK(mischief_date) = 5 THEN 3
  WHEN DAYOFWEEK(mischief_date) = 6 THEN 4
  WHEN DAYOFWEEK(mischief_date) = 7 THEN 5
  END AS weekday, mischief_date, author, title
FROM mischief
ORDER BY weekday, FIELD(mischief.`author`, 'Huey', 'Dewey', 'Louie'), mischief_date, title;
