CREATE DATABASE `warehouse`;

USE `warehouse`;
CREATE TABLE `products`(
	`id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) NOT NULL,
    `brand` VARCHAR(255) NOT NULL,
    `madein` VARCHAR(255) NOT NULL,
    `price` FLOAT NOT NULL,
    PRIMARY KEY(`id`)
);
USE `warehouse`;
CREATE TABLE `users`(
	`user_id` INT NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(45) NOT NULL,
    `password` VARCHAR(255) NOT NULL,
    `role` VARCHAR(45) NOT NULL,
    `enabled` TINYINT NULL,
    PRIMARY KEY(`user_id`)
);


INSERT INTO `products`(`name`, `brand`, `madein`, `price`)
VALUES("Alianware", "Dell", "USA", "2100");

INSERT INTO `products`(`name`, `brand`, `madein`, `price`)
VALUES("Pc", "Lenovo", "China", "1000");

INSERT INTO `users`(`username`, `password`, `role`, `enabled`)
VALUES("admin", "$2a$10$Lu1t1i0VBNEy0f4QPLqtUORaCxXofiFDC8Wn5hL1K858yoH/i8xZ6", "User Role", 1)
