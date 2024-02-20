SELECT item_name, item_type, COUNT(item_name) 'item_count'
FROM availableitems
GROUP BY item_name, item_type
ORDER BY item_type, item_name;
