/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80011
Source Host           : 127.0.0.1:3306
Source Database       : testdb

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2018-09-15 19:06:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_data
-- ----------------------------
DROP TABLE IF EXISTS `tb_data`;
CREATE TABLE `tb_data` (
  `D_ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(32) DEFAULT NULL,
  `PHONE` varchar(11) DEFAULT NULL,
  `ID_CARD` varchar(32) DEFAULT NULL,
  `VISITOR` varchar(32) DEFAULT NULL,
  `DEPT` varchar(32) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `CREATE_TIME` varchar(32) DEFAULT NULL,
  `IN_TIME` varchar(32) DEFAULT NULL,
  `OUT_TIME` varchar(32) DEFAULT NULL,
  `FILLER1` varchar(100) DEFAULT NULL,
  `FILLER2` varchar(100) DEFAULT NULL,
  `FILLER3` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`D_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tb_data
-- ----------------------------
INSERT INTO `tb_data` VALUES ('1', '1', '1', '1', '1', '1', '1', '1', '1', '1', null, null, null);
INSERT INTO `tb_data` VALUES ('2', 'moke', '12345678', '12345678', 'mo', 'ke', null, null, null, null, null, null, null);
INSERT INTO `tb_data` VALUES ('3', 'moke', '12345678', '12345678', 'mo', 'ke', null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `USER_NAME` varchar(32) NOT NULL COMMENT '用户名',
  `PASSWORD` varchar(32) DEFAULT NULL COMMENT '密码',
  `FILLER1` varchar(100) DEFAULT NULL,
  `FILLER2` varchar(100) DEFAULT NULL,
  `FILLER3` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`USER_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
