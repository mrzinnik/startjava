-- make queries

SELECT * FROM jaegers;

SELECT * FROM jaegers WHERE status <> 'Destroyed';

SELECT * FROM jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6';

SELECT * FROM jaegers ORDER BY mark DESC;

SELECT id, modelName, launch FROM jaegers WHERE launch = (SELECT min(launch) FROM jaegers);

SELECT id, modelName, kaijuKill FROM jaegers WHERE kaijuKill = (SELECT max(kaijuKill) FROM jaegers);
SELECT id, modelName, kaijuKill FROM jaegers WHERE kaijuKill = (SELECT min(kaijuKill) FROM jaegers);

SELECT avg(weight) FROM jaegers;

SELECT id, modelName, status, kaijuKill FROM jaegers WHERE status <> 'Destroyed';
UPDATE jaegers SET kaijuKill = kaijuKill + 1 WHERE status <> 'Destroyed';
SELECT id, modelName, status, kaijuKill FROM jaegers WHERE status <> 'Destroyed';

DELETE FROM jaegers WHERE status = 'Destroyed';
SELECT * FROM jaegers;