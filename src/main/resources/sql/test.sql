CREATE TABLE `volunteer_manager`.`users` (
  `account` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `identity` VARCHAR(20) NULL,
  PRIMARY KEY (`account`));