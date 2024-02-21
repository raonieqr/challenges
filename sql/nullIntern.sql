SELECT COUNT(TRIM(id)) 'number_of_nulls'
FROM departments
WHERE description IS NULL OR TRIM(description) IN ('NULL', '-', 'nil');
