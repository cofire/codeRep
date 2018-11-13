/*
Navicat MySQL Data Transfer

Source Server         : 本地mysql
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : merck

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2018-10-19 16:25:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_dict
-- ----------------------------
DROP TABLE IF EXISTS `tb_dict`;
CREATE TABLE `tb_dict` (
  `GROUP_ID` varchar(4) NOT NULL COMMENT '段号',
  `GROUP_NAME` varchar(100) DEFAULT NULL COMMENT '段名',
  `DICT_VALUE` varchar(10) NOT NULL COMMENT '参数号',
  `DICT_NAME` varchar(100) DEFAULT NULL COMMENT '参数名',
  `MODIFY_TIME` varchar(20) DEFAULT NULL COMMENT '最后修改时间',
  `MODIFY_USER` varchar(32) DEFAULT NULL COMMENT '最后修改人',
  `FILLER1` varchar(255) DEFAULT NULL COMMENT '预留字段1',
  `FILLER2` varchar(255) DEFAULT NULL COMMENT '预留字段2',
  `FILLER3` varchar(255) DEFAULT NULL COMMENT '预留字段3',
  `FILLER4` varchar(255) DEFAULT NULL COMMENT '预留字段4',
  PRIMARY KEY (`GROUP_ID`,`DICT_VALUE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_employee
-- ----------------------------
DROP TABLE IF EXISTS `tb_employee`;
CREATE TABLE `tb_employee` (
  `EMPLOYEE_ID` varchar(32) NOT NULL COMMENT '员工编号',
  `EMPLOYEE_NAME` varchar(50) DEFAULT NULL COMMENT '员工姓名',
  `EMPLOYEE_AGE` int(3) DEFAULT NULL COMMENT '年龄',
  `EMPLOYEE_GENDER` char(1) DEFAULT NULL COMMENT '性别:0-女；1-男;2-其他',
  `EMPLOYEE_ID_CARD` varchar(60) DEFAULT NULL COMMENT '身份证号',
  `EMPLOYEE_PHONE` varchar(11) DEFAULT NULL COMMENT '手机号',
  `EMPLOYEE_DEPT` varchar(255) DEFAULT NULL COMMENT '所属部门',
  `EMPLOYEE_INFO` varchar(255) DEFAULT NULL COMMENT '职位信息',
  `ENTRY_TIME` varchar(20) DEFAULT NULL COMMENT '入职时间',
  `LEAVE_ TIME` varchar(20) DEFAULT NULL COMMENT '离职时间',
  `FILLER1` varchar(255) DEFAULT NULL COMMENT '预留字段',
  `FILLER2` varchar(255) DEFAULT NULL COMMENT '预留字段',
  `FILLER3` varchar(255) DEFAULT NULL COMMENT '预留字段',
  PRIMARY KEY (`EMPLOYEE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_sysparam
-- ----------------------------
DROP TABLE IF EXISTS `tb_sysparam`;
CREATE TABLE `tb_sysparam` (
  `PARAMGROUP_ID` varchar(10) NOT NULL COMMENT '段号',
  `PARAM_ID` varchar(10) NOT NULL COMMENT '参数ID',
  `PARAM_VAL` varchar(255) DEFAULT NULL COMMENT '参数值',
  `PARAM_NAME` varchar(100) DEFAULT NULL COMMENT '参数名',
  `IF_CANMODIFY` char(1) DEFAULT NULL COMMENT '是否可修改',
  `REMARK` varchar(255) DEFAULT NULL COMMENT '备注',
  `MODIFY_TIME` varchar(20) DEFAULT NULL COMMENT '最后修改时间',
  `MODIFY_USER` varchar(20) DEFAULT NULL COMMENT '最后修改人',
  `FILLER1` varchar(255) DEFAULT NULL COMMENT '预留字段1',
  `FILLER2` varchar(255) DEFAULT NULL COMMENT '预留字段2',
  `FILLER3` varchar(255) DEFAULT NULL COMMENT '预留字段3',
  `FILLER4` varchar(255) DEFAULT NULL COMMENT '预留字段4',
  PRIMARY KEY (`PARAMGROUP_ID`,`PARAM_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `USER_ID` varchar(32) NOT NULL COMMENT '用户ID',
  `USER_NAME` varchar(32) DEFAULT NULL COMMENT '用户名称',
  `PASSWD` varchar(100) DEFAULT NULL COMMENT '密码',
  `FILLER1` varchar(255) DEFAULT NULL COMMENT '预留字段',
  `FILLER2` varchar(255) DEFAULT NULL COMMENT '预留字段',
  `FILLER3` varchar(255) DEFAULT NULL COMMENT '预留字段',
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_visitor
-- ----------------------------
DROP TABLE IF EXISTS `tb_visitor`;
CREATE TABLE `tb_visitor` (
  `D_ID` varchar(32) NOT NULL COMMENT 'ID',
  `NAME` varchar(50) DEFAULT NULL COMMENT '姓名',
  `PHONE` varchar(11) DEFAULT NULL COMMENT '手机号',
  `ID_CARD` varchar(50) DEFAULT NULL COMMENT '证件号',
  `ID_TYPE` char(1) DEFAULT NULL COMMENT '证件类型：0-身份证；1-驾驶证；2-社保证；3-护照；',
  `GENDER` char(1) DEFAULT NULL COMMENT '性别：0-女；1-男;2-其他',
  `VISITED_PERSON` varchar(50) DEFAULT NULL COMMENT '访问人',
  `VISITED_DEPT` varchar(200) DEFAULT NULL COMMENT '访问部门',
  `STATUS` varchar(255) DEFAULT NULL COMMENT '状态：0-入场申请；1-入场；2-离场',
  `CREATE_TIME` varchar(20) DEFAULT NULL COMMENT '提交时间',
  `IN_TIME` varchar(20) DEFAULT NULL COMMENT '入场时间',
  `OUT_TIME` varchar(20) DEFAULT NULL COMMENT '离场时间',
  `PIC_URL` varchar(255) DEFAULT NULL COMMENT '照片URL',
  `VISITOR_TYPE` char(1) DEFAULT NULL COMMENT '访客类型：0-访客；1-承包商；2-员工',
  `IS_TRAINED` char(1) DEFAULT NULL COMMENT '是否已培训：0-否；1-是；',
  `ACCESS_CARD_ID` varchar(32) DEFAULT NULL COMMENT '发放卡号',
  `FILLER1` varchar(255) DEFAULT NULL COMMENT '预留字段',
  `FILLER2` varchar(255) DEFAULT NULL COMMENT '预留字段',
  `FILLER3` varchar(255) DEFAULT NULL COMMENT '预留字段',
  PRIMARY KEY (`D_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
