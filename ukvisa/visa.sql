/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : visa

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2019-12-18 14:16:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for agency
-- ----------------------------
DROP TABLE IF EXISTS `agency`;
CREATE TABLE `agency` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `agencyname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `people` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `fax` varchar(255) DEFAULT NULL,
  `describe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `createDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of agency
-- ----------------------------
INSERT INTO `agency` VALUES ('1', '全景旅游aaaabbbb', '某某', '150000000', '南京市xxxxx', '154545321', 'xxxxxxxxxxxxx', '2019-12-16 19:24:57');
INSERT INTO `agency` VALUES ('2', '阳光国旅xxxxxxx', '某某', '150000000', '上海市xxxxxx', '154545321', 'xxxxxxxxxxxxx', '2019-12-15 20:51:50');
INSERT INTO `agency` VALUES ('3', '上海易达', '某某', '150000000', '上海xxxxxx', '154545321', 'xxxxxxxxxxxxx', '2019-12-13 22:29:53');
INSERT INTO `agency` VALUES ('4', '上海华远', '某某', '150000000', '北京市xxxxxxxx', '48456846546848', 'xxxxxxxxxxxxx', '2019-12-13 22:30:50');
INSERT INTO `agency` VALUES ('5', '新东方留学', '某某', '150000000', '无锡市xxxxxxxxx', '1546546845', 'xxxxxx', '2019-12-13 22:31:26');

-- ----------------------------
-- Table structure for team
-- ----------------------------
DROP TABLE IF EXISTS `team`;
CREATE TABLE `team` (
  `tid` int(50) NOT NULL AUTO_INCREMENT,
  `teamname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `teamnum` int(11) DEFAULT NULL,
  `money` double DEFAULT NULL,
  `vip` int(11) DEFAULT NULL,
  `aid` int(11) DEFAULT NULL,
  `createDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of team
-- ----------------------------
INSERT INTO `team` VALUES ('1', 'ADS-190001', '20', '22869', '0', '3', '2019-12-16 20:00:34');
INSERT INTO `team` VALUES ('2', 'ADS-190002', '45', '16545', '0', '1', '2019-12-13 22:38:30');
INSERT INTO `team` VALUES ('3', 'SS-190001', '45', '21546', '1', '3', '2019-12-13 22:38:31');
INSERT INTO `team` VALUES ('4', 'ADS-190003', '12', '54684', '1', '4', '2019-12-13 22:38:31');
INSERT INTO `team` VALUES ('5', 'SS-190002', '22', '28874', '0', '2', '2019-12-13 22:38:32');
INSERT INTO `team` VALUES ('6', 'SVV-190001', '10', '21345', '0', '2', '2019-12-13 22:38:57');
INSERT INTO `team` VALUES ('7', 'SS-190001', '21', '15411', '1', '5', '2019-12-13 22:38:57');
INSERT INTO `team` VALUES ('8', 'ADS-190004', '40', '22022', '0', '1', '2019-12-13 22:38:58');
INSERT INTO `team` VALUES ('9', 'ADS-190005', '30', '54502', '1', '3', '2019-12-13 22:38:58');
INSERT INTO `team` VALUES ('10', 'SVV-190002', '27', '46540', '0', '5', '2019-12-13 22:38:58');
INSERT INTO `team` VALUES ('11', 'ADS-190006', '18', '464809', '0', '1', '2019-12-13 22:38:59');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `realname` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `birthday` varchar(255) DEFAULT NULL,
  `usertype` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'howard', '赵xx', '123', '1', '1989-12-12 00:00:00.0', '2');
INSERT INTO `user` VALUES ('3', 'meily', '裴xx', '123', '2', '1997-11-23', '3');
INSERT INTO `user` VALUES ('4', 'dora', '杨xx', '123', '2', '1989-05-06', '3');
INSERT INTO `user` VALUES ('5', 'amy', '葛xxx', '123', '2', '1987-02-11', '1');
INSERT INTO `user` VALUES ('9', 'alex', '吴xx', '123', '1', '2019-12-12 00:00:00.0', '3');
INSERT INTO `user` VALUES ('14', 'root', '吴xx', '123', '1', '2019-12-12 00:00:00.0', '2');
