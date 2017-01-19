/*
Navicat MySQL Data Transfer

Source Server         : connection1
Source Server Version : 50703
Source Host           : localhost:3306
Source Database       : liyuhao

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2017-01-11 10:14:54
*/

create database `liyuhao`;

create user liyuhao@localhost identified by 'liyuhao';

grant all on liyuhao.* to liyuhao@localhost identified by 'liyuhao';

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT '',
  `password` varchar(20) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'liyuhao', 'liyuhao');
INSERT INTO `admin` VALUES ('2', '2', '2');
INSERT INTO `admin` VALUES ('3', '3', '3');
INSERT INTO `admin` VALUES ('4', 'test', 'test');
INSERT INTO `admin` VALUES ('5', '18814127430', '18814127430');
INSERT INTO `admin` VALUES ('6', '18814127430', '18814127430');
INSERT INTO `admin` VALUES ('7', '1881412743', '1881412743');
INSERT INTO `admin` VALUES ('8', 'zty', '13212221333');
INSERT INTO `admin` VALUES ('9', '000000000', '000000000');
INSERT INTO `admin` VALUES ('10', '000000ggggg000', '0000ggggggg00000');
INSERT INTO `admin` VALUES ('11', '000000ggggg000', '0000ggggggg00000');
INSERT INTO `admin` VALUES ('12', '18814120000743', '188100000003');
INSERT INTO `admin` VALUES ('13', '18814120000743', '18810000...0003');
INSERT INTO `admin` VALUES ('14', '000000', '0000000000');

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `bookId` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`bookId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) NOT NULL,
  `password` char(32) NOT NULL,
  `gender` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', '1', '1');
INSERT INTO `user` VALUES ('2', '2', '2', '2');
