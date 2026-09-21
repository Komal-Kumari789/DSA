# Write your MySQL query statement below
SELECT ROUND(COUNT(a2.player_id)/COUNT(DISTINCT a1.player_id),2)
AS fraction FROM Activity a1
LEFT JOIN Activity a2
ON a1.player_id=a2.player_id
AND a2.event_date=DATE_ADD(a1.event_date,INTERVAL 1 DAY)
WHERE a1.event_date=(
    SELECT MIN(a3.event_date)
    FROM Activity a3
    WHERE a3.player_id= a1.player_id
);