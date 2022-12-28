CREATE TABLE `volunteer_manager`.`users` (
  `account` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `identity` VARCHAR(20) NULL,
  PRIMARY KEY (`account`));

-- volunteer_manager.`voluntary_activity`
create table if not exists volunteer_manager.`voluntary_activity`
(
    `vid` int not null auto_increment comment '活动id' primary key,
    `vname` varchar(256) not null comment '活动名称',
    `management_teacher_account` varchar(45) not null comment '管理老师',
    `vinfo` varchar(256) null comment '活动介绍信息'
    ) comment 'volunteer_manager.`voluntary_activity`';

-- volunteer_manager.`select`
create table if not exists volunteer_manager.`select`
(
    `s_account` varchar(45) not null comment '用户账号',
    `vid` int not null comment '活动id',
    `score` int null comment '分数'
    ) comment 'volunteer_manager.`select`';