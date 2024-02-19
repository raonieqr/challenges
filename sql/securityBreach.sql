SELECT u1.first_name, u1.second_name, u1.attribute
FROM users u1
JOIN users u2 ON u1.attribute LIKE BINARY CONCAT('_%\%',u2.first_name,'\_',u2.second_name,'\%%');
