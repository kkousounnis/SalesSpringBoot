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