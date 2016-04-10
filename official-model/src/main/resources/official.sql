/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50625
 Source Host           : localhost
 Source Database       : official

 Target Server Type    : MySQL
 Target Server Version : 50625
 File Encoding         : utf-8

 Date: 04/08/2016 14:41:45 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

CREATE DATABASE IF NOT EXISTS official DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
use official;
GRANT ALL PRIVILEGES ON official.* to official_app@'%' IDENTIFIED BY 'official_app' WITH GRANT OPTION;
FLUSH PRIVILEGES;
SET global max_sp_recursion_depth = 5;
-- ----------------------------
--  Table structure for `cfg_authority`
-- ----------------------------
DROP TABLE IF EXISTS `cfg_authority`;
CREATE TABLE `cfg_authority` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `patient_id` bigint(20) NOT NULL,
  `authority_name` varchar(45) DEFAULT NULL,
  `authority_desc` varchar(512) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='资源、模块、权限';

-- ----------------------------
--  Records of `cfg_authority`
-- ----------------------------
BEGIN;
INSERT INTO `cfg_authority` VALUES ('1', '0', '用户管理', null, null), ('2', '1', '用户查询', null, null);
COMMIT;

-- ----------------------------
--  Table structure for `cfg_banner`
-- ----------------------------
DROP TABLE IF EXISTS `cfg_banner`;
CREATE TABLE `cfg_banner` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `banner_width` int(11) DEFAULT NULL,
  `banner_height` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='首页banner配置表';

-- ----------------------------
--  Table structure for `cfg_company`
-- ----------------------------
DROP TABLE IF EXISTS `cfg_company`;
CREATE TABLE `cfg_company` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(512) DEFAULT NULL,
  `tel` varchar(45) DEFAULT NULL,
  `zipcode` varchar(45) DEFAULT NULL,
  `site_title` varchar(512) DEFAULT NULL,
  `meta_keyword` varchar(512) DEFAULT NULL,
  `meta_description` varchar(512) DEFAULT NULL,
  `meta_author` varchar(45) DEFAULT NULL,
  `site_favicon` varchar(512) DEFAULT NULL COMMENT '网站-favicon.ico',
  `site_icp` varchar(45) DEFAULT NULL,
  `site_domain` varchar(45) DEFAULT NULL COMMENT '网站域名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='公司信息配置';

-- ----------------------------
--  Records of `cfg_company`
-- ----------------------------
BEGIN;
INSERT INTO `cfg_company` VALUES ('1', '北京阳光欣晴健康管理有限责任公司', '北京中关村融科', '010-1222', '100000', '阳光欣晴', '阳光随访，阳光APP', '阳光随访是什么', 'Lightheart Co., Ltd.', 'http://www.baidu.com/favicon.ico', null, null);
COMMIT;

-- ----------------------------
--  Table structure for `cfg_role`
-- ----------------------------
DROP TABLE IF EXISTS `cfg_role`;
CREATE TABLE `cfg_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(45) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `role_desc` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `cfg_role`
-- ----------------------------
BEGIN;
INSERT INTO `cfg_role` VALUES ('1', '超级管理员', null, '拥有系统所有权限\\不可操作\\不可修改'), ('2', '系统管理员', null, null), ('3', '管理员', null, null), ('4', '用户', null, null), ('5', '访客', null, null);
COMMIT;

-- ----------------------------
--  Table structure for `cfg_role_authority`
-- ----------------------------
DROP TABLE IF EXISTS `cfg_role_authority`;
CREATE TABLE `cfg_role_authority` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL,
  `authority_id` bigint(20) DEFAULT NULL,
  `authority_type` int(11) DEFAULT NULL COMMENT '1、可访问；2、可授权',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `cfg_user`
-- ----------------------------
DROP TABLE IF EXISTS `cfg_user`;
CREATE TABLE `cfg_user` (
  `id` bigint(20) NOT NULL,
  `nickname` varchar(45) DEFAULT NULL,
  `username` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `mobile` varchar(45) DEFAULT NULL,
  `password` varchar(64) NOT NULL,
  `salt` varchar(4) NOT NULL,
  `create_time` datetime NOT NULL COMMENT '1',
  `reg_ip` varchar(45) DEFAULT NULL,
  `reg_uid` bigint(20) DEFAULT NULL,
  `latest_login_time` datetime DEFAULT NULL,
  `latest_login_ip` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `cfg_user`
-- ----------------------------
BEGIN;
INSERT INTO `cfg_user` VALUES ('1', null, 'superadmin', 'admin@admin', null, 'b7fb5f77d7c3efd9358ea1c55bb74734', '0000', '2016-04-08 09:44:27', null, '0', null, null);
COMMIT;

-- ----------------------------
--  Table structure for `of_banner`
-- ----------------------------
DROP TABLE IF EXISTS `of_banner`;
CREATE TABLE `of_banner` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `desc` varchar(512) DEFAULT NULL,
  `url` varchar(512) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT '1、创建审核中；2生效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='首页轮播广告条';

-- ----------------------------
--  Table structure for `of_catalog`
-- ----------------------------
DROP TABLE IF EXISTS `of_catalog`;
CREATE TABLE `of_catalog` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键自增长',
  `catalog_name` varchar(45) DEFAULT NULL,
  `remark` varchar(512) DEFAULT NULL,
  `seq` int(11) DEFAULT NULL COMMENT '栏目显示顺序',
  `status` int(11) DEFAULT NULL COMMENT '栏目状态',
  `upid` bigint(20) DEFAULT NULL COMMENT '上级栏目ID',
  `type` varchar(255) DEFAULT NULL COMMENT '栏目类型-detail页面-list列表页面',
  `level` int(11) DEFAULT NULL COMMENT '层次等级',
  `url_path` varchar(45) DEFAULT NULL COMMENT 'url访问路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='一级栏目、二级栏目、三级栏目管理';

-- ----------------------------
--  Records of `of_catalog`
-- ----------------------------
BEGIN;
INSERT INTO `of_catalog` VALUES ('1', '111', null, '1', '1', '0', null, '1', null), ('2', '111-2', null, '2', '1', '1', 'detail', '2', null), ('3', '111-1', null, '1', '1', '1', 'detail', '2', null), ('4', '222', null, '2', '1', '0', null, '1', null), ('5', '222-1', null, '1', '1', '4', 'detail', '2', null), ('6', '222-2', null, '2', '1', '4', 'detail', '2', null), ('7', '555', null, '5', '1', '0', 'list', '1', 'mall'), ('8', '444', null, '4', '1', '0', null, '1', 'about_us'), ('9', '444-1', null, '1', '1', '8', 'detail', '2', 'company_intro'), ('10', '444-2', null, '2', '1', '8', 'detail', '2', 'company_culture'), ('11', '444-3', null, '3', '1', '8', 'detail', '2', 'contact'), ('12', '111-3', null, '3', '2', '1', null, '2', null), ('13', '333', null, '3', '1', '0', null, '1', null), ('14', '444-1-1', null, '1', '1', '9', null, '3', null), ('15', '444-2-1', null, '1', '1', '10', null, '3', null), ('16', '444-1-2', null, '2', '1', '9', null, '3', null);
COMMIT;

-- ----------------------------
--  Table structure for `of_catalog_detail`
-- ----------------------------
DROP TABLE IF EXISTS `of_catalog_detail`;
CREATE TABLE `of_catalog_detail` (
  `id` bigint(20) DEFAULT NULL,
  `catalog_id` bigint(20) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `brief` varchar(45) DEFAULT NULL,
  `desc` text,
  `author` varchar(45) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `status` int(11) DEFAULT '1' COMMENT '1审核，2生效，3过期',
  `update_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Procedure structure for `CREATE_CATALOG_TREE`
