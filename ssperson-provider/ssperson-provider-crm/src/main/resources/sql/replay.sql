CREATE DATABASE `oops_crm`CHARACTER SET utf8 COLLATE utf8_general_ci;
SHOW DATABASES;
USE `oops_crm`;

-- create replay table --
CREATE TABLE `oops_crm`.`replay`(
  `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(200) NOT NULL COMMENT '标题',
  `content` VARCHAR(1000) NOT NULL COMMENT '内容',
  `create_date` DATE NOT NULL COMMENT '创建时间',
  `keyword` VARCHAR(200) NOT NULL COMMENT '关键字',
  PRIMARY KEY (`id`)
) ENGINE=INNODB CHARSET=utf8 COLLATE=utf8_general_ci;