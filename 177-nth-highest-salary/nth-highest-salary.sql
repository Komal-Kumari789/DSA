CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      SELECT MAX(salary)
      FROM Employee e
      WHERE(
        SELECT COUNT(DISTINCT salary)
        FROM Employee
        WHERE salary>e.salary
      )=N-1

  );
END