DROP TABLE IF EXISTS TASK;
  
CREATE TABLE TASK (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  priority VARCHAR(50),
  notice VARCHAR(100),
  finished INT
);