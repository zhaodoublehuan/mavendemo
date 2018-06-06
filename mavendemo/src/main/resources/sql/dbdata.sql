-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` varchar(50) NOT NULL,
  `menu_url` varchar(256) DEFAULT NULL COMMENT '菜单地址',
  `menu_name` varchar(256) DEFAULT NULL COMMENT '菜单名称',
  `level` varchar(2) DEFAULT NULL COMMENT '菜单等级',
  `state` varchar(10) DEFAULT NULL COMMENT '折叠状态',
  `sort` varchar(5) DEFAULT NULL COMMENT '菜单排序',
  `active` varchar(10) DEFAULT NULL COMMENT '菜单状态',
  `leaf` varchar(256) DEFAULT NULL COMMENT '是否子叶节点',
  `description` varchar(256) DEFAULT NULL,
  `parent_id` varchar(50) DEFAULT NULL,
  `insert_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('468b07312445446f8cf909cc671dcef9', 'baidu.com', null, null, null, null, null, null, '添加菜单描述', null, '2017-07-18 09:17:15', '2017-07-18 09:17:15');
INSERT INTO `sys_menu` VALUES ('59dfa0efc3b24a6eaa2bcacea123f0a4', 'baidu.com', '添加菜单描述', null, null, null, null, null, null, null, '2017-05-09 11:16:46', '2017-05-09 11:16:46');
INSERT INTO `sys_menu` VALUES ('7a5404bfd9cc48328bce04a2971f574f', 'baidu.com', null, null, null, null, null, null, '添加菜单描述', null, '2017-05-08 14:22:21', '2017-05-08 14:22:21');

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` varchar(50) NOT NULL,
  `name` varchar(32) NOT NULL COMMENT '名称',
  `description` varchar(256) DEFAULT NULL COMMENT '描述',
  `insert_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES ('538f961ee672407b84189584bee9d758', 'query', '测试权限描述', '2017-04-20 18:05:58', '2017-04-20 18:05:58');
INSERT INTO `sys_permission` VALUES ('5525329b04404f7d9653af3c78ec7596', 'query', '???????????', '2017-04-21 10:18:53', '2017-04-21 10:18:53');
INSERT INTO `sys_permission` VALUES ('5d0f0e84a5514e04ac6789624d4c1da9', 'query', '???????????', '2017-07-18 09:17:15', '2017-07-18 09:17:15');
INSERT INTO `sys_permission` VALUES ('e7de12bddab8402db9c50a4bd37192aa', 'query', '测试权限描述', '2017-04-20 20:03:39', '2017-04-20 20:03:39');
INSERT INTO `sys_permission` VALUES ('ed0ff7b68e8345deacad09aa01db4ddb', 'query', '???????????', '2017-04-21 13:36:51', '2017-04-21 13:36:51');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` varchar(50) NOT NULL,
  `name` varchar(32) NOT NULL COMMENT '名称',
  `description` varchar(256) DEFAULT NULL COMMENT '描述',
  `active` varchar(2) DEFAULT NULL COMMENT '角色状态',
  `insert_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('20206c39f81a4f39a3e76270366364dd', '测试角色', '用来测试的角色', 'Y', '2017-07-18 09:17:17', '2017-07-18 09:17:17');
