--<ScriptOptions statementTerminator=";"/>

ALTER TABLE `springmvclearn`.`user` DROP PRIMARY KEY;

ALTER TABLE `springmvclearn`.`project` DROP PRIMARY KEY;

DROP TABLE `springmvclearn`.`project`;

DROP TABLE `springmvclearn`.`user`;

CREATE TABLE `springmvclearn`.`project` (
	`id` INT NOT NULL,
	`expectedAnnualRateOfReturn` FLOAT,
	`holdingPeriod` TINYINT,
	`purchaseAmount` INT,
	`CrowdingProgress` FLOAT,
	`crowdStatus` VARCHAR(64),
	`projectName` VARCHAR(64),
	PRIMARY KEY (`id`)
);

CREATE TABLE `springmvclearn`.`user` (
	`id` INT NOT NULL,
	`userName` VARCHAR(64),
	`password` VARCHAR(64),
	PRIMARY KEY (`id`)
);



create table orders (id int primary key auto_increment, userid int,projectid int,purchaseamount int,FOREIGN KEY (userid) REFERENCES user(id), FOREIGN KEY (projectid) REFERENCES project(id));
 
 
 