-- ----------------------------
DROP PROCEDURE IF EXISTS `CREATE_CATALOG_TREE`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `CREATE_CATALOG_TREE`(IN root_id INT,IN n_depth INT, IN stats INT)
BEGIN
DECLARE done INT DEFAULT 0;
DECLARE b INT;
DECLARE  child CURSOR FOR SELECT id FROM of_catalog WHERE upid = root_id  group by upid ,seq;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

INSERT INTO tmp_list VALUES (NULL, root_id, n_depth);

OPEN child;
FETCH child INTO b;

WHILE done = 0 DO
CALL CREATE_CATALOG_TREE(b,n_depth+1,stats);
FETCH child INTO b;
END WHILE;

CLOSE child;
END
 ;;
delimiter ;

-- ----------------------------
--  Procedure structure for `CREATE_CATALOG_TREE_ALL`
-- ----------------------------
DROP PROCEDURE IF EXISTS `CREATE_CATALOG_TREE_ALL`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `CREATE_CATALOG_TREE_ALL`(IN root_id INT,IN n_depth INT)
BEGIN
DECLARE done INT DEFAULT 0;
DECLARE b INT;
DECLARE  child CURSOR FOR SELECT id FROM of_catalog WHERE upid = root_id  group by upid ,seq;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

INSERT INTO tmp_list VALUES (NULL, root_id, n_depth);

OPEN child;
FETCH child INTO b;

WHILE done = 0 DO
CALL CREATE_CATALOG_TREE_ALL(b,n_depth+1);
FETCH child INTO b;
END WHILE;

CLOSE child;
END
 ;;
delimiter ;

-- ----------------------------
--  Procedure structure for `CREATE_CATALOG_TREE_STATS`
-- ----------------------------
DROP PROCEDURE IF EXISTS `CREATE_CATALOG_TREE_STATS`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `CREATE_CATALOG_TREE_STATS`(IN root_id INT,IN n_depth INT, IN stats INT)
BEGIN
DECLARE done INT DEFAULT 0;
DECLARE b INT;
DECLARE  child CURSOR FOR SELECT id FROM of_catalog WHERE upid = root_id and status=stats  group by upid ,seq;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

INSERT INTO tmp_list VALUES (NULL, root_id, n_depth);

OPEN child;
FETCH child INTO b;

WHILE done = 0 DO
CALL CREATE_CATALOG_TREE_STATS(b,n_depth+1,stats);
FETCH child INTO b;
END WHILE;

CLOSE child;
END
 ;;
delimiter ;

-- ----------------------------
--  Procedure structure for `SHOW_CATALOG_TREE`
-- ----------------------------
DROP PROCEDURE IF EXISTS `SHOW_CATALOG_TREE`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `SHOW_CATALOG_TREE`(IN root_id INT,IN stats INT)
BEGIN
CREATE TEMPORARY TABLE IF NOT EXISTS tmp_list(
sno INT AUTO_INCREMENT,
id INT,
depth INT,
PRIMARY KEY(sno)
);

DELETE FROM tmp_list;
if stats is NULL THEN
CALL CREATE_CATALOG_TREE_ALL(root_id,0);
ELSE
CALL CREATE_CATALOG_TREE_STATS(root_id,0,stats);
end if;

 	SELECT tmp_list.*,of_catalog.* FROM tmp_list,of_catalog
 	WHERE tmp_list.id = of_catalog.id
 	ORDER BY tmp_list.sno;
END
 ;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