INSERT INTO `sys_role` VALUES ('2b2733211845403c8a0eafb24f1c276c', '测试角色', '用来测试的角色', 'Y', '2017-05-04 09:25:23', '2017-05-04 09:25:23');
INSERT INTO `sys_role` VALUES ('63ffc310d76d4712b541f8cd94573a40', '测试角色修改', '测试描述修改', 'N', '2017-05-04 08:58:55', '2017-07-18 09:17:17');
INSERT INTO `sys_role` VALUES ('ebf310fc98794466ae30bcea06ab9ada', '111111', '描述', 'Y', '2017-05-04 17:43:46', '2017-05-04 17:43:46');

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` varchar(11) NOT NULL,
  `menu_id` varchar(11) DEFAULT NULL,
  `role_id` varchar(11) DEFAULT NULL,
  `active` varchar(2) DEFAULT NULL,
  `insert_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `role_id` varchar(50) NOT NULL COMMENT '角色id',
  `permission_id` varchar(50) NOT NULL COMMENT '权限id',
  `insert_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(50) NOT NULL,
  `login_no` varchar(50) DEFAULT NULL COMMENT '登录账户',
  `user_name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `password` varchar(32) DEFAULT NULL,
  `salt` varchar(50) DEFAULT NULL COMMENT '加密用的盐',
  `mobile` varchar(16) DEFAULT NULL COMMENT '手机',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `active` varchar(10) DEFAULT NULL COMMENT '用户状态',
  `insert_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('5dd673bede36467da1e620d499a7d782', '111', '111', '1248c38b0d99e1dc19aa03f6c65df94d', 'e8a0f50e9908490185e69e16af2e13ad', null, null, 'Y', '2017-05-12 10:55:25', '2017-05-12 10:55:25');
INSERT INTO `sys_user` VALUES ('62adaad5a3144a4e98b0b9ad05f5e7e1', 'admin', '赵欢欢', 'dfd0e1945036170e4e25e59ee4ae574d', 'e9aeb657c7ed4e1a9d6133e8168ea250', null, null, 'Y', '2017-07-18 09:17:19', '2017-07-18 09:17:19');
INSERT INTO `sys_user` VALUES ('6b09757ac09644f382def02c3e02ee52', '111', '111', 'a2ec0dd5f8a11cd7a133a48ce9e76e4d', '9b444adca3be4de5ba1d28455e49ae62', null, null, 'Y', '2017-05-12 10:41:51', '2017-05-12 10:41:51');
INSERT INTO `sys_user` VALUES ('850e499087144f989e83cf9068d1b370', 'sys', '赵欢欢', '0f91d0d74f1066248edc05eb0bc8bc24', 'c2979bbb0f1740ad8a495b312dd42b72', null, null, 'Y', '2017-04-28 16:14:36', '2017-04-28 16:14:36');
INSERT INTO `sys_user` VALUES ('a24d6e880ba1492ea76b9b75fdb32461', '111', null, '46ad2ca853f521bdd4eaa605e9569490', '73a0073d79b14e04a317e81258eb2b90', null, null, 'Y', '2017-05-12 10:41:19', '2017-05-12 10:41:19');
INSERT INTO `sys_user` VALUES ('b3e7a272e1f3403ba8142d771f795efe', '111', '111', 'e2615095486f2fc9d4e5bcb85c5d8f78', 'a70c13324e06441e88cb6461725464c9', null, null, 'Y', '2017-05-12 10:49:35', '2017-05-12 10:49:35');
INSERT INTO `sys_user` VALUES ('d83fc84f90624ebd983fdc1f9ef67caf', 'zhh', '赵欢欢', '04d57e95bdfb8a74afe8c6533a8b9e7f', 'a995326ee0ae4772a222e0ee7c4d962a', null, null, 'Y', '2017-04-28 16:13:03', '2017-04-28 16:13:03');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `user_id` varchar(50) NOT NULL,
  `role_id` varchar(50) NOT NULL,
  `insert_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `active` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------

-- ----------------------------
-- Table structure for t_wqs_chart
-- ----------------------------
DROP TABLE IF EXISTS `t_wqs_chart`;
CREATE TABLE `t_wqs_chart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_chart` varchar(11) DEFAULT NULL,
  `one` int(11) DEFAULT NULL,
  `two` int(11) DEFAULT NULL,
  `three` int(11) DEFAULT NULL,
  `four` int(11) DEFAULT NULL,
  `five` int(11) DEFAULT NULL,
  `six` int(11) DEFAULT NULL,
  `seven` int(11) DEFAULT NULL,
  `eight` int(11) DEFAULT NULL,
  `nine` int(11) DEFAULT NULL,
  `ten` int(11) DEFAULT NULL,
  `eleven` int(11) DEFAULT NULL,
  `twelve` int(11) DEFAULT NULL,
  `thirteen` int(11) DEFAULT NULL,
  `fourteen` int(11) DEFAULT NULL,
  `fifteen` int(11) DEFAULT NULL,
  `sixteen` int(11) DEFAULT NULL,
  `seventeen` int(11) DEFAULT NULL,
  `eighteen` int(11) DEFAULT NULL,
  `nineteen` int(11) DEFAULT NULL,
  `twenty` int(11) DEFAULT NULL,
  `twenty_one` int(11) DEFAULT NULL,
  `twenty_two` int(11) DEFAULT NULL,
  `twenty_three` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_wqs_chart
-- ----------------------------

-- ----------------------------
-- Table structure for wqs_job_task
-- ----------------------------
DROP TABLE IF EXISTS `wqs_job_task`;
CREATE TABLE `wqs_job_task` (
  `id` varchar(50) NOT NULL,
  `job_name` varchar(50) DEFAULT NULL COMMENT '任务名称',
  `job_group` varchar(50) DEFAULT NULL COMMENT '任务分组',
  `job_status` char(1) DEFAULT NULL COMMENT '任务状态 0禁用 1启用 2删除',
  `cron_expression` varchar(50) DEFAULT NULL COMMENT '任务运行时间表达式',
  `memo` varchar(200) DEFAULT NULL COMMENT '任务描述',
  `job_url` varchar(200) DEFAULT NULL COMMENT 'REST地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wqs_job_task
-- ----------------------------
INSERT INTO `wqs_job_task` VALUES ('1', 'qqq', '1111', '1', '0/2 * * * * ? *', '11', '111111');