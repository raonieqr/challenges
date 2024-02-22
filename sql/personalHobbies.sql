SELECT name
FROM people_hobbies
WHERE hobbies && hobbies LIKE '%sports%' AND hobbies && hobbies LIKE '%reading%';
