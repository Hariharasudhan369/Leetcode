# Write your MySQL query statement below
SELECT employee_id,
if(mod(employee_id,2) > 0, if(LEFT(name,1) = 'M',0,salary) , 0) as 'bonus'
FROM Employees order by employee_id