/*
Navicat MySQL Data Transfer

Source Server         : bhblog
Source Server Version : 50724
Source Host           : 106.53.250.53:3306
Source Database       : onlineretailers

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2020-11-24 21:15:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_goods
-- ----------------------------
DROP TABLE IF EXISTS `t_goods`;
CREATE TABLE `t_goods` (
  `c_id` varchar(32) NOT NULL,
  `c_name` varchar(100) DEFAULT NULL COMMENT '商品名称',
  `n_residue` int(11) DEFAULT NULL COMMENT '库存',
  `c_storeid` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '仓库id',
  `d_createtime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for t_orderform
-- ----------------------------
DROP TABLE IF EXISTS `t_orderform`;
CREATE TABLE `t_orderform` (
  `c_id` varchar(32) NOT NULL COMMENT '主键',
  `c_form` varchar(100) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '订单名称',
  `c_userid` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '用户id',
  `c_goodid` varchar(50) DEFAULT NULL COMMENT '商品id',
  `n_goodnum` int(11) DEFAULT NULL COMMENT '件数',
  `d_datetime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for t_shoppingcart
-- ----------------------------
DROP TABLE IF EXISTS `t_shoppingcart`;
CREATE TABLE `t_shoppingcart` (
  `c_id` varchar(32) NOT NULL COMMENT '主键',
  `c_userid` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '用户id',
  `c_count` int(11) DEFAULT NULL COMMENT '件数',
  `c_goodid` smallint(50) DEFAULT NULL COMMENT '产品id',
  `c_goodnum` int(11) DEFAULT NULL COMMENT '商品件数',
  `d_datetime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for t_store
-- ----------------------------
DROP TABLE IF EXISTS `t_store`;
CREATE TABLE `t_store` (
  `c_id` varchar(32) NOT NULL COMMENT '主键',
  `c_name` varchar(100) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '仓库名',
  `n_area` double DEFAULT NULL COMMENT '仓库面积',
  `n_xh` int(11) DEFAULT NULL COMMENT '序号',
  `d_createtime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `c_id` varchar(32) NOT NULL COMMENT '主键',
  `c_name` varchar(100) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '姓名',
  `n_age` int(11) DEFAULT NULL COMMENT '年龄',
  `c_address` varchar(300) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '地址',
  `c_tel` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '手机号码',
  `d_createtime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
