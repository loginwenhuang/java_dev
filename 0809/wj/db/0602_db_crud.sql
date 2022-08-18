/*
Navicat MySQL Data Transfer

Source Server         : demo
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : 0602_db

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2022-06-09 15:47:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `categoryId` int(11) NOT NULL,
  `categoryName` varchar(50) NOT NULL,
  PRIMARY KEY (`categoryId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '食品');
INSERT INTO `category` VALUES ('2', '饮品');
INSERT INTO `category` VALUES ('3', '日用品');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goodsId` int(11) NOT NULL AUTO_INCREMENT,
  `goodsName` varchar(200) NOT NULL,
  `price` decimal(5,1) NOT NULL,
  `produceDate` date NOT NULL,
  `address` varchar(200) DEFAULT '郑州',
  `categoryId` int(11) DEFAULT NULL,
  PRIMARY KEY (`goodsId`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '面包3', '2.3', '2018-01-03', '郑州3', '3');
INSERT INTO `goods` VALUES ('3', '鸡蛋', '1.0', '2021-02-02', '洛阳', '1');
INSERT INTO `goods` VALUES ('5', '咖啡', '20.0', '2019-02-02', '广州', '2');
INSERT INTO `goods` VALUES ('6', '洗衣粉', '18.0', '2001-02-02', '广州', '3');
INSERT INTO `goods` VALUES ('7', '香皂', '4.0', '2001-02-02', '武汉', '3');
INSERT INTO `goods` VALUES ('8', '奶茶', '9.0', '2022-02-02', '郑州', '2');
INSERT INTO `goods` VALUES ('9', '饺子', '32.0', '2022-03-02', '郑州', '1');
INSERT INTO `goods` VALUES ('10', '辣条', '0.5', '2001-02-08', '洛阳', '1');
INSERT INTO `goods` VALUES ('11', '荔枝', '32.0', '2022-06-02', '广东', '1');
INSERT INTO `goods` VALUES ('12', '红薯', '3.0', '2022-06-01', '郑州', '1');
INSERT INTO `goods` VALUES ('21', '绿茶', '2.0', '2022-06-05', '湖南', '2');
INSERT INTO `goods` VALUES ('22', '红茶', '4.0', '2022-06-22', '湖北', '2');
INSERT INTO `goods` VALUES ('23', '黑茶', '3.0', '2022-06-06', '安华', '2');
INSERT INTO `goods` VALUES ('24', '奶茶', '8.0', '2022-06-01', '河南', '2');
INSERT INTO `goods` VALUES ('25', '毛尖茶', '6.0', '2022-06-07', '信阳', '2');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `studentId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`studentId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '张三', '男', '2000-01-01', '13112345678');
INSERT INTO `student` VALUES ('2', '李四', '女', '2001-01-01', '13112345677');
INSERT INTO `student` VALUES ('3', '王五', '男', '2002-01-01', '13112345687');
INSERT INTO `student` VALUES ('4', 'xxx', '女', '2000-01-01', '15112345678');
INSERT INTO `student` VALUES ('5', '黄药师', '男', '2022-06-08', '23123123');
INSERT INTO `student` VALUES ('6', '瑛姑', '女', '2022-06-01', '13123123');
INSERT INTO `student` VALUES ('7', '风清扬', '男', '2022-06-02', '123123');
INSERT INTO `student` VALUES ('8', '车企国王', '男', '2022-06-10', '123123');
INSERT INTO `student` VALUES ('9', '武松', '男', '2022-06-08', '');

-- ----------------------------
-- Table structure for ums_agent
-- ----------------------------
DROP TABLE IF EXISTS `ums_agent`;
CREATE TABLE `ums_agent` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `levelId` int(11) NOT NULL,
  `nickName` varchar(20) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT '1 正常 2 禁用',
  `create_time` date DEFAULT NULL,
  `growth` int(11) DEFAULT NULL,
  `integration` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `levelId` (`levelId`),
  CONSTRAINT `ums_agent_ibfk_1` FOREIGN KEY (`levelId`) REFERENCES `ums_agent_level` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of ums_agent
-- ----------------------------
INSERT INTO `ums_agent` VALUES ('1', 'admin1', '1', '代理1', '13112345671', '1', '2022-06-02', '100', '500');
INSERT INTO `ums_agent` VALUES ('2', 'admin2', '2', '代理2', '13112345672', '1', '2022-06-02', '100', '500');
INSERT INTO `ums_agent` VALUES ('3', 'admin3', '3', '代理3', '13112345673', '2', '2022-06-02', '100', '500');
INSERT INTO `ums_agent` VALUES ('4', 'admin4', '4', '代理4', '13112345674', '1', '2022-06-02', '100', '500');
INSERT INTO `ums_agent` VALUES ('5', 'admin5', '1', '代理5', '13112345675', '2', '2022-06-02', '100', '500');
INSERT INTO `ums_agent` VALUES ('8', 'admin6', '1', '代理6', '121123123', '1', null, '222', '222');
INSERT INTO `ums_agent` VALUES ('9', 'admin7', '2', '代理7', '121123123', '2', null, '222', '222');
INSERT INTO `ums_agent` VALUES ('10', 'xxx', '3', 'xxx', '123123123', '2', null, '666', '455');

-- ----------------------------
-- Table structure for ums_agent_level
-- ----------------------------
DROP TABLE IF EXISTS `ums_agent_level`;
CREATE TABLE `ums_agent_level` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `note` varchar(200) DEFAULT NULL,
  `growth_point` int(11) DEFAULT NULL,
  `priviledge_birthday` int(11) DEFAULT NULL,
  `addTime` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of ums_agent_level
-- ----------------------------
INSERT INTO `ums_agent_level` VALUES ('1', '白银', '白银', '100', '0', '2022-06-02');
INSERT INTO `ums_agent_level` VALUES ('2', '黄金', '黄金', '200', '0', '2022-06-02');
INSERT INTO `ums_agent_level` VALUES ('3', '铂金', '铂金', '300', '1', '2022-06-02');
INSERT INTO `ums_agent_level` VALUES ('4', '钻石', '钻石', '400', '1', '2022-06-02');
