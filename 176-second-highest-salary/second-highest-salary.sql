# Write your MySQL query statement below
select MAX(salary) as SecondHighestSalary
FROM Employee
Where salary < (select MAX(salary) from Employee);