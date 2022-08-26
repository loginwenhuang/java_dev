/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : character-test

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 21/12/2021 15:13:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_dept
-- ----------------------------
DROP TABLE IF EXISTS `tbl_dept`;
CREATE TABLE `tbl_dept`  (
  `dept_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `dept_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '部门名称',
  `order_num` int(11) NULL DEFAULT 0 COMMENT '显示顺序',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '部门状态（0正常 1停用）',
  `del_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`dept_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 134 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '部门表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tbl_dept
-- ----------------------------
INSERT INTO `tbl_dept` VALUES (101, '研发部门', 1, '0', '0', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00');
INSERT INTO `tbl_dept` VALUES (102, '市场部门', 2, '0', '0', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00');
INSERT INTO `tbl_dept` VALUES (103, '测试部门', 3, '0', '0', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2020-12-24 10:27:48');
INSERT INTO `tbl_dept` VALUES (104, '财务部门', 4, '0', '0', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00');
INSERT INTO `tbl_dept` VALUES (105, '运维部门', 5, '0', '0', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00');
INSERT INTO `tbl_dept` VALUES (128, 'aaa', 3, '0', NULL, NULL, '2021-12-15 10:51:32', NULL, '2021-12-15 10:51:32');
INSERT INTO `tbl_dept` VALUES (129, 'www', 3, '0', NULL, NULL, '2021-12-15 11:28:12', NULL, '2021-12-15 11:28:12');
INSERT INTO `tbl_dept` VALUES (130, 'wwww', 3, '0', NULL, NULL, '2021-12-15 11:29:33', NULL, '2021-12-15 11:29:33');
INSERT INTO `tbl_dept` VALUES (132, 'hahaha', 3, '0', NULL, 'chenjian', '2021-12-16 11:04:40', NULL, NULL);
INSERT INTO `tbl_dept` VALUES (133, '码农1班', 1, '0', NULL, 'chenjian', '2021-12-16 11:44:24', NULL, NULL);

-- ----------------------------
-- Table structure for tbl_dictionary
-- ----------------------------
DROP TABLE IF EXISTS `tbl_dictionary`;
CREATE TABLE `tbl_dictionary`  (
  `dictionary_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_id` int(11) NOT NULL COMMENT '字典类型,关联字典类型表',
  `dictionary_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '字典名,展示时使用，保存的时候使用主键值',
  `create_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` date NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `update_time` date NULL DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`dictionary_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 119 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tbl_dictionary
-- ----------------------------
INSERT INTO `tbl_dictionary` VALUES (1, 1, '1.化学制剂、肥料', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `tbl_dictionary` VALUES (2, 1, '2.颜料油漆、染料、防腐制品', NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for tbl_dictionary_type
-- ----------------------------
DROP TABLE IF EXISTS `tbl_dictionary_type`;
CREATE TABLE `tbl_dictionary_type`  (
  `type_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '类型ID，自增',
  `type_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '类型名称，非空，唯一',
  `create_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`type_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tbl_dictionary_type
-- ----------------------------
INSERT INTO `tbl_dictionary_type` VALUES (1, '商标分类', 'Enzo', '2020-12-23 11:22:36', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for tbl_log
-- ----------------------------
DROP TABLE IF EXISTS `tbl_log`;
CREATE TABLE `tbl_log`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `login_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '登录名',
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `ip` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'IP地址',
  `class_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '类名',
  `method_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '方法名',
  `params` varchar(9000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '参数',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 214 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tbl_log
-- ----------------------------
INSERT INTO `tbl_log` VALUES (1, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'toShowLog()', '[]', '2021-12-18 15:16:56');
INSERT INTO `tbl_log` VALUES (2, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=null, userName=null, ip=null, className=null, methodName=null, params=null, createTime=null)]', '2021-12-18 15:16:56');
INSERT INTO `tbl_log` VALUES (3, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=chen, userName=null, ip=null, className=null, methodName=, params=null, createTime=null)]', '2021-12-18 15:17:06');
INSERT INTO `tbl_log` VALUES (4, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=chen, userName=null, ip=null, className=null, methodName=, params=null, createTime=null)]', '2021-12-18 15:17:08');
INSERT INTO `tbl_log` VALUES (5, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=chen, userName=null, ip=null, className=null, methodName=, params=null, createTime=null)]', '2021-12-18 15:17:09');
INSERT INTO `tbl_log` VALUES (6, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=chen, userName=null, ip=null, className=null, methodName=, params=null, createTime=null)]', '2021-12-18 15:17:09');
INSERT INTO `tbl_log` VALUES (7, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=chen, userName=null, ip=null, className=null, methodName=, params=null, createTime=null)]', '2021-12-18 15:17:09');
INSERT INTO `tbl_log` VALUES (8, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=chen, userName=null, ip=null, className=null, methodName=, params=null, createTime=null)]', '2021-12-18 15:17:10');
INSERT INTO `tbl_log` VALUES (9, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=chen, userName=null, ip=null, className=null, methodName=, params=null, createTime=null)]', '2021-12-18 15:17:10');
INSERT INTO `tbl_log` VALUES (10, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=chen, userName=null, ip=null, className=null, methodName=, params=null, createTime=null)]', '2021-12-18 15:17:10');
INSERT INTO `tbl_log` VALUES (11, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=chen, userName=null, ip=null, className=null, methodName=, params=null, createTime=null)]', '2021-12-18 15:17:10');
INSERT INTO `tbl_log` VALUES (12, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=chen, userName=null, ip=null, className=null, methodName=, params=null, createTime=null)]', '2021-12-18 15:17:10');
INSERT INTO `tbl_log` VALUES (13, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=, userName=null, ip=null, className=null, methodName=, params=null, createTime=null)]', '2021-12-18 15:17:11');
INSERT INTO `tbl_log` VALUES (14, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=, userName=null, ip=null, className=null, methodName=, params=null, createTime=null)]', '2021-12-18 15:17:12');
INSERT INTO `tbl_log` VALUES (15, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=, userName=null, ip=null, className=null, methodName=, params=null, createTime=null)]', '2021-12-18 15:17:13');
INSERT INTO `tbl_log` VALUES (16, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=, userName=null, ip=null, className=null, methodName=, params=null, createTime=null)]', '2021-12-18 15:17:14');
INSERT INTO `tbl_log` VALUES (17, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=, userName=null, ip=null, className=null, methodName=, params=null, createTime=null)]', '2021-12-18 15:17:14');
INSERT INTO `tbl_log` VALUES (18, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=, userName=null, ip=null, className=null, methodName=, params=null, createTime=null)]', '2021-12-18 15:17:14');
INSERT INTO `tbl_log` VALUES (19, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=, userName=null, ip=null, className=null, methodName=, params=null, createTime=null)]', '2021-12-18 15:17:14');
INSERT INTO `tbl_log` VALUES (20, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'showDept(ModelAndView)', '[ModelAndView [view=[null]; model=null]]', '2021-12-18 15:17:17');
INSERT INTO `tbl_log` VALUES (21, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.DeptController', 'selectAll(Integer,Integer,Dept)', '[5, 1, Dept(deptId=null, deptName=null, orderNum=null, status=null, delFlag=null, createBy=null, createTime=null, updateBy=null, updateTime=null)]', '2021-12-18 15:17:17');
INSERT INTO `tbl_log` VALUES (22, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'showMenu(ModelAndView)', '[ModelAndView [view=[null]; model=null]]', '2021-12-18 15:17:17');
INSERT INTO `tbl_log` VALUES (23, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.MenuController', 'selectAll()', '[]', '2021-12-18 15:17:17');
INSERT INTO `tbl_log` VALUES (24, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'showRole()', '[]', '2021-12-18 15:17:18');
INSERT INTO `tbl_log` VALUES (25, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.RoleController', 'selectAll(Integer,Integer,Role)', '[5, 1, Role(id=null, roleName=null, roleKey=null, roleSort=null, status=null, remark=null, createTime=null, createBy=null, updateBy=null, updateTime=null, flag=0)]', '2021-12-18 15:17:18');
INSERT INTO `tbl_log` VALUES (26, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.RoleController', 'findAllMenu()', '[]', '2021-12-18 15:17:18');
INSERT INTO `tbl_log` VALUES (27, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'showMenu(ModelAndView)', '[ModelAndView [view=[null]; model=null]]', '2021-12-18 15:17:19');
INSERT INTO `tbl_log` VALUES (28, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.MenuController', 'selectAll()', '[]', '2021-12-18 15:17:19');
INSERT INTO `tbl_log` VALUES (29, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'showRole()', '[]', '2021-12-18 15:17:26');
INSERT INTO `tbl_log` VALUES (30, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.RoleController', 'selectAll(Integer,Integer,Role)', '[5, 1, Role(id=null, roleName=null, roleKey=null, roleSort=null, status=null, remark=null, createTime=null, createBy=null, updateBy=null, updateTime=null, flag=0)]', '2021-12-18 15:17:26');
INSERT INTO `tbl_log` VALUES (31, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.RoleController', 'findAllMenu()', '[]', '2021-12-18 15:17:26');
INSERT INTO `tbl_log` VALUES (32, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'showDept(ModelAndView)', '[ModelAndView [view=[null]; model=null]]', '2021-12-18 15:17:26');
INSERT INTO `tbl_log` VALUES (33, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.DeptController', 'selectAll(Integer,Integer,Dept)', '[5, 1, Dept(deptId=null, deptName=null, orderNum=null, status=null, delFlag=null, createBy=null, createTime=null, updateBy=null, updateTime=null)]', '2021-12-18 15:17:27');
INSERT INTO `tbl_log` VALUES (34, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'showMenu(ModelAndView)', '[ModelAndView [view=[null]; model=null]]', '2021-12-18 15:17:30');
INSERT INTO `tbl_log` VALUES (35, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.MenuController', 'selectAll()', '[]', '2021-12-18 15:17:30');
INSERT INTO `tbl_log` VALUES (36, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'showRole()', '[]', '2021-12-18 15:17:31');
INSERT INTO `tbl_log` VALUES (37, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.RoleController', 'selectAll(Integer,Integer,Role)', '[5, 1, Role(id=null, roleName=null, roleKey=null, roleSort=null, status=null, remark=null, createTime=null, createBy=null, updateBy=null, updateTime=null, flag=0)]', '2021-12-18 15:17:31');
INSERT INTO `tbl_log` VALUES (38, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.RoleController', 'findAllMenu()', '[]', '2021-12-18 15:17:31');
INSERT INTO `tbl_log` VALUES (39, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.RoleController', 'insert(Role,List)', '[Role(id=null, roleName=测试人员, roleKey=test, roleSort=3, status=0, remark=测试使用, createTime=null, createBy=陈建, updateBy=null, updateTime=null, flag=0), [1, 109, 1029, 1030, 111, 1026, 5, 1025]]', '2021-12-18 15:18:14');
INSERT INTO `tbl_log` VALUES (40, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.RoleController', 'selectAll(Integer,Integer,Role)', '[5, 1, Role(id=null, roleName=null, roleKey=null, roleSort=null, status=null, remark=null, createTime=null, createBy=null, updateBy=null, updateTime=null, flag=0)]', '2021-12-18 15:18:14');
INSERT INTO `tbl_log` VALUES (41, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'showUser(ModelAndView)', '[ModelAndView [view=[null]; model=null]]', '2021-12-18 15:18:17');
INSERT INTO `tbl_log` VALUES (42, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.UserController', 'selectAll(Integer,Integer,User)', '[1, 5, User(userId=null, deptId=null, loginName=null, userName=null, email=null, phonenumber=null, sex=null, avatar=null, password=null, salt=null, status=null, flag=null, createBy=null, createTime=null, updateBy=null, updateTime=null, remark=null)]', '2021-12-18 15:18:17');
INSERT INTO `tbl_log` VALUES (43, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.RoleController', 'getAllRoleNoPage()', '[]', '2021-12-18 15:18:17');
INSERT INTO `tbl_log` VALUES (44, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.RoleController', 'getAllRoleNoPage()', '[]', '2021-12-18 15:18:17');
INSERT INTO `tbl_log` VALUES (45, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.DeptController', 'getAllDeptNoPage()', '[]', '2021-12-18 15:18:17');
INSERT INTO `tbl_log` VALUES (46, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.UserController', 'insert(User,List)', '[User(userId=null, deptId=101, loginName=tester, userName=张三, email=6587437@qq.com, phonenumber=18538062907, sex=0, avatar=null, password=123456, salt=null, status=0, flag=null, createBy=陈建, createTime=null, updateBy=null, updateTime=null, remark=), [3]]', '2021-12-18 15:18:55');
INSERT INTO `tbl_log` VALUES (47, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.UserController', 'insert(User,List)', '[User(userId=null, deptId=101, loginName=tester, userName=张三, email=6587437@qq.com, phonenumber=18538062907, sex=0, avatar=null, password=123456, salt=null, status=0, flag=null, createBy=陈建, createTime=null, updateBy=null, updateTime=null, remark=), [3]]', '2021-12-18 15:18:57');
INSERT INTO `tbl_log` VALUES (48, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.UserController', 'insert(User,List)', '[User(userId=null, deptId=101, loginName=tester, userName=张三, email=6587437@qq.com, phonenumber=18538062907, sex=0, avatar=null, password=123456, salt=null, status=0, flag=null, createBy=陈建, createTime=null, updateBy=null, updateTime=null, remark=), [3]]', '2021-12-18 15:20:16');
INSERT INTO `tbl_log` VALUES (49, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.UserController', 'insert(User,List)', '[User(userId=null, deptId=101, loginName=tester, userName=张三, email=6587437@qq.com, phonenumber=18538062909, sex=0, avatar=null, password=123456, salt=null, status=0, flag=null, createBy=陈建, createTime=null, updateBy=null, updateTime=null, remark=), [3]]', '2021-12-18 15:20:20');
INSERT INTO `tbl_log` VALUES (50, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.UserController', 'selectAll(Integer,Integer,User)', '[1, 5, User(userId=null, deptId=null, loginName=null, userName=null, email=null, phonenumber=null, sex=null, avatar=null, password=null, salt=null, status=null, flag=null, createBy=null, createTime=null, updateBy=null, updateTime=null, remark=null)]', '2021-12-18 15:20:20');
INSERT INTO `tbl_log` VALUES (51, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'logout()', '[]', '2021-12-18 15:20:25');
INSERT INTO `tbl_log` VALUES (52, NULL, NULL, '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'toLogin()', '[]', '2021-12-18 15:20:25');
INSERT INTO `tbl_log` VALUES (53, NULL, NULL, '127.0.0.1', 'com.cloudwise.controller.UserController', 'login(User)', '[User(userId=null, deptId=null, loginName=tester, userName=null, email=null, phonenumber=null, sex=null, avatar=null, password=123456, salt=null, status=null, flag=null, createBy=null, createTime=null, updateBy=null, updateTime=null, remark=null)]', '2021-12-18 15:20:33');
INSERT INTO `tbl_log` VALUES (54, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'toHome(Integer,ModelAndView)', '[4, ModelAndView [view=[null]; model=null]]', '2021-12-18 15:20:33');
INSERT INTO `tbl_log` VALUES (55, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'toShowLog()', '[]', '2021-12-18 15:20:35');
INSERT INTO `tbl_log` VALUES (56, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.LogController', 'selectAllPage(Long,Long,Log)', '[1, 10, Log(id=null, loginName=null, userName=null, ip=null, className=null, methodName=null, params=null, createTime=null)]', '2021-12-18 15:20:36');
INSERT INTO `tbl_log` VALUES (57, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'toShowQuestion()', '[]', '2021-12-18 15:20:36');
INSERT INTO `tbl_log` VALUES (58, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.QuestionController', 'selectAllPage(Long,Long,Question)', '[1, 10, Question(id=null, question=null, optionA=null, optionB=null, optionC=null, optionD=null, type=null, status=null, createTime=null, createBy=null, updateTime=null, updateBy=null, flag=0)]', '2021-12-18 15:20:37');
INSERT INTO `tbl_log` VALUES (59, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'toShowTester()', '[]', '2021-12-18 15:20:37');
INSERT INTO `tbl_log` VALUES (60, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.TesterController', 'selectAllPage(Long,Long,Tester)', '[1, 10, Tester(id=null, name=null, phone=null, createTime=null)]', '2021-12-18 15:20:37');
INSERT INTO `tbl_log` VALUES (61, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'toMyBigShow()', '[]', '2021-12-18 15:20:37');
INSERT INTO `tbl_log` VALUES (62, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'queryDayPeople()', '[]', '2021-12-18 15:20:38');
INSERT INTO `tbl_log` VALUES (63, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'queryCharacters()', '[]', '2021-12-18 15:20:38');
INSERT INTO `tbl_log` VALUES (64, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'queryCharacters()', '[]', '2021-12-18 15:20:38');
INSERT INTO `tbl_log` VALUES (65, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'optionsNum()', '[]', '2021-12-18 15:20:38');
INSERT INTO `tbl_log` VALUES (66, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:20:38');
INSERT INTO `tbl_log` VALUES (67, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:20:38');
INSERT INTO `tbl_log` VALUES (68, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:20:43');
INSERT INTO `tbl_log` VALUES (69, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:20:43');
INSERT INTO `tbl_log` VALUES (70, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:20:48');
INSERT INTO `tbl_log` VALUES (71, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:20:48');
INSERT INTO `tbl_log` VALUES (72, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:20:53');
INSERT INTO `tbl_log` VALUES (73, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:20:53');
INSERT INTO `tbl_log` VALUES (74, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:20:58');
INSERT INTO `tbl_log` VALUES (75, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:20:58');
INSERT INTO `tbl_log` VALUES (76, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:21:03');
INSERT INTO `tbl_log` VALUES (77, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:21:03');
INSERT INTO `tbl_log` VALUES (78, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:21:08');
INSERT INTO `tbl_log` VALUES (79, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:21:08');
INSERT INTO `tbl_log` VALUES (80, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:21:13');
INSERT INTO `tbl_log` VALUES (81, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:21:13');
INSERT INTO `tbl_log` VALUES (82, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:21:18');
INSERT INTO `tbl_log` VALUES (83, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:21:18');
INSERT INTO `tbl_log` VALUES (84, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:21:23');
INSERT INTO `tbl_log` VALUES (85, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:21:23');
INSERT INTO `tbl_log` VALUES (86, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:21:28');
INSERT INTO `tbl_log` VALUES (87, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:21:28');
INSERT INTO `tbl_log` VALUES (88, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:21:33');
INSERT INTO `tbl_log` VALUES (89, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:21:33');
INSERT INTO `tbl_log` VALUES (90, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:21:38');
INSERT INTO `tbl_log` VALUES (91, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:21:38');
INSERT INTO `tbl_log` VALUES (92, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:21:43');
INSERT INTO `tbl_log` VALUES (93, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:21:43');
INSERT INTO `tbl_log` VALUES (94, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:21:48');
INSERT INTO `tbl_log` VALUES (95, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:21:48');
INSERT INTO `tbl_log` VALUES (96, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:21:53');
INSERT INTO `tbl_log` VALUES (97, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:21:53');
INSERT INTO `tbl_log` VALUES (98, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:21:58');
INSERT INTO `tbl_log` VALUES (99, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:21:58');
INSERT INTO `tbl_log` VALUES (100, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:22:03');
INSERT INTO `tbl_log` VALUES (101, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:22:03');
INSERT INTO `tbl_log` VALUES (102, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:22:08');
INSERT INTO `tbl_log` VALUES (103, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:22:08');
INSERT INTO `tbl_log` VALUES (104, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:22:13');
INSERT INTO `tbl_log` VALUES (105, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:22:13');
INSERT INTO `tbl_log` VALUES (106, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:22:18');
INSERT INTO `tbl_log` VALUES (107, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:22:18');
INSERT INTO `tbl_log` VALUES (108, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:22:23');
INSERT INTO `tbl_log` VALUES (109, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:22:23');
INSERT INTO `tbl_log` VALUES (110, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:22:28');
INSERT INTO `tbl_log` VALUES (111, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:22:28');
INSERT INTO `tbl_log` VALUES (112, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:22:33');
INSERT INTO `tbl_log` VALUES (113, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:22:33');
INSERT INTO `tbl_log` VALUES (114, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:22:38');
INSERT INTO `tbl_log` VALUES (115, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:22:38');
INSERT INTO `tbl_log` VALUES (116, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:22:43');
INSERT INTO `tbl_log` VALUES (117, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:22:43');
INSERT INTO `tbl_log` VALUES (118, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:22:48');
INSERT INTO `tbl_log` VALUES (119, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:22:48');
INSERT INTO `tbl_log` VALUES (120, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:22:53');
INSERT INTO `tbl_log` VALUES (121, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:22:53');
INSERT INTO `tbl_log` VALUES (122, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:22:58');
INSERT INTO `tbl_log` VALUES (123, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:22:58');
INSERT INTO `tbl_log` VALUES (124, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:23:03');
INSERT INTO `tbl_log` VALUES (125, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:23:03');
INSERT INTO `tbl_log` VALUES (126, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:23:08');
INSERT INTO `tbl_log` VALUES (127, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:23:08');
INSERT INTO `tbl_log` VALUES (128, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:23:13');
INSERT INTO `tbl_log` VALUES (129, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:23:13');
INSERT INTO `tbl_log` VALUES (130, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:23:18');
INSERT INTO `tbl_log` VALUES (131, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:23:18');
INSERT INTO `tbl_log` VALUES (132, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:23:23');
INSERT INTO `tbl_log` VALUES (133, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:23:23');
INSERT INTO `tbl_log` VALUES (134, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:23:28');
INSERT INTO `tbl_log` VALUES (135, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:23:28');
INSERT INTO `tbl_log` VALUES (136, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:23:33');
INSERT INTO `tbl_log` VALUES (137, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:23:33');
INSERT INTO `tbl_log` VALUES (138, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:23:38');
INSERT INTO `tbl_log` VALUES (139, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:23:38');
INSERT INTO `tbl_log` VALUES (140, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:23:43');
INSERT INTO `tbl_log` VALUES (141, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:23:43');
INSERT INTO `tbl_log` VALUES (142, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:23:48');
INSERT INTO `tbl_log` VALUES (143, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:23:48');
INSERT INTO `tbl_log` VALUES (144, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:23:53');
INSERT INTO `tbl_log` VALUES (145, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:23:53');
INSERT INTO `tbl_log` VALUES (146, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:23:58');
INSERT INTO `tbl_log` VALUES (147, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:23:58');
INSERT INTO `tbl_log` VALUES (148, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:24:03');
INSERT INTO `tbl_log` VALUES (149, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:24:03');
INSERT INTO `tbl_log` VALUES (150, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:24:08');
INSERT INTO `tbl_log` VALUES (151, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:24:08');
INSERT INTO `tbl_log` VALUES (152, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:24:13');
INSERT INTO `tbl_log` VALUES (153, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:24:13');
INSERT INTO `tbl_log` VALUES (154, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:24:18');
INSERT INTO `tbl_log` VALUES (155, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:24:18');
INSERT INTO `tbl_log` VALUES (156, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-18 15:24:23');
INSERT INTO `tbl_log` VALUES (157, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-18 15:24:23');
INSERT INTO `tbl_log` VALUES (158, 'tester', '张三', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'logout()', '[]', '2021-12-18 15:25:06');
INSERT INTO `tbl_log` VALUES (159, NULL, NULL, '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'toLogin()', '[]', '2021-12-18 15:25:07');
INSERT INTO `tbl_log` VALUES (160, NULL, NULL, '127.0.0.1', 'com.cloudwise.controller.UserController', 'login(User)', '[User(userId=null, deptId=null, loginName=范德萨发, userName=null, email=null, phonenumber=null, sex=null, avatar=null, password= 佛挡杀佛, salt=null, status=null, flag=null, createBy=null, createTime=null, updateBy=null, updateTime=null, remark=null)]', '2021-12-18 15:25:19');
INSERT INTO `tbl_log` VALUES (161, NULL, NULL, '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'toTestLogin()', '[]', '2021-12-18 15:25:33');
INSERT INTO `tbl_log` VALUES (162, NULL, NULL, '192.168.43.1', 'com.cloudwise.controller.ForwardController', 'toTestLogin()', '[]', '2021-12-18 15:28:53');
INSERT INTO `tbl_log` VALUES (163, NULL, NULL, '192.168.43.1', 'com.cloudwise.controller.ForwardController', 'toLogin()', '[]', '2021-12-18 15:28:55');
INSERT INTO `tbl_log` VALUES (164, NULL, NULL, '192.168.43.1', 'com.cloudwise.controller.TesterController', 'insert(Tester)', '[Tester(id=null, name=张天师, phone=18538062907, createTime=null)]', '2021-12-18 15:29:06');
INSERT INTO `tbl_log` VALUES (165, NULL, NULL, '192.168.43.1', 'com.cloudwise.controller.ForwardController', 'toTest(Integer,ModelAndView)', '[269, ModelAndView [view=[null]; model=null]]', '2021-12-18 15:29:06');
INSERT INTO `tbl_log` VALUES (166, NULL, NULL, '192.168.43.1', 'com.cloudwise.controller.ForwardController', 'toLogin()', '[]', '2021-12-18 15:29:06');
INSERT INTO `tbl_log` VALUES (167, NULL, NULL, '192.168.43.1', 'com.cloudwise.controller.ForwardController', 'toLogin()', '[]', '2021-12-18 15:29:06');
INSERT INTO `tbl_log` VALUES (168, NULL, NULL, '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'toLogin()', '[]', '2021-12-18 15:31:12');
INSERT INTO `tbl_log` VALUES (169, NULL, NULL, '127.0.0.1', 'com.cloudwise.controller.UserController', 'login(User)', '[User(userId=null, deptId=null, loginName=chenjian, userName=null, email=null, phonenumber=null, sex=null, avatar=null, password=123456, salt=null, status=null, flag=null, createBy=null, createTime=null, updateBy=null, updateTime=null, remark=null)]', '2021-12-18 15:31:21');
INSERT INTO `tbl_log` VALUES (170, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'toHome(Integer,ModelAndView)', '[1, ModelAndView [view=[null]; model=null]]', '2021-12-18 15:31:21');
INSERT INTO `tbl_log` VALUES (171, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'toShowTester()', '[]', '2021-12-18 15:31:25');
INSERT INTO `tbl_log` VALUES (172, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.TesterController', 'selectAllPage(Long,Long,Tester)', '[1, 10, Tester(id=null, name=null, phone=null, createTime=null)]', '2021-12-18 15:31:26');
INSERT INTO `tbl_log` VALUES (173, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.TesterController', 'selectAllPage(Long,Long,Tester)', '[2, 10, Tester(id=null, name=null, phone=null, createTime=null)]', '2021-12-18 15:31:29');
INSERT INTO `tbl_log` VALUES (174, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.TesterController', 'selectAllPage(Long,Long,Tester)', '[1, 10, Tester(id=null, name=null, phone=null, createTime=null)]', '2021-12-18 15:31:33');
INSERT INTO `tbl_log` VALUES (175, NULL, NULL, '192.168.43.1', 'com.cloudwise.controller.TestResultController', 'saveBatchTestResult(List)', '[[TestResult(id=null, testerId=269, questionId=1, answer=A), TestResult(id=null, testerId=269, questionId=2, answer=A), TestResult(id=null, testerId=269, questionId=3, answer=D), TestResult(id=null, testerId=269, questionId=4, answer=C), TestResult(id=null, testerId=269, questionId=5, answer=B), TestResult(id=null, testerId=269, questionId=6, answer=D), TestResult(id=null, testerId=269, questionId=7, answer=A), TestResult(id=null, testerId=269, questionId=8, answer=A), TestResult(id=null, testerId=269, questionId=9, answer=D), TestResult(id=null, testerId=269, questionId=10, answer=B), TestResult(id=null, testerId=269, questionId=11, answer=C), TestResult(id=null, testerId=269, questionId=12, answer=B), TestResult(id=null, testerId=269, questionId=13, answer=D), TestResult(id=null, testerId=269, questionId=14, answer=C), TestResult(id=null, testerId=269, questionId=15, answer=C), TestResult(id=null, testerId=269, questionId=16, answer=A), TestResult(id=null, testerId=269, questionId=17, answer=D), TestResult(id=null, testerId=269, questionId=18, answer=D), TestResult(id=null, testerId=269, questionId=19, answer=C), TestResult(id=null, testerId=269, questionId=20, answer=B), TestResult(id=null, testerId=269, questionId=21, answer=D), TestResult(id=null, testerId=269, questionId=22, answer=A), TestResult(id=null, testerId=269, questionId=23, answer=D), TestResult(id=null, testerId=269, questionId=24, answer=D), TestResult(id=null, testerId=269, questionId=25, answer=D), TestResult(id=null, testerId=269, questionId=26, answer=D), TestResult(id=null, testerId=269, questionId=27, answer=D), TestResult(id=null, testerId=269, questionId=28, answer=B), TestResult(id=null, testerId=269, questionId=29, answer=C), TestResult(id=null, testerId=269, questionId=30, answer=B), TestResult(id=null, testerId=269, questionId=49, answer=B)]]', '2021-12-18 15:36:30');
INSERT INTO `tbl_log` VALUES (176, NULL, NULL, '192.168.43.1', 'com.cloudwise.controller.ForwardController', 'toLogin()', '[]', '2021-12-18 15:36:31');
INSERT INTO `tbl_log` VALUES (177, NULL, NULL, '192.168.43.1', 'com.cloudwise.controller.ForwardController', 'toResult(Integer)', '[269]', '2021-12-18 15:36:31');
INSERT INTO `tbl_log` VALUES (178, NULL, NULL, '192.168.43.1', 'com.cloudwise.controller.TesterController', 'getTesterVo(Integer)', '[269]', '2021-12-18 15:36:31');
INSERT INTO `tbl_log` VALUES (179, NULL, NULL, '192.168.43.1', 'com.cloudwise.controller.ForwardController', 'toLogin()', '[]', '2021-12-18 15:36:31');
INSERT INTO `tbl_log` VALUES (180, NULL, NULL, '192.168.43.1', 'com.cloudwise.controller.CreateWordController', 'exportWord(WordBean,HttpServletResponse)', 'Too Long Params To Save ', '2021-12-18 15:36:41');
INSERT INTO `tbl_log` VALUES (181, NULL, NULL, '192.168.43.1', 'com.cloudwise.controller.CreateWordController', 'downWord(String,HttpServletResponse)', '[18538062907.docx, org.apache.catalina.connector.ResponseFacade@51bb1ba3]', '2021-12-18 15:36:42');
INSERT INTO `tbl_log` VALUES (182, NULL, NULL, '192.168.43.1', 'com.cloudwise.controller.CreateWordController', 'downWord(String,HttpServletResponse)', '[18538062907.docx, org.apache.catalina.connector.ResponseFacade@51bb1ba3]', '2021-12-18 15:36:46');
INSERT INTO `tbl_log` VALUES (183, NULL, NULL, '192.168.43.1', 'com.cloudwise.controller.CreateWordController', 'exportWord(WordBean,HttpServletResponse)', 'Too Long Params To Save ', '2021-12-18 15:43:44');
INSERT INTO `tbl_log` VALUES (184, NULL, NULL, '192.168.43.1', 'com.cloudwise.controller.MailController', 'sendMail(MailAndFile)', '[MailAndFile(mail=86521760@qq.com, fileName=18538062907.docx)]', '2021-12-18 15:43:44');
INSERT INTO `tbl_log` VALUES (185, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'logout()', '[]', '2021-12-18 15:44:27');
INSERT INTO `tbl_log` VALUES (186, NULL, NULL, '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'toLogin()', '[]', '2021-12-21 15:12:20');
INSERT INTO `tbl_log` VALUES (187, NULL, NULL, '127.0.0.1', 'com.cloudwise.controller.UserController', 'login(User)', '[User(userId=null, deptId=null, loginName=chenjian, userName=null, email=null, phonenumber=null, sex=null, avatar=null, password=123456, salt=null, status=null, flag=null, createBy=null, createTime=null, updateBy=null, updateTime=null, remark=null)]', '2021-12-21 15:12:26');
INSERT INTO `tbl_log` VALUES (188, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'toHome(Integer,ModelAndView)', '[1, ModelAndView [view=[null]; model=null]]', '2021-12-21 15:12:27');
INSERT INTO `tbl_log` VALUES (189, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'toShowTester()', '[]', '2021-12-21 15:12:32');
INSERT INTO `tbl_log` VALUES (190, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.TesterController', 'selectAllPage(Long,Long,Tester)', '[1, 10, Tester(id=null, name=null, phone=null, createTime=null)]', '2021-12-21 15:12:33');
INSERT INTO `tbl_log` VALUES (191, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.ForwardController', 'toMyBigShow()', '[]', '2021-12-21 15:12:39');
INSERT INTO `tbl_log` VALUES (192, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'queryDayPeople()', '[]', '2021-12-21 15:12:39');
INSERT INTO `tbl_log` VALUES (193, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'queryCharacters()', '[]', '2021-12-21 15:12:39');
INSERT INTO `tbl_log` VALUES (194, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-21 15:12:39');
INSERT INTO `tbl_log` VALUES (195, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-21 15:12:39');
INSERT INTO `tbl_log` VALUES (196, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'optionsNum()', '[]', '2021-12-21 15:12:39');
INSERT INTO `tbl_log` VALUES (197, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'queryCharacters()', '[]', '2021-12-21 15:12:39');
INSERT INTO `tbl_log` VALUES (198, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-21 15:12:44');
INSERT INTO `tbl_log` VALUES (199, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-21 15:12:44');
INSERT INTO `tbl_log` VALUES (200, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-21 15:12:49');
INSERT INTO `tbl_log` VALUES (201, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-21 15:12:49');
INSERT INTO `tbl_log` VALUES (202, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-21 15:12:54');
INSERT INTO `tbl_log` VALUES (203, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-21 15:12:54');
INSERT INTO `tbl_log` VALUES (204, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-21 15:12:59');
INSERT INTO `tbl_log` VALUES (205, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-21 15:13:00');
INSERT INTO `tbl_log` VALUES (206, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-21 15:13:04');
INSERT INTO `tbl_log` VALUES (207, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-21 15:13:05');
INSERT INTO `tbl_log` VALUES (208, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-21 15:13:09');
INSERT INTO `tbl_log` VALUES (209, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-21 15:13:10');
INSERT INTO `tbl_log` VALUES (210, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-21 15:13:14');
INSERT INTO `tbl_log` VALUES (211, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-21 15:13:15');
INSERT INTO `tbl_log` VALUES (212, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectNowTesters()', '[]', '2021-12-21 15:13:20');
INSERT INTO `tbl_log` VALUES (213, 'chenjian', '陈建', '127.0.0.1', 'com.cloudwise.controller.BigShowController', 'selectOldTesters()', '[]', '2021-12-21 15:13:21');

-- ----------------------------
-- Table structure for tbl_menu
-- ----------------------------
DROP TABLE IF EXISTS `tbl_menu`;
CREATE TABLE `tbl_menu`  (
  `menu_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `menu_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单名称',
  `parent_id` int(11) NULL DEFAULT 0 COMMENT '父菜单ID',
  `order_num` int(11) NULL DEFAULT 0 COMMENT '显示顺序',
  `url` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '#' COMMENT '请求地址',
  `menu_type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '菜单类型（M目录 C菜单 F按钮）',
  `visible` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '菜单状态（0显示 1隐藏）',
  `perms` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '权限标识',
  `icon` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '#' COMMENT '菜单图标',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1031 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '菜单权限表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tbl_menu
-- ----------------------------
INSERT INTO `tbl_menu` VALUES (1, '性格测试', 0, 2, '#', 'M', '0', '', 'layui-icon layui-icon-user', 'Enzo', '2018-03-16 11:33:00', '陈建', '2021-07-28 17:01:39', '活动管理目录');
INSERT INTO `tbl_menu` VALUES (3, '系统管理', 0, 1, '#', 'M', '0', '', 'layui-icon layui-icon-app', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '系统管理目录');
INSERT INTO `tbl_menu` VALUES (5, '日志监控', 0, 6, '#', 'M', '0', '', 'layui-icon layui-icon-log', '', '2021-01-21 17:46:05', NULL, NULL, '日志监控');
INSERT INTO `tbl_menu` VALUES (100, '用户管理', 3, 1, '/user/toUser', 'C', '0', 'system:user:view', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '用户管理菜单');
INSERT INTO `tbl_menu` VALUES (101, '角色管理', 3, 2, '/role/toRole', 'C', '0', 'system:role:view', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '角色管理菜单');
INSERT INTO `tbl_menu` VALUES (102, '菜单管理', 3, 3, '/menu/toMenu', 'C', '0', 'system:menu:view', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '菜单管理菜单');
INSERT INTO `tbl_menu` VALUES (103, '部门管理', 3, 4, '/dept/toDept', 'C', '0', 'system:dept:view', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '部门管理菜单');
INSERT INTO `tbl_menu` VALUES (109, '题目管理', 1, 1, '/question/toShowQuestion', 'C', '0', 'character:question:view', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '在线用户菜单');
INSERT INTO `tbl_menu` VALUES (111, '测试管理', 1, 2, '/tester/toShowTester', 'C', '0', 'character:tester:view', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '数据监控菜单');
INSERT INTO `tbl_menu` VALUES (1000, '用户查询', 100, 1, '#', 'F', '0', 'system:user:list', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1001, '用户新增', 100, 2, '#', 'F', '0', 'system:user:add', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1002, '用户修改', 100, 3, '#', 'F', '0', 'system:user:edit', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2021-12-18 15:15:21', '用户修改');
INSERT INTO `tbl_menu` VALUES (1003, '用户删除', 100, 4, '#', 'F', '0', 'system:user:remove', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1004, '用户导出', 100, 5, '#', 'F', '0', 'system:user:export', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1005, '重置密码', 100, 6, '#', 'F', '0', 'system:user:resetPwd', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1006, '角色查询', 101, 1, '#', 'F', '0', 'system:role:list', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1007, '角色新增', 101, 2, '#', 'F', '0', 'system:role:add', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1008, '角色修改', 101, 3, '#', 'F', '0', 'system:role:edit', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1009, '角色删除', 101, 4, '#', 'F', '0', 'system:role:remove', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1010, '角色导出', 101, 5, '#', 'F', '0', 'system:role:export', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1011, '菜单查询', 102, 1, '#', 'F', '0', 'system:menu:list', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1012, '菜单新增', 102, 2, '#', 'F', '0', 'system:menu:add', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1013, '菜单修改', 102, 3, '#', 'F', '0', 'system:menu:edit', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1014, '菜单删除', 102, 4, '#', 'F', '0', 'system:menu:remove', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1015, '部门查询', 103, 1, '#', 'F', '0', 'system:dept:list', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1016, '部门新增', 103, 2, '#', 'F', '0', 'system:dept:add', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1017, '部门修改', 103, 3, '#', 'F', '0', 'system:dept:edit', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1018, '部门删除', 103, 4, '#', 'F', '0', 'system:dept:remove', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1025, '操作日志', 5, 1, '/log/toShowLog', 'C', '0', 'character:log:view', '#', 'Enzo', '2021-01-21 17:48:22', '陈建', '2021-01-27 09:42:08', '登陆日志');
INSERT INTO `tbl_menu` VALUES (1026, '报表统计', 1, 3, '/test/toMyBigShow', 'C', '0', 'bbtj', NULL, '陈建', '2021-07-16 09:50:12', NULL, NULL, '统计图');
INSERT INTO `tbl_menu` VALUES (1029, '试题新增', 109, 2, '#', 'F', '0', 'character:question:add', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');
INSERT INTO `tbl_menu` VALUES (1030, '试题删除', 109, 3, '#', 'F', '0', 'character:question:delete', '#', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '');

-- ----------------------------
-- Table structure for tbl_question
-- ----------------------------
DROP TABLE IF EXISTS `tbl_question`;
CREATE TABLE `tbl_question`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '问题编号',
  `question` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `option_a` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `option_b` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `option_c` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `option_d` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `type` int(11) NULL DEFAULT 0 COMMENT '预留字段',
  `status` int(11) NULL DEFAULT 0 COMMENT '状态',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `create_by` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `update_by` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `flag` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 50 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '问题表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tbl_question
-- ----------------------------
INSERT INTO `tbl_question` VALUES (1, '我的人生观是', 'A人生的体验越多越好，所以想法很多，有可能就应该多尝试。', 'B深度比宽度更重要，目标要谨慎，一旦确定就坚持到底。', 'C人生必须有所成。', 'D没必要太辛苦，好好活着就行。', 1, 0, '2021-11-23 11:13:13', 'zhangsan', '2021-12-01 16:08:34', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (2, '如果野外旅行，在下山返回的路线上，我更在乎：', 'A要好玩有趣，不愿重复，所以宁愿走新路线。', 'B要安全稳妥，担心危险，所以宁愿走原路线。', 'C要挑战自我，喜欢冒险，所以宁愿走新路线。', 'D要方便省心，害怕麻烦，所以宁愿走原路线。', 1, 0, '2021-11-23 11:13:13', 'chenjian', '2021-11-23 11:13:13', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (3, '在表达一件事情上，别人认为我：', 'A总是给人感受到强烈印象。', 'B总是表述极其准确。', 'C总能围绕最终目的。', 'D总能让大家很舒服。', 1, 0, '2021-11-23 11:13:13', 'chenjian', '2021-11-23 11:13:13', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (4, '在生命多数时候，我其实更希望：', 'A刺激。', 'B安全。', 'C挑战。', 'D稳定。', 1, 0, '2021-11-23 11:13:13', 'chenjian', '2021-11-23 11:13:13', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (5, '我认为自己在情感上的基本特点是：', 'A情绪多变，情绪波动大。', 'B外表抑制强，但内心起伏大，一旦挫伤难以平复。', 'C感情不拖泥带水，较直接。', 'D天性四平八稳。', 1, 0, '2021-11-23 11:13:13', 'chenjian', '2021-11-23 11:13:13', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (6, '我认为自己除了工作以外，在人生的控制欲上，我：', 'A谈不上控制欲，却有强烈地感染带动他人的欲望，但自控能力不强。', 'B用规则来保持我的自控和对他人的要求。', 'C内心有控制欲，希望别人服从我。', 'D从不愿去管别人，也不愿别人来管我。', 1, 0, '2021-11-23 11:13:13', 'chenjian', '2021-11-23 11:13:13', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (7, '当与情人交往时，我倾向于：', 'A在一起时就要尽情地欢乐，爱意常会溢于言表。', 'B体贴入微关怀细腻，于对方的需求和变化极其敏感。', 'C帮助对方成长是我最大的责任。', 'D迁就顺从的陪伴者和绝佳的聆听着。', 1, 0, '2021-11-23 11:13:13', 'chenjian', '2021-11-23 11:13:13', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (8, '在人际交往时，我：', 'A心态开放，可快速建立起人际关系。', 'B非常审慎缓慢地深入，一旦认为是朋友便会长久。', 'C希望在人际关系中占据主导地位。', 'D顺其自然，不温不火，相对被动。', 1, 0, '2021-11-23 11:13:14', 'chenjian', '2021-11-23 11:13:14', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (9, '我认为自己的为人：', 'A可爱而生机。', 'B深沉而内敛。', 'C果断而自信。', 'D平静而和气。', 1, 0, '2021-11-23 11:13:14', 'chenjian', '2021-11-23 11:13:14', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (10, '我完成任务的方式是：', 'A常赶在最后期限前的一刻完成。', 'B自己精确地做，不麻烦别人。', 'C最快速做完，再找下一个任务。', 'D该怎么做就怎么做，需要时从他人处得到帮忙。', 1, 0, '2021-11-23 11:13:14', 'chenjian', '2021-11-23 11:13:14', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (11, '如果有人深深惹恼我，我：', 'A内心手上，当时认为不可能原谅，但最终常会原谅对方。', 'B如此之深的愤怒无法忘记，同时未来避开那个家伙。', 'C每个人都要为他的错误付出相应的代价，内心期望有机会要狠狠的回应。', 'D尽量不摊牌，因为还不到那个地步。', 1, 0, '2021-11-23 11:13:14', 'chenjian', '2021-11-23 11:13:14', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (12, '在人际关系中，我最在意的是：', 'A欢迎。', 'B理解。', 'C尊敬。', 'D接纳。', 1, 0, '2021-11-23 11:13:14', 'chenjian', '2021-11-23 11:13:14', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (13, '在工作上，我表现出更多的是：', 'A热忱，有很多想法且很多灵性。', 'B完美精准且承诺可靠。', 'C坚强而有推动力。', 'D有耐心且适应性强。', 1, 0, '2021-11-23 11:13:14', 'chenjian', '2021-11-23 11:13:14', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (14, '我过往的老师最有可能对我的评价是：', 'A善于表达和抒发情感。', 'B严格保护自己的私密，有时会显得孤独或不合群。', 'C动作敏捷独立，且喜欢自己做事情。', 'D反应度偏低，比较温和。', 1, 0, '2021-11-23 11:13:14', 'chenjian', '2021-11-23 11:13:14', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (15, '朋友对我的评价最有可能的是：', 'A喜欢对朋友倾诉事情，是开心果。', 'B能提出很多问题，且需要许多精细的解说。', 'C解决问题的高手。', 'D总能多听少说。', 1, 0, '2021-11-23 11:13:14', 'chenjian', '2021-11-23 11:13:14', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (16, '在帮助他人的问题上，我倾向于：', 'A我不主动，但若他来找我，那我一定帮。', 'B值得帮助的人就帮。', 'C无关者何必帮，但我若承诺，必完成。', 'D虽无英雄打虎胆，常有自告奋勇心。', 2, 0, '2021-11-23 11:13:14', 'chenjian', '2021-11-23 11:13:14', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (17, '面对他人对自己的赞美，我的本能反应是：', 'A没有赞美也无所谓，得到了也不至于欣喜。', 'B我无须那些没用的赞美，宁可他们欣赏我的能力。', 'C有点怀疑对方是否认真或立即回避很多人的关注。', 'D能得到赞美，总归是一件令人愉悦的事。', 2, 0, '2021-11-23 11:13:15', 'chenjian', '2021-11-23 11:13:15', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (18, '面对生活的现状，我更倾向于：', 'A外面怎样与我无关，我觉得自己这样还行。', 'B这个世界如果我不进步，别人就会进步，所以我需要不停地前进。', 'C在所有的问题未发生前，就该尽量想好所有的可能性。', 'D每天的生活，只要开心快乐最重要。', 2, 0, '2021-11-23 11:13:15', 'chenjian', '2021-11-23 11:13:15', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (19, '对于规则，我内心的态度是：', 'A不愿违反规则，但可能因为松散而无法达到规则要求。', 'B打破规则，希望由自己来制定规则，而不是遵守规则。', 'C严格遵守规则，且竭尽全力做到规则内的最好。', 'D不喜欢被规则束缚，不按规则出牌，会觉得新鲜有趣。', 2, 0, '2021-11-23 11:13:15', 'chenjian', '2021-11-23 11:13:15', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (20, '我认为自己做事上：', 'A慢条斯理，按部就班，能与周围协调一致。', 'B目标明确，集中精力为实现目标而努力，善于抓住核心。', 'C慎重小心，为做好预防及善后，会尽心操劳。', 'D丰富跃动，灵活反应。', 2, 0, '2021-11-23 11:13:15', 'chenjian', '2021-11-23 11:13:15', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (21, '在面对压力时，我比较倾向于选用：', 'A眼不见为净。', 'B压力越大，抵抗力越大。', 'C在自己的内心慢慢地咀嚼消化压力。', 'D本能地回避压力，避不掉就用各种方法发泄出去。', 2, 0, '2021-11-23 11:13:15', 'chenjian', '2021-11-23 11:13:15', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (22, '当结束一段刻骨铭心的感情时，我会：', 'A日子总要过，时间会冲淡一切。', 'B虽然受伤，但一旦下定决心，就会努力把过去的影子甩掉。', 'C深陷悲伤，在相当长的时间里难以自拔，也不愿再接受新的人。', 'D痛不欲生，需要找朋友倾诉，寻求化解之道。', 2, 0, '2021-11-23 11:13:15', 'chenjian', '2021-11-23 11:13:15', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (23, '面对他人的痛苦倾诉，我回顾自己大多数时候本能上倾?', 'A静静地听，认同对方的感受。', 'B作出判断，痛苦没用，要帮助对方解决问题。', 'C给予分析，帮助他分析，安抚他的情绪。', 'D发表自己的评论意见，与对方的情绪共起落。', 2, 0, '2021-11-23 11:13:15', 'chenjian', '2021-11-23 11:13:15', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (24, '我在以下哪个群体中较感满足？', 'A能心平气和，只要大家达成一致。', 'B能简单扼要有结果地彼此展开充分的辩论。', 'C能就一件事有规则、有条理、有步骤、有章法地详细讨论。', 'D能随意无拘束地、开心地自由谈话。', 2, 0, '2021-11-23 11:13:15', 'chenjian', '2021-11-23 11:13:15', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (25, '我觉得工作：', 'A最好没有压力，让我做我熟悉的工作就不错。', 'B是达成人生目标和成就最重要的途径。', 'C要么不做，要做就做到最好。', 'D如果能将乐趣融合在工作中就太棒了，如果是不喜欢的工作就实在没劲。', 2, 0, '2021-11-23 11:13:15', 'chenjian', '2021-11-23 11:13:15', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (26, '如果我是领导，我内心更希望在部属的心目中，我是：', 'A可以亲近的和善于为他们着想的。', 'B有很强的能力和富有领导力的。', 'C公平公正且足以信赖的。', 'D被他们喜欢并且觉得富有感召力的。', 2, 0, '2021-11-23 11:13:16', 'chenjian', '2021-11-23 11:13:16', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (27, '我希望得到的认同方式是：', 'A有无认同都不要影响我。', 'B精英的认同最重要。', 'C我认同的人或我在乎的人认同即可。', 'D希望大家都能认同我。', 2, 0, '2021-11-23 11:13:16', 'chenjian', '2021-11-23 11:13:16', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (28, '当我还是个孩子时，我：', 'A不太会积极尝试新事物，通常比较喜欢旧有的和熟悉的。', 'B是孩子王，大家经常听我的决定。', 'C害羞见生人，有意识地回避。', 'D调皮可爱，在大部分的情况下是多动且热心的。', 2, 0, '2021-11-23 11:13:16', 'chenjian', '2021-11-23 11:13:16', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (29, '如果我是父母，我也许是：', 'A不愿干涉子女或易被说动的。', 'B严厉的或直接给予方向指点的。', 'C用行动代替语言来表示关爱或高要求的。', 'D愿意陪孩子一起玩，孩子的朋友们所喜欢和欢迎的。', 2, 0, '2021-11-23 11:13:16', 'chenjian', '2021-11-23 11:13:16', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (30, '以下有四组格言，哪组里符合我感觉的数目最多？', 'A最深刻的真理是最简单和最平凡的。', 'B走自己的路，让人家去说吧。', 'C一个不注意小事的人，永远不会成就大事。', 'D与其在死的时候握着一大把钱，还不如活时活得丰富多彩。', 2, 0, '2021-11-23 11:13:16', 'chenjian', '2021-11-23 11:13:16', 'chenjian', 0);
INSERT INTO `tbl_question` VALUES (31, '你喜欢的是谁？', 'A欢迎。', 'B理解。', 'C尊敬。', 'D接纳。', 1, 0, NULL, NULL, NULL, NULL, 1);
INSERT INTO `tbl_question` VALUES (34, '可以添加吗？', '1', '2', '3', '45', 1, 0, '2021-12-06 16:57:44', '陈建', '2021-12-08 10:08:20', '434', 1);
INSERT INTO `tbl_question` VALUES (35, '1111111', '22', '33', '44', '55', 1, 0, '2021-12-06 17:26:37', '6546', NULL, NULL, 1);
INSERT INTO `tbl_question` VALUES (36, '435', '54', '54', '54', '54', 1, 0, '2021-12-07 10:03:23', '54', NULL, NULL, 1);
INSERT INTO `tbl_question` VALUES (37, '5435', '54', '54', '54', '54', 1, 0, '2021-12-07 10:28:33', '54', NULL, NULL, 1);
INSERT INTO `tbl_question` VALUES (38, '54325', '5432', '543', '5342', '543', 1, 0, '2021-12-07 11:16:39', '5454', NULL, NULL, 1);
INSERT INTO `tbl_question` VALUES (39, '114514', 'aaaaaa', 'bbbbbb', 'ccccccc', 'dddddddd', 2, 0, '2021-12-07 16:57:37', 'aaaa', NULL, NULL, 1);
INSERT INTO `tbl_question` VALUES (40, '43534', '545', '45', '54', '54', 1, 0, '2021-12-08 10:02:08', '545', NULL, NULL, 1);
INSERT INTO `tbl_question` VALUES (41, '45325', '54', '54', '54', '54', 1, 0, '2021-12-08 10:07:50', '54', NULL, NULL, 1);
INSERT INTO `tbl_question` VALUES (42, '543', '545', '54', '5454', '54', 1, 0, '2021-12-08 11:12:05', 'chenjian', NULL, NULL, 1);
INSERT INTO `tbl_question` VALUES (43, '325', '54', '54', '54', '54', 1, 0, NULL, NULL, NULL, NULL, 1);
INSERT INTO `tbl_question` VALUES (44, '645656', '756', '65', '65', '55', 1, 0, NULL, NULL, NULL, NULL, 1);
INSERT INTO `tbl_question` VALUES (45, '645656', '756', '65', '65', '55', 1, 0, NULL, NULL, NULL, NULL, 1);
INSERT INTO `tbl_question` VALUES (46, '4435', '54', '54', '54', '54', 1, 0, NULL, NULL, NULL, NULL, 1);
INSERT INTO `tbl_question` VALUES (47, '5555', '55', '5', '5', '5', 1, 0, NULL, NULL, NULL, NULL, 1);
INSERT INTO `tbl_question` VALUES (48, '5435', '54', '54', '54', '54', 1, 0, '2021-12-14 22:02:52', 'chenjian', NULL, NULL, 1);
INSERT INTO `tbl_question` VALUES (49, '5435', '54', '54', '54', '543', 1, 0, '2021-12-15 15:26:56', 'chenjian', NULL, NULL, 0);

-- ----------------------------
-- Table structure for tbl_role
-- ----------------------------
DROP TABLE IF EXISTS `tbl_role`;
CREATE TABLE `tbl_role`  (
  `role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `role_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名称',
  `role_key` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色权限字符串',
  `role_sort` int(11) NOT NULL COMMENT '显示顺序',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色状态（0正常 1停用）',
  `flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色信息表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tbl_role
-- ----------------------------
INSERT INTO `tbl_role` VALUES (1, '管理员', 'admin', 1, '0', '0', 'Enzo', '2018-03-16 11:33:00', 'Enzo', '2018-03-16 11:33:00', '管理员');
INSERT INTO `tbl_role` VALUES (2, '普通角色', 'common', 2, '0', '0', 'Enzo', '2018-03-16 11:33:00', '陈建', '2021-06-22 11:32:18', '普通角色');
INSERT INTO `tbl_role` VALUES (3, '测试人员', 'test', 3, '0', '0', '陈建', '2021-12-18 15:18:14', '', NULL, '测试使用');

-- ----------------------------
-- Table structure for tbl_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `tbl_role_menu`;
CREATE TABLE `tbl_role_menu`  (
  `role_id` int(11) NOT NULL COMMENT '角色ID',
  `menu_id` int(11) NOT NULL COMMENT '菜单ID',
  PRIMARY KEY (`role_id`, `menu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色和菜单关联表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tbl_role_menu
-- ----------------------------
INSERT INTO `tbl_role_menu` VALUES (1, 1);
INSERT INTO `tbl_role_menu` VALUES (1, 2);
INSERT INTO `tbl_role_menu` VALUES (1, 3);
INSERT INTO `tbl_role_menu` VALUES (1, 4);
INSERT INTO `tbl_role_menu` VALUES (1, 5);
INSERT INTO `tbl_role_menu` VALUES (1, 100);
INSERT INTO `tbl_role_menu` VALUES (1, 101);
INSERT INTO `tbl_role_menu` VALUES (1, 102);
INSERT INTO `tbl_role_menu` VALUES (1, 103);
INSERT INTO `tbl_role_menu` VALUES (1, 109);
INSERT INTO `tbl_role_menu` VALUES (1, 111);
INSERT INTO `tbl_role_menu` VALUES (1, 112);
INSERT INTO `tbl_role_menu` VALUES (1, 113);
INSERT INTO `tbl_role_menu` VALUES (1, 114);
INSERT INTO `tbl_role_menu` VALUES (1, 115);
INSERT INTO `tbl_role_menu` VALUES (1, 1000);
INSERT INTO `tbl_role_menu` VALUES (1, 1001);
INSERT INTO `tbl_role_menu` VALUES (1, 1002);
INSERT INTO `tbl_role_menu` VALUES (1, 1003);
INSERT INTO `tbl_role_menu` VALUES (1, 1004);
INSERT INTO `tbl_role_menu` VALUES (1, 1005);
INSERT INTO `tbl_role_menu` VALUES (1, 1006);
INSERT INTO `tbl_role_menu` VALUES (1, 1007);
INSERT INTO `tbl_role_menu` VALUES (1, 1008);
INSERT INTO `tbl_role_menu` VALUES (1, 1009);
INSERT INTO `tbl_role_menu` VALUES (1, 1010);
INSERT INTO `tbl_role_menu` VALUES (1, 1011);
INSERT INTO `tbl_role_menu` VALUES (1, 1012);
INSERT INTO `tbl_role_menu` VALUES (1, 1013);
INSERT INTO `tbl_role_menu` VALUES (1, 1014);
INSERT INTO `tbl_role_menu` VALUES (1, 1015);
INSERT INTO `tbl_role_menu` VALUES (1, 1016);
INSERT INTO `tbl_role_menu` VALUES (1, 1017);
INSERT INTO `tbl_role_menu` VALUES (1, 1018);
INSERT INTO `tbl_role_menu` VALUES (1, 1020);
INSERT INTO `tbl_role_menu` VALUES (1, 1021);
INSERT INTO `tbl_role_menu` VALUES (1, 1022);
INSERT INTO `tbl_role_menu` VALUES (1, 1023);
INSERT INTO `tbl_role_menu` VALUES (1, 1024);
INSERT INTO `tbl_role_menu` VALUES (1, 1025);
INSERT INTO `tbl_role_menu` VALUES (1, 1026);
INSERT INTO `tbl_role_menu` VALUES (1, 1027);
INSERT INTO `tbl_role_menu` VALUES (1, 1028);
INSERT INTO `tbl_role_menu` VALUES (1, 1029);
INSERT INTO `tbl_role_menu` VALUES (1, 1030);
INSERT INTO `tbl_role_menu` VALUES (2, 1);
INSERT INTO `tbl_role_menu` VALUES (2, 109);
INSERT INTO `tbl_role_menu` VALUES (2, 111);
INSERT INTO `tbl_role_menu` VALUES (2, 1026);
INSERT INTO `tbl_role_menu` VALUES (2, 1027);
INSERT INTO `tbl_role_menu` VALUES (2, 1028);
INSERT INTO `tbl_role_menu` VALUES (3, 1);
INSERT INTO `tbl_role_menu` VALUES (3, 5);
INSERT INTO `tbl_role_menu` VALUES (3, 109);
INSERT INTO `tbl_role_menu` VALUES (3, 111);
INSERT INTO `tbl_role_menu` VALUES (3, 1025);
INSERT INTO `tbl_role_menu` VALUES (3, 1026);
INSERT INTO `tbl_role_menu` VALUES (3, 1029);
INSERT INTO `tbl_role_menu` VALUES (3, 1030);

-- ----------------------------
-- Table structure for tbl_test_result
-- ----------------------------
DROP TABLE IF EXISTS `tbl_test_result`;
CREATE TABLE `tbl_test_result`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `tester_id` int(11) NULL DEFAULT NULL COMMENT '测试人员id',
  `question_id` int(11) NULL DEFAULT NULL COMMENT '测试题id',
  `answer` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '题目答案',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 752 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tbl_test_result
-- ----------------------------
INSERT INTO `tbl_test_result` VALUES (1, 215, 1, 'C');
INSERT INTO `tbl_test_result` VALUES (2, 215, 2, 'B');
INSERT INTO `tbl_test_result` VALUES (3, 215, 3, 'B');
INSERT INTO `tbl_test_result` VALUES (4, 215, 4, 'B');
INSERT INTO `tbl_test_result` VALUES (5, 215, 5, 'B');
INSERT INTO `tbl_test_result` VALUES (6, 215, 6, 'A');
INSERT INTO `tbl_test_result` VALUES (7, 215, 7, 'B');
INSERT INTO `tbl_test_result` VALUES (8, 215, 8, 'B');
INSERT INTO `tbl_test_result` VALUES (9, 215, 9, 'B');
INSERT INTO `tbl_test_result` VALUES (10, 215, 10, 'B');
INSERT INTO `tbl_test_result` VALUES (11, 215, 11, 'B');
INSERT INTO `tbl_test_result` VALUES (12, 215, 12, 'B');
INSERT INTO `tbl_test_result` VALUES (13, 215, 13, 'B');
INSERT INTO `tbl_test_result` VALUES (14, 215, 14, 'B');
INSERT INTO `tbl_test_result` VALUES (15, 215, 15, 'B');
INSERT INTO `tbl_test_result` VALUES (16, 215, 16, 'B');
INSERT INTO `tbl_test_result` VALUES (17, 215, 17, 'C');
INSERT INTO `tbl_test_result` VALUES (18, 215, 18, 'C');
INSERT INTO `tbl_test_result` VALUES (19, 215, 19, 'C');
INSERT INTO `tbl_test_result` VALUES (20, 215, 20, 'C');
INSERT INTO `tbl_test_result` VALUES (21, 215, 21, 'C');
INSERT INTO `tbl_test_result` VALUES (22, 215, 22, 'C');
INSERT INTO `tbl_test_result` VALUES (23, 215, 23, 'C');
INSERT INTO `tbl_test_result` VALUES (24, 215, 24, 'C');
INSERT INTO `tbl_test_result` VALUES (25, 215, 25, 'C');
INSERT INTO `tbl_test_result` VALUES (26, 215, 26, 'C');
INSERT INTO `tbl_test_result` VALUES (27, 215, 27, 'A');
INSERT INTO `tbl_test_result` VALUES (28, 215, 28, 'A');
INSERT INTO `tbl_test_result` VALUES (29, 215, 29, 'A');
INSERT INTO `tbl_test_result` VALUES (30, 215, 30, 'A');
INSERT INTO `tbl_test_result` VALUES (31, 216, 1, 'B');
INSERT INTO `tbl_test_result` VALUES (32, 216, 2, 'B');
INSERT INTO `tbl_test_result` VALUES (33, 216, 3, 'B');
INSERT INTO `tbl_test_result` VALUES (34, 216, 4, 'B');
INSERT INTO `tbl_test_result` VALUES (35, 216, 5, 'B');
INSERT INTO `tbl_test_result` VALUES (36, 216, 6, 'A');
INSERT INTO `tbl_test_result` VALUES (37, 216, 7, 'B');
INSERT INTO `tbl_test_result` VALUES (38, 216, 8, 'B');
INSERT INTO `tbl_test_result` VALUES (39, 216, 9, 'B');
INSERT INTO `tbl_test_result` VALUES (40, 216, 10, 'B');
INSERT INTO `tbl_test_result` VALUES (41, 216, 11, 'B');
INSERT INTO `tbl_test_result` VALUES (42, 216, 12, 'B');
INSERT INTO `tbl_test_result` VALUES (43, 216, 13, 'B');
INSERT INTO `tbl_test_result` VALUES (44, 216, 14, 'B');
INSERT INTO `tbl_test_result` VALUES (45, 216, 15, 'B');
INSERT INTO `tbl_test_result` VALUES (46, 216, 16, 'B');
INSERT INTO `tbl_test_result` VALUES (47, 216, 17, 'B');
INSERT INTO `tbl_test_result` VALUES (48, 216, 18, 'B');
INSERT INTO `tbl_test_result` VALUES (49, 216, 19, 'B');
INSERT INTO `tbl_test_result` VALUES (50, 216, 20, 'B');
INSERT INTO `tbl_test_result` VALUES (51, 216, 21, 'B');
INSERT INTO `tbl_test_result` VALUES (52, 216, 22, 'B');
INSERT INTO `tbl_test_result` VALUES (53, 216, 23, 'B');
INSERT INTO `tbl_test_result` VALUES (54, 216, 24, 'B');
INSERT INTO `tbl_test_result` VALUES (55, 216, 25, 'B');
INSERT INTO `tbl_test_result` VALUES (56, 216, 26, 'B');
INSERT INTO `tbl_test_result` VALUES (57, 216, 27, 'B');
INSERT INTO `tbl_test_result` VALUES (58, 216, 28, 'B');
INSERT INTO `tbl_test_result` VALUES (59, 216, 29, 'B');
INSERT INTO `tbl_test_result` VALUES (60, 216, 30, 'B');
INSERT INTO `tbl_test_result` VALUES (61, 217, 1, 'B');
INSERT INTO `tbl_test_result` VALUES (62, 217, 2, 'B');
INSERT INTO `tbl_test_result` VALUES (63, 217, 3, 'C');
INSERT INTO `tbl_test_result` VALUES (64, 217, 4, 'D');
INSERT INTO `tbl_test_result` VALUES (65, 217, 5, 'C');
INSERT INTO `tbl_test_result` VALUES (66, 217, 6, 'A');
INSERT INTO `tbl_test_result` VALUES (67, 217, 7, 'C');
INSERT INTO `tbl_test_result` VALUES (68, 217, 8, 'C');
INSERT INTO `tbl_test_result` VALUES (69, 217, 9, 'C');
INSERT INTO `tbl_test_result` VALUES (70, 217, 10, 'C');
INSERT INTO `tbl_test_result` VALUES (71, 217, 11, 'C');
INSERT INTO `tbl_test_result` VALUES (72, 217, 12, 'C');
INSERT INTO `tbl_test_result` VALUES (73, 217, 13, 'C');
INSERT INTO `tbl_test_result` VALUES (74, 217, 14, 'C');
INSERT INTO `tbl_test_result` VALUES (75, 217, 15, 'C');
INSERT INTO `tbl_test_result` VALUES (76, 217, 16, 'C');
INSERT INTO `tbl_test_result` VALUES (77, 217, 17, 'C');
INSERT INTO `tbl_test_result` VALUES (78, 217, 18, 'C');
INSERT INTO `tbl_test_result` VALUES (79, 217, 19, 'C');
INSERT INTO `tbl_test_result` VALUES (80, 217, 20, 'C');
INSERT INTO `tbl_test_result` VALUES (81, 217, 21, 'C');
INSERT INTO `tbl_test_result` VALUES (82, 217, 22, 'C');
INSERT INTO `tbl_test_result` VALUES (83, 217, 23, 'C');
INSERT INTO `tbl_test_result` VALUES (84, 217, 24, 'C');
INSERT INTO `tbl_test_result` VALUES (85, 217, 25, 'C');
INSERT INTO `tbl_test_result` VALUES (86, 217, 26, 'C');
INSERT INTO `tbl_test_result` VALUES (87, 217, 27, 'C');
INSERT INTO `tbl_test_result` VALUES (88, 217, 28, 'C');
INSERT INTO `tbl_test_result` VALUES (89, 217, 29, 'C');
INSERT INTO `tbl_test_result` VALUES (90, 217, 30, 'C');
INSERT INTO `tbl_test_result` VALUES (91, 222, 1, 'D');
INSERT INTO `tbl_test_result` VALUES (92, 222, 2, 'D');
INSERT INTO `tbl_test_result` VALUES (93, 222, 3, 'D');
INSERT INTO `tbl_test_result` VALUES (94, 222, 4, 'B');
INSERT INTO `tbl_test_result` VALUES (95, 222, 5, 'B');
INSERT INTO `tbl_test_result` VALUES (96, 222, 6, 'C');
INSERT INTO `tbl_test_result` VALUES (97, 222, 7, 'D');
INSERT INTO `tbl_test_result` VALUES (98, 222, 8, 'A');
INSERT INTO `tbl_test_result` VALUES (99, 222, 9, 'A');
INSERT INTO `tbl_test_result` VALUES (100, 222, 10, 'C');
INSERT INTO `tbl_test_result` VALUES (101, 222, 11, 'C');
INSERT INTO `tbl_test_result` VALUES (102, 222, 12, 'C');
INSERT INTO `tbl_test_result` VALUES (103, 222, 13, 'C');
INSERT INTO `tbl_test_result` VALUES (104, 222, 14, 'C');
INSERT INTO `tbl_test_result` VALUES (105, 222, 15, 'A');
INSERT INTO `tbl_test_result` VALUES (106, 222, 16, 'B');
INSERT INTO `tbl_test_result` VALUES (107, 222, 17, 'A');
INSERT INTO `tbl_test_result` VALUES (108, 222, 18, 'A');
INSERT INTO `tbl_test_result` VALUES (109, 222, 19, 'A');
INSERT INTO `tbl_test_result` VALUES (110, 222, 20, 'D');
INSERT INTO `tbl_test_result` VALUES (111, 222, 21, 'B');
INSERT INTO `tbl_test_result` VALUES (112, 222, 22, 'A');
INSERT INTO `tbl_test_result` VALUES (113, 222, 23, 'B');
INSERT INTO `tbl_test_result` VALUES (114, 222, 24, 'D');
INSERT INTO `tbl_test_result` VALUES (115, 222, 25, 'A');
INSERT INTO `tbl_test_result` VALUES (116, 222, 26, 'C');
INSERT INTO `tbl_test_result` VALUES (117, 222, 27, 'D');
INSERT INTO `tbl_test_result` VALUES (118, 222, 28, 'A');
INSERT INTO `tbl_test_result` VALUES (119, 222, 29, 'B');
INSERT INTO `tbl_test_result` VALUES (120, 222, 30, 'C');
INSERT INTO `tbl_test_result` VALUES (121, 223, 1, 'B');
INSERT INTO `tbl_test_result` VALUES (122, 223, 2, 'B');
INSERT INTO `tbl_test_result` VALUES (123, 223, 3, 'C');
INSERT INTO `tbl_test_result` VALUES (124, 223, 4, 'C');
INSERT INTO `tbl_test_result` VALUES (125, 223, 5, 'C');
INSERT INTO `tbl_test_result` VALUES (126, 223, 6, 'B');
INSERT INTO `tbl_test_result` VALUES (127, 223, 7, 'C');
INSERT INTO `tbl_test_result` VALUES (128, 223, 8, 'A');
INSERT INTO `tbl_test_result` VALUES (129, 223, 9, 'B');
INSERT INTO `tbl_test_result` VALUES (130, 223, 10, 'C');
INSERT INTO `tbl_test_result` VALUES (131, 223, 11, 'B');
INSERT INTO `tbl_test_result` VALUES (132, 223, 12, 'C');
INSERT INTO `tbl_test_result` VALUES (133, 223, 13, 'B');
INSERT INTO `tbl_test_result` VALUES (134, 223, 14, 'A');
INSERT INTO `tbl_test_result` VALUES (135, 223, 15, 'B');
INSERT INTO `tbl_test_result` VALUES (136, 223, 16, 'A');
INSERT INTO `tbl_test_result` VALUES (137, 223, 17, 'B');
INSERT INTO `tbl_test_result` VALUES (138, 223, 18, 'C');
INSERT INTO `tbl_test_result` VALUES (139, 223, 19, 'D');
INSERT INTO `tbl_test_result` VALUES (140, 223, 20, 'C');
INSERT INTO `tbl_test_result` VALUES (141, 223, 21, 'B');
INSERT INTO `tbl_test_result` VALUES (142, 223, 22, 'B');
INSERT INTO `tbl_test_result` VALUES (143, 223, 23, 'C');
INSERT INTO `tbl_test_result` VALUES (144, 223, 24, 'D');
INSERT INTO `tbl_test_result` VALUES (145, 223, 25, 'B');
INSERT INTO `tbl_test_result` VALUES (146, 223, 26, 'B');
INSERT INTO `tbl_test_result` VALUES (147, 223, 27, 'B');
INSERT INTO `tbl_test_result` VALUES (148, 223, 28, 'B');
INSERT INTO `tbl_test_result` VALUES (149, 223, 29, 'C');
INSERT INTO `tbl_test_result` VALUES (150, 223, 30, 'B');
INSERT INTO `tbl_test_result` VALUES (151, 227, 1, 'B');
INSERT INTO `tbl_test_result` VALUES (152, 227, 2, 'B');
INSERT INTO `tbl_test_result` VALUES (153, 227, 3, 'B');
INSERT INTO `tbl_test_result` VALUES (154, 227, 4, 'B');
INSERT INTO `tbl_test_result` VALUES (155, 227, 5, 'B');
INSERT INTO `tbl_test_result` VALUES (156, 227, 6, 'A');
INSERT INTO `tbl_test_result` VALUES (157, 227, 7, 'B');
INSERT INTO `tbl_test_result` VALUES (158, 227, 8, 'B');
INSERT INTO `tbl_test_result` VALUES (159, 227, 9, 'B');
INSERT INTO `tbl_test_result` VALUES (160, 227, 10, 'B');
INSERT INTO `tbl_test_result` VALUES (161, 227, 11, 'B');
INSERT INTO `tbl_test_result` VALUES (162, 227, 12, 'B');
INSERT INTO `tbl_test_result` VALUES (163, 227, 13, 'B');
INSERT INTO `tbl_test_result` VALUES (164, 227, 14, 'B');
INSERT INTO `tbl_test_result` VALUES (165, 227, 15, 'B');
INSERT INTO `tbl_test_result` VALUES (166, 227, 16, 'B');
INSERT INTO `tbl_test_result` VALUES (167, 227, 17, 'B');
INSERT INTO `tbl_test_result` VALUES (168, 227, 18, 'B');
INSERT INTO `tbl_test_result` VALUES (169, 227, 19, 'B');
INSERT INTO `tbl_test_result` VALUES (170, 227, 20, 'B');
INSERT INTO `tbl_test_result` VALUES (171, 227, 21, 'B');
INSERT INTO `tbl_test_result` VALUES (172, 227, 22, 'B');
INSERT INTO `tbl_test_result` VALUES (173, 227, 23, 'B');
INSERT INTO `tbl_test_result` VALUES (174, 227, 24, 'B');
INSERT INTO `tbl_test_result` VALUES (175, 227, 25, 'B');
INSERT INTO `tbl_test_result` VALUES (176, 227, 26, 'B');
INSERT INTO `tbl_test_result` VALUES (177, 227, 27, 'B');
INSERT INTO `tbl_test_result` VALUES (178, 227, 28, 'B');
INSERT INTO `tbl_test_result` VALUES (179, 227, 29, 'B');
INSERT INTO `tbl_test_result` VALUES (180, 227, 30, 'B');
INSERT INTO `tbl_test_result` VALUES (211, 221, 1, 'D');
INSERT INTO `tbl_test_result` VALUES (212, 221, 2, 'D');
INSERT INTO `tbl_test_result` VALUES (213, 221, 3, 'D');
INSERT INTO `tbl_test_result` VALUES (214, 221, 4, 'D');
INSERT INTO `tbl_test_result` VALUES (215, 221, 5, 'B');
INSERT INTO `tbl_test_result` VALUES (216, 221, 6, 'A');
INSERT INTO `tbl_test_result` VALUES (217, 221, 7, 'D');
INSERT INTO `tbl_test_result` VALUES (218, 221, 8, 'B');
INSERT INTO `tbl_test_result` VALUES (219, 221, 9, 'B');
INSERT INTO `tbl_test_result` VALUES (220, 221, 10, 'A');
INSERT INTO `tbl_test_result` VALUES (221, 221, 11, 'C');
INSERT INTO `tbl_test_result` VALUES (222, 221, 12, 'B');
INSERT INTO `tbl_test_result` VALUES (223, 221, 13, 'A');
INSERT INTO `tbl_test_result` VALUES (224, 221, 14, 'B');
INSERT INTO `tbl_test_result` VALUES (225, 221, 15, 'B');
INSERT INTO `tbl_test_result` VALUES (226, 221, 16, 'A');
INSERT INTO `tbl_test_result` VALUES (227, 221, 17, 'D');
INSERT INTO `tbl_test_result` VALUES (228, 221, 18, 'D');
INSERT INTO `tbl_test_result` VALUES (229, 221, 19, 'A');
INSERT INTO `tbl_test_result` VALUES (230, 221, 20, 'B');
INSERT INTO `tbl_test_result` VALUES (231, 221, 21, 'D');
INSERT INTO `tbl_test_result` VALUES (232, 221, 22, 'B');
INSERT INTO `tbl_test_result` VALUES (233, 221, 23, 'D');
INSERT INTO `tbl_test_result` VALUES (234, 221, 24, 'C');
INSERT INTO `tbl_test_result` VALUES (235, 221, 25, 'D');
INSERT INTO `tbl_test_result` VALUES (236, 221, 26, 'D');
INSERT INTO `tbl_test_result` VALUES (237, 221, 27, 'D');
INSERT INTO `tbl_test_result` VALUES (238, 221, 28, 'A');
INSERT INTO `tbl_test_result` VALUES (239, 221, 29, 'D');
INSERT INTO `tbl_test_result` VALUES (240, 221, 30, 'D');
INSERT INTO `tbl_test_result` VALUES (271, 225, 1, 'C');
INSERT INTO `tbl_test_result` VALUES (272, 225, 2, 'B');
INSERT INTO `tbl_test_result` VALUES (273, 225, 3, 'C');
INSERT INTO `tbl_test_result` VALUES (274, 225, 4, 'B');
INSERT INTO `tbl_test_result` VALUES (275, 225, 5, 'B');
INSERT INTO `tbl_test_result` VALUES (276, 225, 6, 'B');
INSERT INTO `tbl_test_result` VALUES (277, 225, 7, 'D');
INSERT INTO `tbl_test_result` VALUES (278, 225, 8, 'D');
INSERT INTO `tbl_test_result` VALUES (279, 225, 9, 'B');
INSERT INTO `tbl_test_result` VALUES (280, 225, 10, 'B');
INSERT INTO `tbl_test_result` VALUES (281, 225, 11, 'A');
INSERT INTO `tbl_test_result` VALUES (282, 225, 12, 'A');
INSERT INTO `tbl_test_result` VALUES (283, 225, 13, 'D');
INSERT INTO `tbl_test_result` VALUES (284, 225, 14, 'B');
INSERT INTO `tbl_test_result` VALUES (285, 225, 15, 'D');
INSERT INTO `tbl_test_result` VALUES (286, 225, 16, 'A');
INSERT INTO `tbl_test_result` VALUES (287, 225, 17, 'D');
INSERT INTO `tbl_test_result` VALUES (288, 225, 18, 'C');
INSERT INTO `tbl_test_result` VALUES (289, 225, 19, 'A');
INSERT INTO `tbl_test_result` VALUES (290, 225, 20, 'C');
INSERT INTO `tbl_test_result` VALUES (291, 225, 21, 'B');
INSERT INTO `tbl_test_result` VALUES (292, 225, 22, 'D');
INSERT INTO `tbl_test_result` VALUES (293, 225, 23, 'A');
INSERT INTO `tbl_test_result` VALUES (294, 225, 24, 'A');
INSERT INTO `tbl_test_result` VALUES (295, 225, 25, 'A');
INSERT INTO `tbl_test_result` VALUES (296, 225, 26, 'D');
INSERT INTO `tbl_test_result` VALUES (297, 225, 27, 'D');
INSERT INTO `tbl_test_result` VALUES (298, 225, 28, 'C');
INSERT INTO `tbl_test_result` VALUES (299, 225, 29, 'A');
INSERT INTO `tbl_test_result` VALUES (300, 225, 30, 'A');
INSERT INTO `tbl_test_result` VALUES (301, 224, 1, 'A');
INSERT INTO `tbl_test_result` VALUES (302, 224, 2, 'B');
INSERT INTO `tbl_test_result` VALUES (303, 224, 3, 'C');
INSERT INTO `tbl_test_result` VALUES (304, 224, 4, 'B');
INSERT INTO `tbl_test_result` VALUES (305, 224, 5, 'D');
INSERT INTO `tbl_test_result` VALUES (306, 224, 6, 'A');
INSERT INTO `tbl_test_result` VALUES (307, 224, 7, 'C');
INSERT INTO `tbl_test_result` VALUES (308, 224, 8, 'A');
INSERT INTO `tbl_test_result` VALUES (309, 224, 9, 'B');
INSERT INTO `tbl_test_result` VALUES (310, 224, 10, 'D');
INSERT INTO `tbl_test_result` VALUES (311, 224, 11, 'A');
INSERT INTO `tbl_test_result` VALUES (312, 224, 12, 'C');
INSERT INTO `tbl_test_result` VALUES (313, 224, 13, 'D');
INSERT INTO `tbl_test_result` VALUES (314, 224, 14, 'A');
INSERT INTO `tbl_test_result` VALUES (315, 224, 15, 'D');
INSERT INTO `tbl_test_result` VALUES (316, 224, 16, 'B');
INSERT INTO `tbl_test_result` VALUES (317, 224, 17, 'D');
INSERT INTO `tbl_test_result` VALUES (318, 224, 18, 'B');
INSERT INTO `tbl_test_result` VALUES (319, 224, 19, 'A');
INSERT INTO `tbl_test_result` VALUES (320, 224, 20, 'C');
INSERT INTO `tbl_test_result` VALUES (321, 224, 21, 'C');
INSERT INTO `tbl_test_result` VALUES (322, 224, 22, 'A');
INSERT INTO `tbl_test_result` VALUES (323, 224, 23, 'A');
INSERT INTO `tbl_test_result` VALUES (324, 224, 24, 'A');
INSERT INTO `tbl_test_result` VALUES (325, 224, 25, 'B');
INSERT INTO `tbl_test_result` VALUES (326, 224, 26, 'C');
INSERT INTO `tbl_test_result` VALUES (327, 224, 27, 'C');
INSERT INTO `tbl_test_result` VALUES (328, 224, 28, 'D');
INSERT INTO `tbl_test_result` VALUES (329, 224, 29, 'D');
INSERT INTO `tbl_test_result` VALUES (330, 224, 30, 'A');
INSERT INTO `tbl_test_result` VALUES (331, 219, 1, 'A');
INSERT INTO `tbl_test_result` VALUES (332, 219, 2, 'A');
INSERT INTO `tbl_test_result` VALUES (333, 219, 3, 'D');
INSERT INTO `tbl_test_result` VALUES (334, 219, 4, 'B');
INSERT INTO `tbl_test_result` VALUES (335, 219, 5, 'B');
INSERT INTO `tbl_test_result` VALUES (336, 219, 6, 'A');
INSERT INTO `tbl_test_result` VALUES (337, 219, 7, 'C');
INSERT INTO `tbl_test_result` VALUES (338, 219, 8, 'A');
INSERT INTO `tbl_test_result` VALUES (339, 219, 9, 'B');
INSERT INTO `tbl_test_result` VALUES (340, 219, 10, 'B');
INSERT INTO `tbl_test_result` VALUES (341, 219, 11, 'A');
INSERT INTO `tbl_test_result` VALUES (342, 219, 12, 'B');
INSERT INTO `tbl_test_result` VALUES (343, 219, 13, 'C');
INSERT INTO `tbl_test_result` VALUES (344, 219, 14, 'C');
INSERT INTO `tbl_test_result` VALUES (345, 219, 15, 'C');
INSERT INTO `tbl_test_result` VALUES (346, 219, 16, 'A');
INSERT INTO `tbl_test_result` VALUES (347, 219, 17, 'B');
INSERT INTO `tbl_test_result` VALUES (348, 219, 18, 'B');
INSERT INTO `tbl_test_result` VALUES (349, 219, 19, 'D');
INSERT INTO `tbl_test_result` VALUES (350, 219, 20, 'A');
INSERT INTO `tbl_test_result` VALUES (351, 219, 21, 'C');
INSERT INTO `tbl_test_result` VALUES (352, 219, 22, 'A');
INSERT INTO `tbl_test_result` VALUES (353, 219, 23, 'C');
INSERT INTO `tbl_test_result` VALUES (354, 219, 24, 'D');
INSERT INTO `tbl_test_result` VALUES (355, 219, 25, 'C');
INSERT INTO `tbl_test_result` VALUES (356, 219, 26, 'C');
INSERT INTO `tbl_test_result` VALUES (357, 219, 27, 'C');
INSERT INTO `tbl_test_result` VALUES (358, 219, 28, 'B');
INSERT INTO `tbl_test_result` VALUES (359, 219, 29, 'C');
INSERT INTO `tbl_test_result` VALUES (360, 219, 30, 'C');
INSERT INTO `tbl_test_result` VALUES (361, 232, 1, 'A');
INSERT INTO `tbl_test_result` VALUES (362, 232, 2, 'B');
INSERT INTO `tbl_test_result` VALUES (363, 232, 3, 'A');
INSERT INTO `tbl_test_result` VALUES (364, 232, 4, 'A');
INSERT INTO `tbl_test_result` VALUES (365, 232, 5, 'A');
INSERT INTO `tbl_test_result` VALUES (366, 232, 6, 'A');
INSERT INTO `tbl_test_result` VALUES (367, 232, 7, 'A');
INSERT INTO `tbl_test_result` VALUES (368, 232, 8, 'A');
INSERT INTO `tbl_test_result` VALUES (369, 232, 9, 'A');
INSERT INTO `tbl_test_result` VALUES (370, 232, 10, 'A');
INSERT INTO `tbl_test_result` VALUES (371, 232, 11, 'A');
INSERT INTO `tbl_test_result` VALUES (372, 232, 12, 'A');
INSERT INTO `tbl_test_result` VALUES (373, 232, 13, 'A');
INSERT INTO `tbl_test_result` VALUES (374, 232, 14, 'A');
INSERT INTO `tbl_test_result` VALUES (375, 232, 15, 'A');
INSERT INTO `tbl_test_result` VALUES (376, 232, 16, 'A');
INSERT INTO `tbl_test_result` VALUES (377, 232, 17, 'A');
INSERT INTO `tbl_test_result` VALUES (378, 232, 18, 'A');
INSERT INTO `tbl_test_result` VALUES (379, 232, 19, 'A');
INSERT INTO `tbl_test_result` VALUES (380, 232, 20, 'A');
INSERT INTO `tbl_test_result` VALUES (381, 232, 21, 'A');
INSERT INTO `tbl_test_result` VALUES (382, 232, 22, 'A');
INSERT INTO `tbl_test_result` VALUES (383, 232, 23, 'A');
INSERT INTO `tbl_test_result` VALUES (384, 232, 24, 'A');
INSERT INTO `tbl_test_result` VALUES (385, 232, 25, 'A');
INSERT INTO `tbl_test_result` VALUES (386, 232, 26, 'A');
INSERT INTO `tbl_test_result` VALUES (387, 232, 27, 'A');
INSERT INTO `tbl_test_result` VALUES (388, 232, 28, 'A');
INSERT INTO `tbl_test_result` VALUES (389, 232, 29, 'A');
INSERT INTO `tbl_test_result` VALUES (390, 232, 30, 'A');
INSERT INTO `tbl_test_result` VALUES (391, 218, 1, 'B');
INSERT INTO `tbl_test_result` VALUES (392, 218, 2, 'A');
INSERT INTO `tbl_test_result` VALUES (393, 218, 3, 'B');
INSERT INTO `tbl_test_result` VALUES (394, 218, 4, 'D');
INSERT INTO `tbl_test_result` VALUES (395, 218, 5, 'D');
INSERT INTO `tbl_test_result` VALUES (396, 218, 6, 'D');
INSERT INTO `tbl_test_result` VALUES (397, 218, 7, 'B');
INSERT INTO `tbl_test_result` VALUES (398, 218, 8, 'D');
INSERT INTO `tbl_test_result` VALUES (399, 218, 9, 'D');
INSERT INTO `tbl_test_result` VALUES (400, 218, 10, 'D');
INSERT INTO `tbl_test_result` VALUES (401, 218, 11, 'B');
INSERT INTO `tbl_test_result` VALUES (402, 218, 12, 'B');
INSERT INTO `tbl_test_result` VALUES (403, 218, 13, 'D');
INSERT INTO `tbl_test_result` VALUES (404, 218, 14, 'C');
INSERT INTO `tbl_test_result` VALUES (405, 218, 15, 'D');
INSERT INTO `tbl_test_result` VALUES (406, 218, 16, 'A');
INSERT INTO `tbl_test_result` VALUES (407, 218, 17, 'D');
INSERT INTO `tbl_test_result` VALUES (408, 218, 18, 'C');
INSERT INTO `tbl_test_result` VALUES (409, 218, 19, 'C');
INSERT INTO `tbl_test_result` VALUES (410, 218, 20, 'A');
INSERT INTO `tbl_test_result` VALUES (411, 218, 21, 'D');
INSERT INTO `tbl_test_result` VALUES (412, 218, 22, 'B');
INSERT INTO `tbl_test_result` VALUES (413, 218, 23, 'A');
INSERT INTO `tbl_test_result` VALUES (414, 218, 24, 'B');
INSERT INTO `tbl_test_result` VALUES (415, 218, 25, 'C');
INSERT INTO `tbl_test_result` VALUES (416, 218, 26, 'C');
INSERT INTO `tbl_test_result` VALUES (417, 218, 27, 'A');
INSERT INTO `tbl_test_result` VALUES (418, 218, 28, 'A');
INSERT INTO `tbl_test_result` VALUES (419, 218, 29, 'D');
INSERT INTO `tbl_test_result` VALUES (420, 218, 30, 'B');
INSERT INTO `tbl_test_result` VALUES (421, 220, 1, 'A');
INSERT INTO `tbl_test_result` VALUES (422, 220, 2, 'A');
INSERT INTO `tbl_test_result` VALUES (423, 220, 3, 'D');
INSERT INTO `tbl_test_result` VALUES (424, 220, 4, 'B');
INSERT INTO `tbl_test_result` VALUES (425, 220, 5, 'A');
INSERT INTO `tbl_test_result` VALUES (426, 220, 6, 'A');
INSERT INTO `tbl_test_result` VALUES (427, 220, 7, 'A');
INSERT INTO `tbl_test_result` VALUES (428, 220, 8, 'A');
INSERT INTO `tbl_test_result` VALUES (429, 220, 9, 'B');
INSERT INTO `tbl_test_result` VALUES (430, 220, 10, 'A');
INSERT INTO `tbl_test_result` VALUES (431, 220, 11, 'A');
INSERT INTO `tbl_test_result` VALUES (432, 220, 12, 'B');
INSERT INTO `tbl_test_result` VALUES (433, 220, 13, 'A');
INSERT INTO `tbl_test_result` VALUES (434, 220, 14, 'A');
INSERT INTO `tbl_test_result` VALUES (435, 220, 15, 'B');
INSERT INTO `tbl_test_result` VALUES (436, 220, 16, 'B');
INSERT INTO `tbl_test_result` VALUES (437, 220, 17, 'D');
INSERT INTO `tbl_test_result` VALUES (438, 220, 18, 'C');
INSERT INTO `tbl_test_result` VALUES (439, 220, 19, 'A');
INSERT INTO `tbl_test_result` VALUES (440, 220, 20, 'B');
INSERT INTO `tbl_test_result` VALUES (441, 220, 21, 'C');
INSERT INTO `tbl_test_result` VALUES (442, 220, 22, 'B');
INSERT INTO `tbl_test_result` VALUES (443, 220, 23, 'A');
INSERT INTO `tbl_test_result` VALUES (444, 220, 24, 'A');
INSERT INTO `tbl_test_result` VALUES (445, 220, 25, 'B');
INSERT INTO `tbl_test_result` VALUES (446, 220, 26, 'A');
INSERT INTO `tbl_test_result` VALUES (447, 220, 27, 'C');
INSERT INTO `tbl_test_result` VALUES (448, 220, 28, 'D');
INSERT INTO `tbl_test_result` VALUES (449, 220, 29, 'D');
INSERT INTO `tbl_test_result` VALUES (450, 220, 30, 'A');
INSERT INTO `tbl_test_result` VALUES (451, 226, 1, 'B');
INSERT INTO `tbl_test_result` VALUES (452, 226, 2, 'C');
INSERT INTO `tbl_test_result` VALUES (453, 226, 3, 'C');
INSERT INTO `tbl_test_result` VALUES (454, 226, 4, 'D');
INSERT INTO `tbl_test_result` VALUES (455, 226, 5, 'B');
INSERT INTO `tbl_test_result` VALUES (456, 226, 6, 'D');
INSERT INTO `tbl_test_result` VALUES (457, 226, 7, 'D');
INSERT INTO `tbl_test_result` VALUES (458, 226, 8, 'D');
INSERT INTO `tbl_test_result` VALUES (459, 226, 9, 'D');
INSERT INTO `tbl_test_result` VALUES (460, 226, 10, 'B');
INSERT INTO `tbl_test_result` VALUES (461, 226, 11, 'D');
INSERT INTO `tbl_test_result` VALUES (462, 226, 12, 'D');
INSERT INTO `tbl_test_result` VALUES (463, 226, 13, 'D');
INSERT INTO `tbl_test_result` VALUES (464, 226, 14, 'C');
INSERT INTO `tbl_test_result` VALUES (465, 226, 15, 'D');
INSERT INTO `tbl_test_result` VALUES (466, 226, 16, 'B');
INSERT INTO `tbl_test_result` VALUES (467, 226, 17, 'C');
INSERT INTO `tbl_test_result` VALUES (468, 226, 18, 'D');
INSERT INTO `tbl_test_result` VALUES (469, 226, 19, 'D');
INSERT INTO `tbl_test_result` VALUES (470, 226, 20, 'A');
INSERT INTO `tbl_test_result` VALUES (471, 226, 21, 'D');
INSERT INTO `tbl_test_result` VALUES (472, 226, 22, 'A');
INSERT INTO `tbl_test_result` VALUES (473, 226, 23, 'A');
INSERT INTO `tbl_test_result` VALUES (474, 226, 24, 'C');
INSERT INTO `tbl_test_result` VALUES (475, 226, 25, 'D');
INSERT INTO `tbl_test_result` VALUES (476, 226, 26, 'A');
INSERT INTO `tbl_test_result` VALUES (477, 226, 27, 'A');
INSERT INTO `tbl_test_result` VALUES (478, 226, 28, 'A');
INSERT INTO `tbl_test_result` VALUES (479, 226, 29, 'D');
INSERT INTO `tbl_test_result` VALUES (480, 226, 30, 'B');
INSERT INTO `tbl_test_result` VALUES (571, 263, 1, 'B');
INSERT INTO `tbl_test_result` VALUES (572, 263, 2, 'B');
INSERT INTO `tbl_test_result` VALUES (573, 263, 3, 'B');
INSERT INTO `tbl_test_result` VALUES (574, 263, 4, 'B');
INSERT INTO `tbl_test_result` VALUES (575, 263, 5, 'B');
INSERT INTO `tbl_test_result` VALUES (576, 263, 6, 'A');
INSERT INTO `tbl_test_result` VALUES (577, 263, 7, 'B');
INSERT INTO `tbl_test_result` VALUES (578, 263, 8, 'B');
INSERT INTO `tbl_test_result` VALUES (579, 263, 9, 'B');
INSERT INTO `tbl_test_result` VALUES (580, 263, 10, 'B');
INSERT INTO `tbl_test_result` VALUES (581, 263, 11, 'B');
INSERT INTO `tbl_test_result` VALUES (582, 263, 12, 'B');
INSERT INTO `tbl_test_result` VALUES (583, 263, 13, 'B');
INSERT INTO `tbl_test_result` VALUES (584, 263, 14, 'B');
INSERT INTO `tbl_test_result` VALUES (585, 263, 15, 'B');
INSERT INTO `tbl_test_result` VALUES (586, 263, 16, 'B');
INSERT INTO `tbl_test_result` VALUES (587, 263, 17, 'B');
INSERT INTO `tbl_test_result` VALUES (588, 263, 18, 'B');
INSERT INTO `tbl_test_result` VALUES (589, 263, 19, 'B');
INSERT INTO `tbl_test_result` VALUES (590, 263, 20, 'B');
INSERT INTO `tbl_test_result` VALUES (591, 263, 21, 'B');
INSERT INTO `tbl_test_result` VALUES (592, 263, 22, 'B');
INSERT INTO `tbl_test_result` VALUES (593, 263, 23, 'B');
INSERT INTO `tbl_test_result` VALUES (594, 263, 24, 'B');
INSERT INTO `tbl_test_result` VALUES (595, 263, 25, 'B');
INSERT INTO `tbl_test_result` VALUES (596, 263, 26, 'B');
INSERT INTO `tbl_test_result` VALUES (597, 263, 27, 'B');
INSERT INTO `tbl_test_result` VALUES (598, 263, 28, 'B');
INSERT INTO `tbl_test_result` VALUES (599, 263, 29, 'B');
INSERT INTO `tbl_test_result` VALUES (600, 263, 30, 'B');
INSERT INTO `tbl_test_result` VALUES (691, 268, 1, 'C');
INSERT INTO `tbl_test_result` VALUES (692, 268, 2, 'B');
INSERT INTO `tbl_test_result` VALUES (693, 268, 3, 'B');
INSERT INTO `tbl_test_result` VALUES (694, 268, 4, 'B');
INSERT INTO `tbl_test_result` VALUES (695, 268, 5, 'B');
INSERT INTO `tbl_test_result` VALUES (696, 268, 6, 'A');
INSERT INTO `tbl_test_result` VALUES (697, 268, 7, 'C');
INSERT INTO `tbl_test_result` VALUES (698, 268, 8, 'C');
INSERT INTO `tbl_test_result` VALUES (699, 268, 9, 'C');
INSERT INTO `tbl_test_result` VALUES (700, 268, 10, 'C');
INSERT INTO `tbl_test_result` VALUES (701, 268, 11, 'C');
INSERT INTO `tbl_test_result` VALUES (702, 268, 12, 'C');
INSERT INTO `tbl_test_result` VALUES (703, 268, 13, 'C');
INSERT INTO `tbl_test_result` VALUES (704, 268, 14, 'C');
INSERT INTO `tbl_test_result` VALUES (705, 268, 15, 'C');
INSERT INTO `tbl_test_result` VALUES (706, 268, 16, 'C');
INSERT INTO `tbl_test_result` VALUES (707, 268, 17, 'C');
INSERT INTO `tbl_test_result` VALUES (708, 268, 18, 'C');
INSERT INTO `tbl_test_result` VALUES (709, 268, 19, 'C');
INSERT INTO `tbl_test_result` VALUES (710, 268, 20, 'C');
INSERT INTO `tbl_test_result` VALUES (711, 268, 21, 'C');
INSERT INTO `tbl_test_result` VALUES (712, 268, 22, 'C');
INSERT INTO `tbl_test_result` VALUES (713, 268, 23, 'C');
INSERT INTO `tbl_test_result` VALUES (714, 268, 24, 'C');
INSERT INTO `tbl_test_result` VALUES (715, 268, 25, 'C');
INSERT INTO `tbl_test_result` VALUES (716, 268, 26, 'C');
INSERT INTO `tbl_test_result` VALUES (717, 268, 27, 'A');
INSERT INTO `tbl_test_result` VALUES (718, 268, 28, 'B');
INSERT INTO `tbl_test_result` VALUES (719, 268, 29, 'A');
INSERT INTO `tbl_test_result` VALUES (720, 268, 30, 'A');
INSERT INTO `tbl_test_result` VALUES (721, 269, 1, 'A');
INSERT INTO `tbl_test_result` VALUES (722, 269, 2, 'A');
INSERT INTO `tbl_test_result` VALUES (723, 269, 3, 'D');
INSERT INTO `tbl_test_result` VALUES (724, 269, 4, 'C');
INSERT INTO `tbl_test_result` VALUES (725, 269, 5, 'B');
INSERT INTO `tbl_test_result` VALUES (726, 269, 6, 'D');
INSERT INTO `tbl_test_result` VALUES (727, 269, 7, 'A');
INSERT INTO `tbl_test_result` VALUES (728, 269, 8, 'A');
INSERT INTO `tbl_test_result` VALUES (729, 269, 9, 'D');
INSERT INTO `tbl_test_result` VALUES (730, 269, 10, 'B');
INSERT INTO `tbl_test_result` VALUES (731, 269, 11, 'C');
INSERT INTO `tbl_test_result` VALUES (732, 269, 12, 'B');
INSERT INTO `tbl_test_result` VALUES (733, 269, 13, 'D');
INSERT INTO `tbl_test_result` VALUES (734, 269, 14, 'C');
INSERT INTO `tbl_test_result` VALUES (735, 269, 15, 'C');
INSERT INTO `tbl_test_result` VALUES (736, 269, 16, 'A');
INSERT INTO `tbl_test_result` VALUES (737, 269, 17, 'D');
INSERT INTO `tbl_test_result` VALUES (738, 269, 18, 'D');
INSERT INTO `tbl_test_result` VALUES (739, 269, 19, 'C');
INSERT INTO `tbl_test_result` VALUES (740, 269, 20, 'B');
INSERT INTO `tbl_test_result` VALUES (741, 269, 21, 'D');
INSERT INTO `tbl_test_result` VALUES (742, 269, 22, 'A');
INSERT INTO `tbl_test_result` VALUES (743, 269, 23, 'D');
INSERT INTO `tbl_test_result` VALUES (744, 269, 24, 'D');
INSERT INTO `tbl_test_result` VALUES (745, 269, 25, 'D');
INSERT INTO `tbl_test_result` VALUES (746, 269, 26, 'D');
INSERT INTO `tbl_test_result` VALUES (747, 269, 27, 'D');
INSERT INTO `tbl_test_result` VALUES (748, 269, 28, 'B');
INSERT INTO `tbl_test_result` VALUES (749, 269, 29, 'C');
INSERT INTO `tbl_test_result` VALUES (750, 269, 30, 'B');
INSERT INTO `tbl_test_result` VALUES (751, 269, 49, 'B');

-- ----------------------------
-- Table structure for tbl_tester
-- ----------------------------
DROP TABLE IF EXISTS `tbl_tester`;
CREATE TABLE `tbl_tester`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '测试者姓名',
  `phone` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '手机号',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '测试时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `tbl_tester_phone_uindex`(`phone`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 270 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '性格测试者' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tbl_tester
-- ----------------------------
INSERT INTO `tbl_tester` VALUES (215, '张无忌', '12345678901', '2021-12-01 11:16:29');
INSERT INTO `tbl_tester` VALUES (216, '张燕豪', '18625637463', '2021-12-01 15:03:05');
INSERT INTO `tbl_tester` VALUES (217, '张三丰', '12332112332', '2021-12-01 15:06:48');
INSERT INTO `tbl_tester` VALUES (218, '高杰领', '18238733106', '2021-12-01 16:50:00');
INSERT INTO `tbl_tester` VALUES (219, '余华龙', '13693666085', '2021-12-01 16:50:56');
INSERT INTO `tbl_tester` VALUES (220, '王龙飞', '15093132818', '2021-12-01 16:50:58');
INSERT INTO `tbl_tester` VALUES (221, '陈聪', '15539589952', '2021-12-01 16:51:03');
INSERT INTO `tbl_tester` VALUES (222, '张三', '12666965495', '2021-12-01 16:51:08');
INSERT INTO `tbl_tester` VALUES (223, '秀儿', '15745248620', '2021-12-01 16:51:09');
INSERT INTO `tbl_tester` VALUES (224, '王昊', '13233835373', '2021-12-01 16:51:13');
INSERT INTO `tbl_tester` VALUES (225, '邵鑫尧', '13015500648', '2021-12-01 16:51:17');
INSERT INTO `tbl_tester` VALUES (226, '张亚洲', '18837256932', '2021-12-01 16:51:21');
INSERT INTO `tbl_tester` VALUES (227, '蒋拥辉', '13148285237', '2021-12-01 16:51:50');
INSERT INTO `tbl_tester` VALUES (232, '夏洛特', '18888811188', '2021-12-01 16:55:17');
INSERT INTO `tbl_tester` VALUES (263, '张三', '12566743243', '2021-12-06 11:06:18');
INSERT INTO `tbl_tester` VALUES (268, '张散发', '13465777886', '2021-12-09 08:59:49');
INSERT INTO `tbl_tester` VALUES (269, '张天师', '18538062907', '2021-12-18 15:29:05');

-- ----------------------------
-- Table structure for tbl_upload
-- ----------------------------
DROP TABLE IF EXISTS `tbl_upload`;
CREATE TABLE `tbl_upload`  (
  `upload_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '即文件ID，为方便识别命名为表名_id',
  `source_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '原文件名',
  `destination_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '服务器文件名',
  PRIMARY KEY (`upload_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 50 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tbl_upload
-- ----------------------------
INSERT INTO `tbl_upload` VALUES (23, '11.jpg', 'https://aaachenjian.oss-cn-beijing.aliyuncs.com/11.jpg');
INSERT INTO `tbl_upload` VALUES (45, '6.jpg', 'https://aaachenjian.oss-cn-beijing.aliyuncs.com/8be914bb-0a10-46f7-bcf4-37a35a7e35a26.jpg');
INSERT INTO `tbl_upload` VALUES (46, '7.jpg', 'https://aaachenjian.oss-cn-beijing.aliyuncs.com/a7902b5e-3855-4a03-a69c-ce0871124bd07.jpg');
INSERT INTO `tbl_upload` VALUES (47, '7.jpg', 'https://aaachenjian.oss-cn-beijing.aliyuncs.com/421fa47f-198d-4a27-9a18-e344ddf23fdc7.jpg');
INSERT INTO `tbl_upload` VALUES (48, '8.jpg', 'https://aaachenjian.oss-cn-beijing.aliyuncs.com/1fdbfa13-36d9-44b0-bae5-b51827cab52e8.jpg');
INSERT INTO `tbl_upload` VALUES (49, '11.jpg', 'https://aaachenjian.oss-cn-beijing.aliyuncs.com/5a8a02f3-bcd3-41ec-865c-bb621a0b6a2911.jpg');

-- ----------------------------
-- Table structure for tbl_user
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `dept_id` int(11) NULL DEFAULT NULL COMMENT '部门ID',
  `login_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '登录账号',
  `user_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户昵称',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '用户邮箱',
  `phonenumber` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '手机号码',
  `sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '用户性别（0男 1女 2未知）',
  `avatar` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '密码',
  `salt` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '盐加密',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '帐号状态（0正常 1停用）',
  `flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户信息表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tbl_user
-- ----------------------------
INSERT INTO `tbl_user` VALUES (1, 102, 'chenjian', '陈建', '86521760@qq.com', '18538062907', '0', 'https://aaachenjian.oss-cn-beijing.aliyuncs.com/myFile/2021/06/19/1624092460466/PIC_20160217_235223_ED0.jpg', '65e2e098e1d4e793cce6ee6c37055bcb', 'b28182ce-5fd3-4cba-a682-5b5e079af720', '0', '0', '陈建', '2021-06-19 16:43:15', '陈建', '2021-07-16 09:50:52', NULL);
INSERT INTO `tbl_user` VALUES (2, 101, 'panlili', '潘黎黎', '86521760@qq.com', '15803826759', '1', NULL, '573149142accfa8d251c964bf7bf67ee', '3633e45f-941d-496f-adb7-255f5e2c565b', '0', '0', '陈建', '2021-06-19 16:49:21', '陈建', '2021-06-19 16:54:32', NULL);
INSERT INTO `tbl_user` VALUES (4, 101, 'tester', '张三', '6587437@qq.com', '18538062909', '0', NULL, '69e4160a3c2252bec53a502388a33d64', '8c2920ca-b3bc-4e64-ad4e-1ab59b4f', '0', '0', '陈建', '2021-12-18 15:20:20', '', NULL, '');

-- ----------------------------
-- Table structure for tbl_user_role
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user_role`;
CREATE TABLE `tbl_user_role`  (
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `role_id` int(11) NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`user_id`, `role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户和角色关联表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of tbl_user_role
-- ----------------------------
INSERT INTO `tbl_user_role` VALUES (1, 1);
INSERT INTO `tbl_user_role` VALUES (2, 1);
INSERT INTO `tbl_user_role` VALUES (3, 2);
INSERT INTO `tbl_user_role` VALUES (4, 3);

SET FOREIGN_KEY_CHECKS = 1;
