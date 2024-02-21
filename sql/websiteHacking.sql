SELECT id,login,name
FROM users
WHERE type='user' OR type <> 'user'
ORDER BY id;
-- <> pega todos os tipos diferentes de user
