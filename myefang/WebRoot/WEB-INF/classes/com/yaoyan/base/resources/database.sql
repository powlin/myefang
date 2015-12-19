
-- ----------------------------
-- Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `menuname` varchar(20) DEFAULT NULL,
  `menulink` varchar(100) DEFAULT NULL,
  `symbol` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '123', '首页', 'myLocation!firstPage', 'Y');
INSERT INTO `menu` VALUES ('2', '123', '房源更新', 'myLocation!houseRefresh', 'Y');
INSERT INTO `menu` VALUES ('3', '123', '搬家联系', 'myLocation!houseMove', 'Y');
INSERT INTO `menu` VALUES ('4', '123', '申请会员', 'myLocation!applyVIP', 'Y');
INSERT INTO `menu` VALUES ('5', '123', '友情链接', 'myLocation!friendlyLink', 'Y');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123', '202CB962AC59075B964B07152D234B70');
